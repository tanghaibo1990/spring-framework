package org.springframework.tests;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.ClassRelativeResourceLoader;

public class TestClassRelativeResource {
	public static void main(String[] args) {
		ClassRelativeResourceLoader classRelativeResourceLoader = new ClassRelativeResourceLoader(ClassRelativeResourceLoader.class);
		ClassPathResource resource = (ClassPathResource) classRelativeResourceLoader.getResource("ContextResource");
		String des = resource.getDescription();

		System.out.println(resource.toString());

	}
}
