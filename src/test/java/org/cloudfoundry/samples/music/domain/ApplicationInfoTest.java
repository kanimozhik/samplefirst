package org.cloudfoundry.samples.music.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class ApplicationInfoTest {

ApplicationInfo ai = new ApplicationInfo(null, null);
	
	@Test
	public void test() {
		ai.setI("2");
		System.out.println("output2: "+ai.getI());
		assertEquals("",ai.getI());
	}

}
