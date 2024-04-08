package CommentsAfter;

public class Student {

	private String name;
	private String NIM;
	private String kelas;
	
	public Student(String name, String nIM, String kelas) {
		super();
		this.name = name;
		NIM = nIM;
		this.kelas = kelas;
	}

	public void printNamaNimKelas(Student s) {
		System.out.println("Nama adalah " + s.name + ", NIM adalah " + s.NIM + ", kelasnya " + s.kelas);
	}
	
}
