package pos.model;

public class Customer extends UserModel {
	private int userId;
	private String userName;
	private String userMobileNumber;
	private String userAddress;

	@Override
	public String getUserName(){
	    return userName;		
	 }
	
	@Override
	public int getUserId(){
	    return userId;		
	 }
	
	@Override
	public String getUserMobileNumber(){
	    return userMobileNumber;		
	 }
	@Override
	public String getUserAddress(){
	    return userAddress;		
	 }
	
}
