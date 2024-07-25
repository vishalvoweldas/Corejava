package com.tnsif.framework;

public interface ShopFactory {
	
	public PrimeAcc getNewPrimeAccount(int Accno, String Accnm, float Charges, boolean isPrime); 
	public NormalAcc getNewNormalAccount(int Accno, String Accnm, float Charges, float deliveryCharge);
}
