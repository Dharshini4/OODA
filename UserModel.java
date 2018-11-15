package pos.model;


public abstract class UserModel {
	private int userId;
	private String userName;
	private String userMobileNumber;
	private String userAddress;
	
	abstract public void setUserName(String userName);
	abstract public void setUserMobileNumber(String userMobileNumber);
	abstract public void setUserId(int userId);
	abstract public void setUserAddress(String userAddress);
	
	
	public String getUserName(){
	    return userName;		
	 }
	
	public int getUserId(){
	    return userId;		
	 }
	
	public String getUserMobileNumber(){
	    return userMobileNumber;		
	 }
	public String getUserAddress(){
	    return userAddress;		
	 }
	

}
