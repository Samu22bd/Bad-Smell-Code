package SpeculativeGeneralityBefore;

public class Vehicle {
	
	private String name;
	private String engine;
	private Integer fuel;
	
	private String sayap;
	
	public Vehicle(String name, String engine, Integer fuel) {
		super();
		this.name = name;
		this.engine = engine;
		this.fuel = fuel;
	}
	
	public void spesifikasiMobil(Vehicle V) {
		System.out.println("Nama mobil adalah " + V.name + " dengan mesin" + V.engine);
	}

	public void terbang(String sayap) {
		System.out.println("Suatu saat sayap" + sayap + "akan membuat mobil terbang, let's gooo");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public Integer getFuel() {
		return fuel;
	}

	public void setFuel(Integer fuel) {
		this.fuel = fuel;
	}

	public String getSayap() {
		return sayap;
	}

	public void setSayap(String sayap) {
		this.sayap = sayap;
	}
}
