import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarPayment_Test {

	@Test
	void test() {
		CarPayment newcar = new CarPayment();
		newcar.setTotalprice(35000);
		newcar.setDownpayment(10000);
		newcar.setIntrate(.08);
		newcar.setLoanlen(60);
		System.out.println("The monthly payment is:"+newcar.monthlypayment());
		System.out.println("The total interest is:"+newcar.totalinterest());
	}


}
