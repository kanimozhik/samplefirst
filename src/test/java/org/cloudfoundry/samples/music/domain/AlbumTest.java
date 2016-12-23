package org.cloudfoundry.samples.music.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlbumTest {

	Album a = new Album();

	@Test
	public void test() {
		a.setAlbumId("1");
		System.out.println("output : "+a.getAlbumId());
		assertEquals("1",a.getAlbumId());
	
	}
}
