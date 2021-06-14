package org.springframework.demo.spring.ioc.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.demo.spring.ioc.domain.User;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author <a href="mailto:zhangpan252@gmail.com">ZhangPan</a>
 * @date 2021/6/13
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		User user = (User)beanFactory.getBean("user");
		user.setName("修改后的User");
		user.setAge(10);
	}

	@Override public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

	}
}
