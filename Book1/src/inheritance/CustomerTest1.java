package inheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.setCustomerID(10010); //protected로 인해 set.~ 으로 불러옴.
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerkim = new VIPCustomer(10020, "김유신", 2);
		customerkim.setCustomerID(10020);
		customerkim.setCustomerName("김유신");
		customerkim.bonusPoint = 10000;
		System.out.println(customerkim.showCustomerInfo());
	}
}
