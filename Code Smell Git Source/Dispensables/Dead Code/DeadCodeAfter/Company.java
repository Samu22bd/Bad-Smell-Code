package DeadCodeAfter;

import java.util.Vector;

public class Company {
	
	private String companyName;
	private Vector<Worker> workerList;
	
	public Company(String companyName, Vector<Worker> workerList) {
		super();
		this.companyName = companyName;
		this.workerList = workerList;
	}

	public String addWorker(Company C, Worker W) {
		C.workerList.add(W);
		return "Worker added to list";
	}

}
