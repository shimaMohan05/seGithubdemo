package week2;

public class PaymentDetails {

	public void payment(int prize)
	{
		System.out.println("Pay the amount  of "+prize +" at the time of delivery ");
	}
	public void payment(String code,int prize)
	{
		System.out.println("Pay the amount of "+prize+" by Using UPI code "+code);
	}
	public void payment(String bankName,long accountNo,String code,int prize)
	{
		System.out.println("Pay the amount of "+prize+" by internet banking choose the  bank : "+bankName +" then enter the account number : "+accountNo+ " & IFSC code: "+ code);
	}
	public void payment(int prize,long cardNo ,int cvv)
	{
		System.out.println("Pay the amount of "+prize+" by using credit card and enter the credit number: "+cardNo +" and cvv :" +cvv);
	}
	public void payment(long cardNo,int cvv,int prize)
	{
		System.out.println("Pay the amount of "+prize+" by using debit card and enter the credit number: "+cardNo +" and cvv :" +cvv);
	}
}
