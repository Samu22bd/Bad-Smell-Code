package parallelInheritanceBefore;

public class HandphonePriceCalculator implements ItemPrice{

	Integer discount;
	@Override
	public Integer PriceCalculator(Item I) {
		// TODO Auto-generated method stub
		Handphone H = (Handphone)I;
		return H.price - discount;
	}


}
