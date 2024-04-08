package parallelInheritanceAfter;

public class Laptop extends Item{
	
	public Integer discount;
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Integer PriceCalculator(Item I) {
		// TODO Auto-generated method stub
		Laptop L = (Laptop)I;	
		return L.PriceCalculator(I) - discount;
	}
}
