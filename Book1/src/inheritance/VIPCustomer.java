package inheritance;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	
	@Override
	public int calcPrice(int price) {
		return super.calcPrice(price);
	}

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + "담당 상담원 아이디는" + agentID + "입니다";
	}
	
}
