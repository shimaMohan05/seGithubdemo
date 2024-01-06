package week2;

public class PaymentMain {

	public static void main(String[] args) {
		PaymentDetails pd=new PaymentDetails();
		
		pd.payment(10000);
		
		pd.payment("HDFC", 120045678912345l, "HDF2345566", 24567);
		
	    pd.payment(2000, 1234567890234l, 122);
	    
	    pd.payment(12345678904567l, 312, 4556878);
	    
	    pd.payment("IDF1234578", 5678);

	}

}
