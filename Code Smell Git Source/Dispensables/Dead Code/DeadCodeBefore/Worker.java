package DeadCodeBefore;

public class Worker {

	private String ID;
	private String name;
	
	public Worker(String iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}
	
	public String dapatGaji() {
		String temp = this.name + " dengan ID " + this.ID + " mendapat gaji";
		return temp;
	}
	
	public String dapatPromosi() {
		String temp = this.name + " dengan ID " + this.ID + " mendapat promosi";
		return temp;
	}
	

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
