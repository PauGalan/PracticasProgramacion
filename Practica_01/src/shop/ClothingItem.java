package shop;


public class ClothingItem{
	
	private String name;
	private double price;
	private char size;
	
	public ClothingItem(String name, double price, char size) {
		super();
		this.name = name;
		this.price = price;
		this.size = size;
		if(size == 'L' || size == 'M' || size == 'S') {
		}else {
			this.size = 'S';
		}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public char getSize() {
		return size;
	}


	public void setSize(char size) {
		this.size = size;
	}


	@Override
	public String toString() {
		return "ClothingItem [name=" + name + ", price=" + price + ", size=" + size + "]";
	}


	public String getItemLength() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
}


