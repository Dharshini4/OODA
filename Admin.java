package pos.model;

public class Admin extends UserModel{
	private int userId;
	private String userName;
	private String userMobileNumber;
	private String userAddress;
	@Override
	public void setUserName(String adminName)
	{
		this.userName=adminName;
	}
	
	@Override
	public void setUserMobileNumber(String adminMobileNumber)
	{
		this.userMobileNumber=adminMobileNumber;
	}
	
	@Override
	public void setUserAddress(String adminAddress)
	{
		this.userAddress=adminAddress;
	}
	
	@Override
	public void setUserId(int adminId)
	{
		this.userId=adminId;
	}

}
