package loc.example.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ReferraclCodeValidator.class)
public @interface ReferralCode {

	public String prefix() default "REF-";
	
	public String message() default "must start with REF-";
	
	public Class<?>[] groups() default { };
	
	public Class<? extends Payload>[] payload() default { };
}
