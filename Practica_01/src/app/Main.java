package app;

import shop.Inventory;


import test.TestClothingItem; 
import test.TestInventory;
import test.TestSalesRegister;

import sales.SalesRegister;

import java.util.Scanner;

import shop.ClothingItem;

public class Main {
	
	private static Inventory inventory;
	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		int MAX_SIZE = 3; //Establecemos límite máximo de prendas en el inventario
		Inventory inventory = new Inventory(3);
		
		//Añadimos una cuantas prendas al inventario
		ClothingItem item1 = new ClothingItem("Camisa",19,'M');
		ClothingItem item2 = new ClothingItem("Pantalones",15,'L');
		ClothingItem item3 = new ClothingItem("Sudadera",23,'S');
		
		inventory.addItem(item1);
		inventory.addItem(item2);
		inventory.addItem(item3);
		System.out.println(inventory.toString());
		
		//Comprobamos el stock de una prenda
		int stockCount = inventory.checkStock("Camisa", 'M');
		System.out.println("Stock count: " + stockCount);
		
		//Eliminamos una prenda y verificamos que el inventario está en un estado consistente 
		inventory.removeItem("Camisa", 'M');
		System.out.println("Inventario después de eliminar la camisa(Talla M) " + inventory);
		
		//Utilizamos extractItem
		
		/*
		//Añadimos un objeto mas para ver que no puede superar el límite 
		ClothingItem item4 = new ClothingItem("Sombrero", 15, 'S');
		ClothingItem item5 = new ClothingItem("Guantes", 10, 'M');
		
		inventory.addItem(item4);
		inventory.addItem(item5);
		/*
		 * 
		 */
		
		
		//Activar para comprobar tarea 1:
		ClothingItem item = new ClothingItem("Camisa", 25.99, 'M');
		if(item1 != null) {
			TestClothingItem.checkClass(item1.getClass());
		}
		
		//Activar para comprobar tarea 3: 
		Inventory inventory2 = new Inventory(100);
		if(inventory != null) {
			TestInventory.checkClass(inventory.getClass());
		}
		
		TestSalesRegister.checkSalesRegister();
		
		
		
		
	}

}
