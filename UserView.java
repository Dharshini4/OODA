package pos.view;
public class UserView {
	/**
	 *@param userId Id of the user
	 *@param userName Name of the user
	 *@param userMobileNumber Mobile number of the user
	 *@param userAddress Address of the user
	 */

	public void printUserDetails(int userId,String userName,String userMobileNumber, String userAddress ){
	      System.out.println("User Details: ");
	      System.out.println("User name: "+userName);
	      System.out.println("User Id: "+userId);
	      System.out.println("User mobile number: "+userMobileNumber);
	      System.out.println("User address: "+userAddress);
	}

}
