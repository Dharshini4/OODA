package pos.model;
import pos.builder.*;

public class PizzaModel {
private Cheese cheese;
private Sauce sauce;
private Crust crust;
private Size size;
private int cookingTime;

public Cheese getCheese() {
    return cheese;
 }
 
 public void setCheese(Cheese cheese) {
    this.cheese = cheese;
 }
 public int getCookingTime() {
	    return cookingTime;
	 }
	 
	 public void setCookingTime(int cookingTime) {
	    this.cookingTime = cookingTime;
	 }

 
 public Sauce getSauce() {
    return sauce;
 }
 
 public void setSauce(Sauce sauce) {
    this.sauce = sauce;
 }

 public Crust getCrust() {
	    return crust;
	 }
	 
 public void setCrust(Crust crust) {
	 this.crust = crust;
	 }

 public Size getSize() {
	    return size;
	 }
	 
public void setSize(Size size) {
	 this.size = size;
	 }

}
