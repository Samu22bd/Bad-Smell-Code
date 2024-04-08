package parallelInheritanceAfter;

public class Handphone extends Item{
	
	public Integer discount;

	public Handphone() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Integer PriceCalculator(Item I) {
		// TODO Auto-generated method stub
		Handphone H = (Handphone)I;
		return H.price - discount;
	}

}
