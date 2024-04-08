package duplicateCodeBefore;

public class CybSec {
	
	private String Name;
	private String NIM;
	protected String khususCyb;
	
	public CybSec(String name, String nIM) {
		super();
		Name = name;
		NIM = nIM;
		khususCyb = "Cyb";
	}

	public void getCybData(CybSec C) {
		System.out.println("Nama adalah " + C.getName());
		System.out.println("NIM adalah  " + C.getNIM());
		System.out.println("Jurusan adalah " + C.khususCyb);
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
