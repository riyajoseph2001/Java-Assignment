package Encapsulation;
//Question 2
public class Item {
	private int itemNumber;
	private String itemName;
	private int price;
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [itemNumber=" + itemNumber + ", itemName=" + itemName + ", price=" + price + "]";
	}
	
	

}
