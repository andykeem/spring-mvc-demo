package loc.example.springdemo.mvc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import loc.example.springdemo.mvc.model.Country;
import loc.example.springdemo.mvc.model.Log;
import loc.example.springdemo.mvc.model.Student;

@Controller
@RequestMapping(path = "/student")
public class StudentController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, editor);
	}

	@RequestMapping(path = "show-form")
	public String showForm(Model model) {
		
		Student stud = new Student();
		model.addAttribute("student", stud);
		
		List<Country> countryList = getCountryList();
		model.addAttribute("countryList", countryList);
		
		Map<String, String> languages = getProgLanguages();
		model.addAttribute("languages", languages);
		
		List<String> osList = getOperatingSystems();
		model.addAttribute("osList", osList);
		
		return "student/show-form";
	}
	
	@RequestMapping(path = "process-form", method = RequestMethod.POST)
	public String processForm(@Valid @ModelAttribute("student") Student student, 
			BindingResult result) {
		Log.d("student processForm() method called..");
		Log.d("student: " + student);
		if (result.hasErrors()) {
			return "student/show-form";
		}
		return "student/process-form";
	}
	
	private List<Country> getCountryList() {
		return List.of(
			new Country("Brazil", "Brazil"),
			new Country("England", "England"),
			new Country("France", "France"),
			new Country("Germany", "Germany")
		);
	}
	
	@ModelAttribute("languages")
	private Map<String, String> getProgLanguages() {
		Map<String, String> map = new HashMap<>();
		map.put("C#", "C#");
		map.put("Java", "Java");
		map.put("Python", "Python");
		map.put("Ruby", "Ruby");
		return map;
	}
	
	@ModelAttribute("osList")
	private List<String> getOperatingSystems() {
		return List.of("Linux", "Mac OS", "MS Windows");
	}
}
