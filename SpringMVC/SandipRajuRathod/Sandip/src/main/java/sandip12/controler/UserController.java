package sandip12.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sandip12.Service.UserService;
import sandip12.model.User;

@Controller
public class  UserController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/home")
	public String userForm() {
		return "userForm";
	}
	
	
	@RequestMapping(path = "/userFormPage",method = RequestMethod.POST)
	public String formShow(@ModelAttribute User user,Model model) {
		System.out.println(user);
		userService.saveUser(user);
		return "userFormOutput";
	}
	
}
