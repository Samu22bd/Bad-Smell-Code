package CommentsBefore;

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
	
	// Disini print nama, nim, dan kelas
	public void gamauKasiTauIniApa(Student s) {
		System.out.println("Nama adalah " + s.name + ", NIM adalah " + s.NIM + ", kelasnya " + s.kelas);
	}
}
