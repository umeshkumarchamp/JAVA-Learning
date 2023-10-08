package app.main.Spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext spc = new ClassPathXmlApplicationContext("beans.xml");
//        Employee e1 = spc.getBean("emp1",Employee.class);
//        Employee e2 = spc.getBean("emp2",Employee.class);
//        System.out.println(e1);
//        System.out.println(e2);
        
        Student s1 = spc.getBean("stu1",Student.class);
//        Student s2 = spc.getBean("stu2",Student.class);
//        Student s3 = spc.getBean("stu3",Student.class);
//        Student s4 = spc.getBean("stu4",Student.class);
        
        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);
    }
}
