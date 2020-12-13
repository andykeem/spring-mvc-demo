package loc.example.springdemo.mvc.model;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import loc.example.springdemo.mvc.validation.CourseCode;

public class Student {

	private String firstName;
	@NotBlank(message = "Last name field cannot be blank")
	@Size(min = 3, max = 20, message = "Last name must be 3 chars and more")
	private String lastName;
	private String country;
	private String language;
	private List<String> operSystems;
	
	@CourseCode(prefix = "STU-", message = "hey, you must start with STU-")
	private String courseCode;
	
	public Student() {
		language = "";
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String name) {
		firstName = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String name) {
		lastName = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public List<String> getOperSystems() {
		return operSystems;
	}

	public void setOperSystems(List<String> operSystems) {
		this.operSystems = operSystems;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country + ", language="
				+ language + ", operSystems=" + operSystems + ", courseCode=" + courseCode + "]";
	}
}
