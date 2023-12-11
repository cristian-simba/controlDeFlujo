package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Item;

public class Test {

	public static void main(String[] args) {
		Item item1 = new Item();
		item1.setProductosActuales(20);
		item1.imprimir();
		System.out.println("-----------------------");
		item1.vender(12);
		item1.imprimir();
		System.out.println("-----------------------");
		item1.devolver(2);
		item1.imprimir();
		
		System.out.println("-**********************-");

		Item item2 = new Item();
		item2.setProductosActuales(50);
		item2.imprimir();
		System.out.println("-----------------------");
		item2.vender(15);
		item2.imprimir();
		System.out.println("-----------------------");
		item2.devolver(10);
		item2.imprimir();
	}

}
