package DataClassBefore;

public class Student {
	
	private String Name;
	private Integer NIM;
	
	public Student(String name, Integer nIM) {
		super();
		Name = name;
		NIM = nIM;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getNIM() {
		return NIM;
	}

	public void setNIM(Integer nIM) {
		NIM = nIM;
	}
	
}
