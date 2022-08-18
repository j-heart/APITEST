package com.example.demo.config;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.ApiInfo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
	
	@Bean
	public Docket apitest() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo"))
				.paths(PathSelectors.ant("/apitest/*"))
				.build()
				.apiInfo(testInfo());
	}

	@SuppressWarnings("deprecation")
	private ApiInfo testInfo() {
		ApiInfo apiInfo = new ApiInfo(
				 "apitest",
	                "",
	                "1.0",
	                "",
	                "",
	                "",
	                ""
	        );
		return apiInfo;
	}
	
	
}
