package com.cg.application;

import com.cg.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

		public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
			super(accNo, accNm, charges, deliveryCharge);
		
		}

		public void bookProduct(float deliveryCharge) {
			
			System.out.println("Dear Normal User, your charges are: " +getCharges()+
					" and delivery charge is " + deliveryCharge);
		}

		@Override
		public String toString() {
			return "GSNormalAcc [getDeliveryCharge()=" + getDeliveryCharge() + ", toString()=" + super.toString()
					+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
		}
}
