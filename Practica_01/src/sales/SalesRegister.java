package sales;

import shop.*;

public class SalesRegister { 
	
	private static long totalSalesCount;
	private static double totalSalesAmount;
	
	
	
	public SalesRegister(long totalSalesCount, double totalSalesAmount) {
		super();
		this.totalSalesCount = totalSalesCount;
		this.totalSalesAmount = totalSalesAmount;
	}
    



	public static long getTotalSalesCount() {
		return totalSalesCount;
	}


	public static void setTotalSalesCount(long totalSalesCount) {
		SalesRegister.totalSalesCount = totalSalesCount;
	}


	public static double getTotalSalesAmount() {
		return totalSalesAmount;
	}


	public static void setTotalSalesAmount(double totalSalesAmount) {
		SalesRegister.totalSalesAmount = totalSalesAmount;
	}








	public static ClothingItem processSale(Inventory inventory, String name, char size) {
	    int comprobar = inventory.checkStock(name, size);
	    if (comprobar < 0) {
	        System.out.println("La prenda " + name + " no está en el inventario ");
	        return null;
	    } else {
	        ClothingItem soldItem = inventory.extractItem(inventory, name, size);
	        totalSalesCount++;
	        totalSalesAmount += soldItem.getPrice();
	        System.out.println("Se ha realizado la venta de " + soldItem);
	        return soldItem;
	    }
	}


	
	
	public static void resetTotalSalesCount() {
		totalSalesCount = 0;
	}
	
	
	
	
	public static void resetTotalSalesAmount() {
		totalSalesAmount = 0;
	}
	
	
	
	
	public static String getBalance() {
		System.out.println("Se han vendido " + totalSalesCount + " artículos, y se ha conseguido " + totalSalesAmount + "€ de las ventas ");
		return null;
	}
	
}	
