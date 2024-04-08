package parallelInheritanceBefore;

public class LaptopPriceCalculator implements ItemPrice{
	
	Integer discount;
	@Override
	public Integer PriceCalculator(Item I) {
		// TODO Auto-generated method stub
		Laptop L = (Laptop)I;	
		return L.price - discount;
	}

}
