package application;

import java.util.Scanner;

import controller.CartController;
import view.Menu;

public class Program {

	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		CartController controller = new CartController();
		Menu menu = new Menu(controller);
		menu.showMenu(scanner);	
		
	}
}
