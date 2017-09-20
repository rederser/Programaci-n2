package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTrabajoPráctico2 {

	@Test
	public void testCuentaSueldo() {
		
		CuentaBancaria miCuentaSueldo = new CuentaBancaria(400.00);
		
		Double valorObtenido = miCuentaSueldo.extraerCuentaSueldo(200.00);
		
		assertEquals(200.00,valorObtenido, 0.01);
	}
	@Test
	public void testCajaDeAhorro() {
		
		//Extrayendo por primera vez.
		
		CuentaBancaria miCajaDeAhorro = new CuentaBancaria(400.00);
		
		Double valorObtenido = miCajaDeAhorro.extraerCajaDeAhorro(200.00, 0);
		
		assertEquals(200.00, valorObtenido, 0.01);
		
		}	
		@Test
		public void testCajaDeAhorro2() {
		
		// Extrayendo mas de 5 veces.
		
		CuentaBancaria miCajaDeAhorro = new CuentaBancaria(400.00);
		
		Double valorObtenido = miCajaDeAhorro.extraerCajaDeAhorro(300.00, 10);
		
		assertEquals(94.00,valorObtenido, 0.01);
		
	}
		@Test
		public void testCuentaCorriente(){
			
			CuentaBancaria miCuentaCorriente = new CuentaBancaria(400.00);
			
			Double valorObtenido = miCuentaCorriente.extraerCuentaCorriente(1000.00);
			
			assertEquals(-30.00,valorObtenido, 0.01);
		}

}
