package com.apress.coupling;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

public class SpringBeansInterfacesDummy implements 
DisposableBean,MessageSourceAware,ApplicationEventPublisherAware,
ResourceLoaderAware,BeanFactoryAware,BeanClassLoaderAware,BeanNameAware,BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("SpringBeansInterfacesDummy postProcessBeforeInitialization");
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("SpringBeansInterfacesDummy postProcessBeforeInitialization");
		return null;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("SpringBeansInterfacesDummy setBeanName("+name+")");
		
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("SpringBeansInterfacesDummy setBeanClassLoader("+classLoader.toString()+")");
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("SpringBeansInterfacesDummy setBeanFactory("+beanFactory+")");
		
	}

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		System.out.println("SpringBeansInterfacesDummy setResourceLoader("+resourceLoader.toString()+")");
		
	}

	@Override
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		System.out.println("SpringBeansInterfacesDummy setApplicationEventPublisher("+applicationEventPublisher.toString()+")");
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		System.out.println("SpringBeansInterfacesDummy setMessageSource("+messageSource.toString()+")");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("SpringBeansInterfacesDummy destroy");
			
	}

}
