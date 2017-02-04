package kam.jar.radek.spring.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DesplayNameBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In  after initioalization method. Bean name is "+ beanName);		
		return bean ;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In  before initioalization method. Bean name is "+ beanName);
		return bean;
	}

}
