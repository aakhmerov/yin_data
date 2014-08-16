import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.basic.DefaultOAuthProvider;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.Test;


public class OAuthTest {

	@Test
	public void test(){
		OAuthConsumer consumer2 = new CommonsHttpOAuthConsumer("HouseShareKey", "xDvvYYxMSn8EGUGh3uEF");
		
		
		
		try {
			
//			String requestToken = consumer2.getToken();
//			String requestTokenSecret = consumer2.getTokenSecret();
//			
//			consumer2.setTokenWithSecret(requestToken, requestTokenSecret);

			OAuthProvider provider2 = new DefaultOAuthProvider("http://rest.immobilienscout24.de/restapi/security/oauth/request_token",
					"http://rest.immobilienscout24.de/restapi/security/oauth/access_token",
					"http://rest.immobilienscout24.de/restapi/security/oauth/confirm_access");

			provider2.setOAuth10a(true);
			//requestObjectApiWith(consumer2);
			requestObjectApiWithCommonsHttp(consumer2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	private static void requestObjectApiWithCommonsHttp(OAuthConsumer consumer) throws MalformedURLException, IOException, OAuthMessageSignerException,
			OAuthExpectationFailedException, OAuthCommunicationException, UnsupportedEncodingException {
		
		System.out.println("#################################################################################################");
		
		URL url = new URL("http://rest.immobilienscout24.de/restapi/api/search/v1.0/expose/74614359/attachment");
		
		 
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url.toString());
	 
		consumer.sign(request);
		// add request header
		HttpResponse response = client.execute(request);
	 
		System.out.println("Response Code : " 
	                + response.getStatusLine().getStatusCode());
	 
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
	 
		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		
		
		
		System.out.println("URL Content... \n" + result);
		System.out.println("#################################################################################################");
		}
	
	private static void requestObjectApiWith(OAuthConsumer consumer) throws MalformedURLException, IOException, OAuthMessageSignerException,
	OAuthExpectationFailedException, OAuthCommunicationException, UnsupportedEncodingException {

		System.out.println("#################################################################################################");
		
		URL url = new URL("http://rest.immobilienscout24.de/restapi/api/search/v1.0/expose/74614359");
		
		HttpURLConnection apiRequest = (HttpURLConnection) url.openConnection();
		
		consumer.sign(apiRequest);
		System.out.println("Sending request...");
		
		apiRequest.connect();
		System.out.println("Expiration " + apiRequest.getExpiration());
		System.out.println("Timeout " + apiRequest.getConnectTimeout());
		System.out.println("URL " + apiRequest.getURL());
		System.out.println("Method " + apiRequest.getRequestMethod());
		
		System.out.println("Response: " + apiRequest.getResponseCode() + " " + apiRequest.getResponseMessage());
		
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(apiRequest.getInputStream()));
		String inputLine;
		StringBuffer html = new StringBuffer();
		
		while ((inputLine = in.readLine()) != null) {
		html.append(inputLine);
		}
		in.close();
		
		System.out.println("URL Content... \n" + html.toString());
		System.out.println("#################################################################################################");
}
}
