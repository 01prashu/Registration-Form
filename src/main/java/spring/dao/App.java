package spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.model.Student;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        ImplementInterfaceDao dao = (ImplementInterfaceDao) context.getBean("dao");
        List<Student> asn = dao.getAllMails();
        System.out.println(asn);
        ArrayList<String> mails = new ArrayList<>();
        for(Student stud:asn)
        {
        	mails.add(stud.getEmail());
        }
        System.out.println(mails);
//        
//        
//        
//        int r = dao.insert(stud1);
//        System.out.println(r);

        
        // You might want to add further operations on stud1 here, like dao.save(stud1)
    }
}
