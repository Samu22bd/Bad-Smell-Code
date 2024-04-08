package duplicateCodeBefore;

public class ComSci {

	private String Name;
	private String NIM;
	protected String khususCom;

	public ComSci(String name, String nIM) {
		super();
		Name = name;
		NIM = nIM;
		khususCom = "Com";
	}

	public void getComData(ComSci C) {
		System.out.println("Nama adalah " + C.getName());
		System.out.println("NIM adalah  " + C.getNIM());
		System.out.println("Jurusan adalah " + C.khususCom);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getNIM() {
		return NIM;
	}

	public void setNIM(String nIM) {
		NIM = nIM;
	}
}
