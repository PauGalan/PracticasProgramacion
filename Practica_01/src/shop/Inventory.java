package shop;

import shop.ClothingItem;
import java.util.Arrays;

public class Inventory {
	
	private ClothingItem[] items;
	private static int MAX_SIZE;
	private int itemLength; //Nos indica cuantas prendas hay 
	
    public  Inventory(int MAX_SIZE) {
		super();
		this.MAX_SIZE = MAX_SIZE;
		itemLength = 0;
		items = new ClothingItem[MAX_SIZE];
	}

    
	public ClothingItem[] getItems() {
		return items;
	}


	public void setItems(ClothingItem[] items) {
		this.items = items;
	}


	public static int getMAX_SIZE() {
		return MAX_SIZE;
	}


	public static void setMAX_SIZE(int MAX_SIZE) {
		MAX_SIZE = MAX_SIZE;
	}


	public int getItemLength() {
		return itemLength;
	}


	public void setItemLength(int itemLength) {
		this.itemLength = itemLength;
	}








	public int getItemCount(int getItemLength) {
		return itemLength;
	}
	//Método para contar cuantas prendas hay
	
	
	
	
	public int getPos(ClothingItem name) {
		for(int i = 0; i < itemLength; i++) {
			if(items[i] != null && items[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public void addItem(ClothingItem item) {
		int pos = getPos(item.getName());
		if(pos > 0) {
			System.out.println("La prenda " + item.getName() + " con talla " + item.getSize() + " ya está registrada");
		}else {
			items[itemLength] = item;
			itemLength++;
			System.out.println("*********************************************");
			System.out.println("Prenda " + item.getName() + " con talla " + item.getSize() + " y precio " + item.getPrice() + " se ha registrado correctamente ");
			System.out.println("*********************************************");
		}

	}//Método para añadir una prenda
	
	
	
	
	public int getPos(String name) {
		for(int i = 0; i < itemLength; i++) {
			if(items[i] != null && items[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public int checkStock(String name, char size) {
		int pos = getPos(name);
		if(pos >= 0 && items[pos].getSize() == size) {
			System.out.println("Hay stock de la prenda " + name + " con la talla " + size);
			return pos;
		}else {
			System.out.println("No hay stock para esta prenda ");
			return -1;
		}
		
	}//Método para saber si hay stock de una prenda
	
	
	
	
	public void removeItem(String name, char size){
		int pos = getPos(name);
		if(pos < 0) {
			System.out.println("La prenda " + name + " no está en el inventario ");
		}else {
			int i = getPos(name);
			for(int j = i + 1; j < itemLength; j++) {
				items[j - 1] = items[j];
			}
		}
		itemLength--;
	}//Método para eliminar prenda del inventario
	
	
	
	
	private int getPos2(char size) {
		for(int i = 0; i < itemLength; i++) {
			if(items[i] != null && items[i].getSize()==(size)) {
				return i;
			}else {
				System.out.println("");
			}
		}
		return itemLength;
	}
	public ClothingItem extractItem(Inventory inventory, String name, char size) {
	    int pos = getPos(name);
	    if (pos >= 0 && items[pos].getSize() == size) {
	        ClothingItem item = items[pos];
	        for (int j = pos + 1; j < itemLength; j++) {
	            items[j - 1] = items[j];
	        }
	        itemLength--;
	        return item;
	    }
	    return null;
        }//Método para encontrar una prenda, dados su name y size, devolverá el objeto ClothingItem
    


	
	@Override
	public String toString() {
		return "Inventory [items=" + Arrays.toString(items) + ", MAX_SIZE=" + MAX_SIZE + ", itemLength=" + itemLength
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	
	


	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
