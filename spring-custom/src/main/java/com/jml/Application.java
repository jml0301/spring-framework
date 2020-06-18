package com.jml;

import com.jml.config.AppConfig;
import com.jml.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args) {


		// asd

		// apoplciations

		AnnotationConfigApplicationContext ann = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexService indexService = (IndexService) ann.getBean("indexService");
		indexService.query();
	}
}
