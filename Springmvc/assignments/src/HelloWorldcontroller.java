package comin28minutes.Assignment1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HelloWorldcontroller {
	@RequestMapping(value="/AssignmentQ1",method=RequestMethod.GET)
	public String showweb() {
		return "helloWorld";
	}

}
