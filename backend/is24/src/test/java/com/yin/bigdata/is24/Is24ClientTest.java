package com.yin.bigdata.is24;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/test-context.xml"})
public class Is24ClientTest {

	@Autowired
	private Is24Client client;
	
	@Test
	public void testLoad(){
		List<String> s = client.getExposees("1276003001046");
		for(String id :s ){
			REExpose ret=  client.getExposeData("http://www.immobilienscout24.de/expose/" + id);
			if(ret != null){
				System.out.println(ret.getConstrYear());
			}
		}
	}
	
//	@Test
	public void test() throws Exception{
		
		
		InputStream mitte1 = this.getClass().getResourceAsStream("/mitte1.txt");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(mitte1));
		String line = null;

//		while((line = in.readLine()) != null) {
		REExpose ret=  client.getExposeData("http://www.immobilienscout24.de/expose/76111956");
//}
		System.out.println(ret.getConstrYear());
	}
}
