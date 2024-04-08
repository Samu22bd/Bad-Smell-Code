package duplicateCodeAfter;

public class ComSci extends Mahasiswa{

	private String khususCom;

	public ComSci(String name, String nIM, String khususCom) {
		super(name, nIM);
		this.khususCom = khususCom;
	}

	public void printCom() {
		System.out.println("Jurusan adalah" + this.khususCom);
	}

	public String getKhususCom() {
		return khususCom;
	}

	public void setKhususCom(String khususCom) {
		this.khususCom = khususCom;
	}
	
}
