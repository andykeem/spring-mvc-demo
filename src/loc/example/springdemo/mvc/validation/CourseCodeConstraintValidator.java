package loc.example.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
		implements ConstraintValidator<CourseCode, String> {
	
	private String prefix;

	@Override
	public void initialize(CourseCode constraintAnnotation) {
		// TODO Auto-generated method stub
		ConstraintValidator.super.initialize(constraintAnnotation);
		prefix = constraintAnnotation.prefix();
	}

	@Override
	public boolean isValid(String userInput, ConstraintValidatorContext ctx) {
		// TODO Auto-generated method stub
		if (userInput != null && userInput.startsWith(prefix)) {
			return true;
		}		
		return false;
	}
}
