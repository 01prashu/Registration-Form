package spring.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.dao.ImplementInterfaceDao;
import spring.dao.SpringConfig;
import spring.model.Student;

@Controller
public class RegisterController {
	
	@RequestMapping("/open")
	public String open()
	{
		System.out.println("open method calls");
		return "open";
	}
	
//	@RequestMapping(value="/handleRegister" , method=RequestMethod.POST)
//	public String handle(@RequestParam("name") String name,
//						@RequestParam("email")String email,
//						@RequestParam("password")String password ,
//						Model model)
//	{
////		System.out.println(name);
////		System.out.println(email);
////		System.out.println(password);
//		model.addAttribute("name", name);
//		model.addAttribute("email", email);
//		model.addAttribute("password", password);
//		return "success";
//	}
	
	@RequestMapping(value="handleRegister" , method = RequestMethod.POST)
	public String handle(@ModelAttribute Student student  , Model model)
	{
//		Student student = new Student();
//		student.setName();
//		student.setEmail();
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class); 
        ImplementInterfaceDao dao = (ImplementInterfaceDao) context.getBean("dao");
        List<Student> asn = dao.getAllMails();
		model.addAttribute("user", student);
		if(dao.isEmailInUse(asn , student.getEmail()))
		{
			model.addAttribute("email_in_use" , true);
			return "open";
		}
		dao.insert(student);
		return "success";
		
	}
}
