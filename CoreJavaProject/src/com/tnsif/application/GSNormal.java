package com.tnsif.application;
import com.tnsif.framework.NormalAcc;
public class GSNormal extends NormalAcc{

	public GSNormal(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
	}

	@Override
	public void bookProduct(float charges) {
		System.out.println("dear normal account user . your product charges are :"+getCharges()+"delivery charges"+getDeliveryCharge());
		
		
	}

}
