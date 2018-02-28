/**
 * 
 */

/**
 * @author kylee
 *
 */


public class CarPayment {
private int downpayment;
private int loanlen;
private double intrate;
private int totalprice;
private int totalborrowed;
private double monthlypayment;
private double x;
private double y;

public CarPayment() {}
	public double monthlypayment() {
	this.totalborrowed = this.totalprice - this.downpayment;
	this.x = (this.intrate/12)*this.totalborrowed;
	this.y = 1- (1/Math.pow((1+ (this.intrate/12)), this.loanlen));
	this.monthlypayment = (this.x/this.y);
	return Math.round((this.monthlypayment*100)/100.0);
	}
	public double totalinterest() {
		return Math.round((this.monthlypayment*this.loanlen)*100)/100.0;
		
}

public void setDownpayment(int downpayment) {
	this.downpayment = downpayment;
}

public void setLoanlen(int loanlen) {
	this.loanlen = loanlen;
}

public void setIntrate(double intrate) {
	this.intrate = intrate;
}

public void setTotalprice(int totalprice) {
	this.totalprice = totalprice;
}
	
	

}
