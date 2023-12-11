package com.cmc.repaso.entidades;

public class Validacion {
	public boolean validarMonto(int valor) {
		if(valor > 0) {
			return true;
		}else {			
			return false;
		}
	}
}
