package pos.model;

public class Customer extends UserModel {
	private int userId;
	private String userName;
	private String userMobileNumber;
	private String userAddress;
	@Override
	public void setUserName(String customerName)
	{
		this.userName=customerName;
	}
	
	@Override
	public void setUserMobileNumber(String customerMobileNumber)
	{
		this.userMobileNumber=customerMobileNumber;
	}
	
	@Override
	public void setUserAddress(String customerAddress)
	{
		this.userAddress=customerAddress;
	}
	
	@Override
	public void setUserId(int customerId)
	{
		this.userId=customerId;
	}



}
