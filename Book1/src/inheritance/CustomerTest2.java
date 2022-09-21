package inheritance;

public class CustomerTest2 {
	public static void main(String[] args) {
		VIPCustomer customerkim = new VIPCustomer(10010, "김유신", 1);
		customerkim.bonusPoint = 10000;
		System.out.println(customerkim.showCustomerInfo());
	}
}
