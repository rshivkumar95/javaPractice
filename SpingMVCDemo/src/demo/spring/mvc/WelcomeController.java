package demo.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("welcome")
	public ModelAndView welcome()
	{
		String msg="Welcome Spring MVC Architecture";
		return new ModelAndView("welcome","msg",msg);
	}

}
