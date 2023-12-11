package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Producto;

public class TestProducto {
	public static void main(String[] args) {
		Producto producto1 = new Producto("Arroz", 0);
		producto1.setPrecio(-250);
		System.out.println("El precio de "+producto1.getNombre()+" es: "+producto1.getPrecio());
		double precioDes = producto1.calcularPrecioPromo(50);
		System.out.println("El precio con descuento es: " + precioDes);
	}
}
