/*
package app;

import sales.*;

import shop.*;

import test.*;

import java.util.Scanner;

public class Main2 {
 
	private static Scanner scanner;
	
	public static void main(String [] args) {
		int option;
		scanner = new Scanner(System.in);
		do {
			displayMenu(); //Este método te abre el menú
			option = getUserOption(); //Este método abre lo que el usuario haya introducido para hacer el switch, gracias al nextLine();
			switch(option) {
			case 1:
				addClothingItem();
				break;
			case 2: 
				displayInventory();
				break;
			case 3:
				SalesRegister.processSales(null, option);
				break;
			case 4: 
				System.out.println("Saliendo del programa: ");
				break;
			default: 
				System.out.println("Opción no válida. Inténtalo de nuevo.");
			}
		}while (option != 5);
		
		scanner.close();
	}
	
	
	
	public static void displayMenu() {
		System.out.println("*****Bienvenido a Strafalarius*****  Seleccione una opción: ");
		System.out.println("1. Agregar nueva prenda al inventario: ");
		System.out.println("2. Mostrar inventario: ");
		System.out.println("3. Procesar venta: ");
		System.out.println("4. Mostrar estadísticas de venta: ");
		System.out.println("5. Salir: ");
	}
	
	public static void addClothingItem() {
		
		    Scanner scanner = new Scanner(System.in);

		    System.out.print("Introduzca el nombre de la prenda: ");
		    String nombre = scanner.nextLine();

		    System.out.print("Introduzca la talla de la prenda: ");
		    String talla = scanner.nextLine();

		    System.out.print("Introduzca el precio de la prenda: ");
		    double precio = scanner.nextDouble();
		    
		    scanner.close();
		    
		    ClothingItem[][][] ClothingItem;
		    ClothingItem = new ClothingItem[nombre][talla][precio];
            Inventory.addItem(ClothingItem);
	}
	
	public static void displayInventory(){
		System.out.print("Inventario: => itemLength, MAX_SIZE = 100/n");
		System.out.printf("%-20s%-20s%-20s%n", "Nombre", "Precio", "Talla");
		System.out.printf("%-20s%-20.2f%-20s%n", "Calcetines", 5.99, "S");
		System.out.printf("%-20s%-20.2f%-20s%n", "Zapatos", 45.99, "M");
		System.out.printf("%-20s%-20.2f%-20s%n", "Camiseta", 34.00, "S");
	}
	
	public static int getUserOption() {
		System.out.println("Seleccione una opción(1-5)");
		int option = -1;
		try {
			option = Integer.parseInt(scanner.nextLine());
		}catch(NumberFormatException e){
			System.out.println("Error al leer la opción. Inténtelo de nuevo: ");
		}
		
		return option;
	}
}
/*
*/