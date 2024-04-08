package DataClassAfter;

public class Student {
	
	private String Name;
	private Integer NIM;
	
	public Student(String name, Integer nIM) {
		super();
		Name = name;
		NIM = nIM;
	}

	public void belajar(Student S) {
		System.out.println(S.getName() + ", dengan NIM " + S.getNIM() + " sedang belajar");
	}
	
	public Integer getNimModuloBy6() {
		return NIM % 6;
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
