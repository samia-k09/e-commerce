abstract class Payment{

abstract void paymentprocess(double amount);
}
class Creditcard extends Payment{
	void paymentprocess(double amount)
	{
		System.out.println("Processing of payment of RS. "+amount);
	}
}
class Paypal extends Payment{

	void paymentprocess(double amount)
	{
		System.out.println("Processing of payment of RS. "+amount);
	}
}
class Crypto extends Payment{

	void paymentprocess(double amount)
	{
		System.out.println("Processing of payment of RS. "+amount);
	}
}
