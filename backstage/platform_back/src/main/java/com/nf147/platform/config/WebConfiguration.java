package com.nf147.platform.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ConcurrentTaskExecutor;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.concurrent.Executors;

/**
 * @author Administrator
 */
@Configuration
public class WebConfiguration extends WebMvcConfigurationSupport {

	/**
	 * 跨域资源共享
	 * @param registry
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedHeaders("*")
				.allowedMethods("*")
				.allowedOrigins("*");
	}

	/**
	 * 配置异步支持
	 * @param configurer
	 */
	@Override
	protected void configureAsyncSupport(AsyncSupportConfigurer configurer) {
		//这里说要手动创建线程池要好一些，未理解
		configurer.setTaskExecutor(new ConcurrentTaskExecutor(Executors.newFixedThreadPool(3)));
		configurer.setDefaultTimeout(30000);
	}
}
