package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {
	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante("Carlos");
		System.out.print(estudiante1.getNombre() + " el resultado de la nota es: ");
		estudiante1.calificar(20);
	}
}
