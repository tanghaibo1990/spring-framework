package org.springframework.tests;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.UrlResource;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.ByteBuffer;

public class TestUrlResource {
	public static void main(String[] args) throws IOException {
		UrlResource urlResource = (UrlResource) new DefaultResourceLoader().getResource("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.jj20.com%2Fup%2Fallimg%2F4k%2Fs%2F02%2F2109242332225H9-0-lp.jpg");

		byte[] b = new byte[1024];
		FileOutputStream fileOutputStream = new FileOutputStream("D://abc.jpg");
		InputStream inputStream = urlResource.getInputStream();
		int i = 0;
		while ((i = inputStream.read(b)) > -1) {
			fileOutputStream.write(b, 0, i);
		}
		fileOutputStream.close();
		inputStream.close();
	}
}
