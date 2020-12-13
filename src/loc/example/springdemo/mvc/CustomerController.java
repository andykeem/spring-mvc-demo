package loc.example.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import loc.example.springdemo.mvc.model.Customer;
import loc.example.springdemo.mvc.model.Log;

@Controller
@RequestMapping(path = "customer")
public class CustomerController {
	
	@RequestMapping(path = "show-form")
	public String showForm(Model model) {
		Log.d("CustomerController.showForm() method called..");
		model.addAttribute(new Customer());
		return "customer/show-form";
	}
	
	@RequestMapping(path = "process-form", method = RequestMethod.POST)
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, 
			BindingResult result) {
		Log.d("CustomerController.processForm() method called..");
		Log.d("posted customer: " + customer);
		Log.d("BindingResult: " + result);
		if (result.hasErrors()) {
			return "customer/show-form";
		}
		return "customer/process-form";
	}
}
