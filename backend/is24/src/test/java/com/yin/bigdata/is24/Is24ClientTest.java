package com.yin.bigdata.is24;

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
	public void test() throws Exception{
		
		client.getExposeData("http://www.immobilienscout24.de/expose/74831504?referrer=RESULT_LIST_LISTING&navigationServiceUrl=%2FSuche%2Fcontroller%2FexposeNavigation%2Fnavigate.go%3FsearchUrl%3D%2FSuche%2FS-T%2FHaus-Kauf%2FBerlin%2FBerlin%26exposeId%3D74831504&navigationHasPrev=false&navigationHasNext=true&navigationBarType=RESULT_LIST&searchId=91158670-1412-364c-ac92-a27d1aa9bcb1&resultListPosition=1");
	}
}
