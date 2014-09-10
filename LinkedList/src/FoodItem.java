import java.math.BigDecimal;


public class FoodItem {
	String name;
	String description;
	ItemLinkedList <Size>size;
	String servingSize; //serving size i.e. 1case contains 12 items
	BigDecimal basePrice;
	int quantity; //Stocks
	ItemLinkedList <String>specialOrder;
	
	
	public FoodItem(String name, String description, ItemLinkedList<Size> size,
			String servingSize, BigDecimal basePrice, int quantity,
			ItemLinkedList<String> specialOrder) {
		super();
		this.name = name;
		this.description = description;
		this.size = size;
		this.servingSize = servingSize;
		this.basePrice = basePrice;
		this.quantity = quantity;
		this.specialOrder = specialOrder;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ItemLinkedList<Size> getSize() {
		return size;
	}
	public void setSize(ItemLinkedList<Size> size) {
		this.size = size;
	}
	public String getServingSize() {
		return servingSize;
	}
	public void setServingSize(String servingSize) {
		this.servingSize = servingSize;
	}
	public BigDecimal getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public ItemLinkedList<String> getSpecialOrder() {
		return specialOrder;
	}
	public void setSpecialOrder(ItemLinkedList<String> specialOrder) {
		this.specialOrder = specialOrder;
	}
	@Override
	public String toString() {
		return "FoodItem [name=" + name + ", description=" + description
				+ ", size=" + size + ", servingSize=" + servingSize
				+ ", basePrice=" + basePrice + ", quantity=" + quantity
				+ ", specialOrder=" + specialOrder + "]";
	}
	
	
}
