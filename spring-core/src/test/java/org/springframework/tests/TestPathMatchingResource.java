package org.springframework.tests;

import org.springframework.core.io.FileSystemResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestPathMatchingResource {
	public static void main(String[] args) throws IOException {
		PathMatchingResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver(new FileSystemResourceLoader());
		Resource[] resources = resourcePatternResolver.getResources("D://morning_*.jpg");
		for (Resource resource : resources) {
			System.out.println(resource.getDescription());
		}

		PathMatchingResourcePatternResolver resourcePatternResolver1=new PathMatchingResourcePatternResolver();
		Resource[] resources1=resourcePatternResolver1.getResources("classpath*:");
		for(Resource resource:resources1){
			System.out.println(resource.getDescription());
		}
	}

}
