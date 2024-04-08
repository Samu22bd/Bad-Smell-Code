package duplicateCodeAfter;

public class Mahasiswa {
	
	private String Name;
	private String NIM;

	public Mahasiswa(String name, String nIM) {
		super();
		Name = name;
		NIM = nIM;
	}

	public void getData() {
		System.out.println("Nama adalah " + this.getName());
		System.out.println("NIM adalah  " + this.getNIM());	
		if(this instanceof ComSci) {
			ComSci C = (ComSci)this;
			C.getKhususCom();
		}else {
			CybSec C = (CybSec)this;
			C.getKhususCyb();
		}
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
