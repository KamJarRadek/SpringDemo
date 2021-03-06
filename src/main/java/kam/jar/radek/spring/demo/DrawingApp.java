package kam.jar.radek.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		Triangle triangle = (Triangle) factory.getBean("triangle");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Line line = (Line) context.getBean("line"); 

		line.draw(); 
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		SecondTriangleClass secondTriangle = (SecondTriangleClass) context.getBean("secondTriangle");
		secondTriangle.draw();
		
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
	}
}
 