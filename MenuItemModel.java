package pos.model;

public class MenuItemModel {
	private String itemId;
	private String itemName;
	private String itemPrice;
	private String size; 
	private String cookingTime;

/**
 * Class default constructor	
 */
	public MenuItemModel()
	{
		this.itemId=null;
		this.itemName=null;
		this.itemPrice=null;
		this.cookingTime=null;
	}

	/**
	 * Class parameterized constructor	
	 */
	
	public MenuItemModel(String itemId, String itemName, String itemPrice, String cookingTime)
	{
		this.itemId=itemId;
		this.itemName=itemName;
		this.itemPrice=itemPrice;
		this.cookingTime=cookingTime;
	}
	
	public String getItemPrice() {
	    return itemPrice;
	 }
	
	public void setItemPrice(String itemPrice) {
    this.itemPrice = itemPrice;
 }
 
 public String getItemName() {
    return itemName;
 }
 
 public void setItemName(String itemName) {
    this.itemName = itemName;
 }

 public String getItemId() {
	    return itemId;
	 }
	 
 public void setItemId(String itemId) {
	 this.itemId = itemId;
	 }

 public String getCookingTime() {
	    return cookingTime;
	 }
	 
public void setCookingTime(String cookingTime) {
	 this.cookingTime=cookingTime;
	 }

  public String getSize() {
	    return size;
	 }
	 
public void setSize(String size) {
	 this.size = size ;
	 }

 public String toString(){
	 if (size != null)
	 {
		 return(size+"\t"+itemId+"\t"+itemName+"\t"+itemPrice+"\t"+cookingTime);
	 }
	 else
	 {
		 return(itemId+"\t"+itemName+"\t"+itemPrice+"\t"+cookingTime);
	 }
 }

}
