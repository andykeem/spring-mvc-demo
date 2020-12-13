package loc.example.springdemo.mvc.model;

public class Country {
	
	private String label;
	private String value;
	
	public Country(String label, String value) {
		this.label = label;
		this.value = value;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Country [label=" + label + ", value=" + value + "]";
	}
}
