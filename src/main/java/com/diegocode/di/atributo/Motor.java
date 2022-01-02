/**
 * 
 */
package com.diegocode.di.atributo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Diego
 *
 */

@Component
public class Motor {

	private String marca;
	
	private Integer modelo;
	
	
	public Motor(){
	}

	/**
	 * @param marca
	 * @param modelo
	 */
	
	
	public Motor(String marca, Integer modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	@Value("XL1")
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public Integer getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	@Value("1990")
	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Motor [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
	
	
	
	
	
}
