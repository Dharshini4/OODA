package pos.controller;
import pos.model.UserModel;
import pos.view.UserView;

public class UserController {
	private UserModel model;
	private UserView view;
	/**
	 * Class Constuctor
	 */
	
	public UserController(UserModel model, UserView view){
	      this.model = model;
	      this.view = view;
	   }
	public void UserModelUserId(int userId){
	      model.setUserId(userId);		
	   }

	public int getUserId(){
	      return model.getUserId();		
	   }

	
	public void UserModelUserName(String userName){
	      model.setUserName(userName);		
	   }

	public String getUserName(){
	      return model.getUserName();		
	   }
	public void UserModelUserMobileNumber(String userMobileNumber){
	      model.setUserMobileNumber(userMobileNumber);		
	   }

	public String getUserMobileNumber(){
	      return model.getUserMobileNumber();		
	   }
	public void UserModelUserAddress(String userAddress){
	      model.setUserAddress(userAddress);		
	   }

	public String getUserAddress(){
	      return model.getUserAddress();		
	   }

	public void updateView(){				
	      view.printUserDetails(model.getUserId(),model.getUserName(),model.getUserMobileNumber(),model.getUserAddress());
	   }



}
