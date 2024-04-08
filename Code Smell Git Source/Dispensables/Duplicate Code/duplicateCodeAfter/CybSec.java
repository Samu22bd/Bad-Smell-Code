package duplicateCodeAfter;

public class CybSec extends Mahasiswa {

	private String khususCyb;

	public CybSec(String name, String nIM, String khususCyb) {
		super(name, nIM);
		this.khususCyb = khususCyb;
	}
	
	public void printCyb() {
		System.out.println("Jurusan adalah" + this.khususCyb);
	}
	
	public String getKhususCyb() {
		return khususCyb;
	}

	public void setKhususCyb(String khususCyb) {
		this.khususCyb = khususCyb;
	}

}
