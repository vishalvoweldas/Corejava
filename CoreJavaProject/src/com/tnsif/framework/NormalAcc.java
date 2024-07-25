package com.tnsif.framework;
public abstract class NormalAcc extends ShopAcc{
	
	private float deliveryCharge;
	
	public void bookproduct(float charges) {
		
	}

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		this.deliveryCharge = deliveryCharge;
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + "]";
	}

	public float getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(float deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}

	
	

}
