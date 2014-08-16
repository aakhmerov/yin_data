package com.yin.bigdata.is24;

import java.net.URI;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.basic.DefaultOAuthProvider;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

public class Is24OauthHttpComponentsClientHttpRequestFactory extends HttpComponentsClientHttpRequestFactory implements InitializingBean{

	private static final Logger LOGGER = LoggerFactory.getLogger(Is24OauthHttpComponentsClientHttpRequestFactory.class);
	
	/**
	 * The secret
	 */
	private String key;
	/**
	 * the key
	 */
	private String secret;
	
	
	private OAuthConsumer oauthConsumer;
	
	public Is24OauthHttpComponentsClientHttpRequestFactory(HttpClient httpClient) {
		super(httpClient);
	}
	
	@Override
	public void afterPropertiesSet() throws Exception{
		oauthConsumer = new CommonsHttpOAuthConsumer(key, secret);
		
		
		
		try {
			
			String requestToken = oauthConsumer.getToken();
			String requestTokenSecret = oauthConsumer.getTokenSecret();
			
			oauthConsumer.setTokenWithSecret(requestToken, requestTokenSecret);
	
//			OAuthProvider provider = new DefaultOAuthProvider("http://rest.immobilienscout24.de/restapi/security/oauth/request_token",
//					"http://rest.immobilienscout24.de/restapi/security/oauth/access_token",
//					"http://rest.immobilienscout24.de/restapi/security/oauth/confirm_access");
//	
//			provider.setOAuth10a(true);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	


	@Override
	protected HttpUriRequest createHttpUriRequest(HttpMethod httpMethod, URI uri) {
		
		HttpUriRequest request = super.createHttpUriRequest(httpMethod, uri);
	
		try {
			oauthConsumer.sign(request);
		} catch (OAuthMessageSignerException e) {
			LOGGER.error("singing error", e);
		} catch (OAuthExpectationFailedException e) {
			LOGGER.error("general error", e);
		} catch (OAuthCommunicationException e) {
			LOGGER.error("communication error", e);
		}
		
		return request;
	}
	
	
	public String getKey() {
		return key;
	}

	@Required
	public void setKey(String key) {
		this.key = key;
	}

	public String getSecret() {
		return secret;
	}
	
	@Required
	public void setSecret(String secret) {
		this.secret = secret;
	}
}
