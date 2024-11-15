package springMvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springMvc.models.Student;

@Controller

public class homeController  {

	
	
	@RequestMapping("/Form")
	public String showFrom(Model m) {
		m.addAttribute("Desc", "Password Must Be Integer");
		return "Form";
	}
	
	
	@RequestMapping(path = "/registrationForm", method = RequestMethod.POST)
 public String handleForm(@ModelAttribute Student student,Model model) {
	
		System.out.println(student);

		return "FormOutput";

 }


	
	
	
	
}
