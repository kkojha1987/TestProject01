package Pack01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
	
	BeanFactory context=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
	
	Employee employee1=(Employee)context.getBean("employee");
   System.out.println(employee1.getName());
	}

}
