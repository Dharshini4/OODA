package pos.model;


public abstract class UserModel {
	private int userId;
	private String userName;
	private String userMobileNumber;
	private String userAddress;
	
	abstract public String getUserName();
	abstract public String getUserMobileNumber();
	abstract public int getUserId();
	abstract public String getUserAddress();
	
	public void setUserName(String userName)
	{
		this.userName=userName;
	}

	public void setUserMobileNumber(String userMobileNumber)
	{
		this.userMobileNumber=userMobileNumber;
	}
	
	
	public void setUserAddress(String userAddress)
	{
		this.userAddress=userAddress;
	}
	
	
	public void setUserId(int userId)
	{
		this.userId=userId;
	}


	

}
