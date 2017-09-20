package edu.unlam.ar.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class discoTest {
	
			@Test
			public void testRadioInterior() {
			
			Disco radioInt = new Disco(3, 5);
			
			Integer valorObtenido;
			Integer valorEsperado;

			
			valorObtenido = radioInt.radioInterior(3);
			valorEsperado = 3;
			
			assertEquals(valorEsperado, valorObtenido, 0.01);
	}

			@Test
			public void testRadioExterior() {
			
			Disco radioExt = new Disco();
			
			Double valorObtenido;
			Double valorEsperado;

			
			valorObtenido = radioExt.radioExterior(5.0);		
			valorEsperado = 5.0;
			
			assertEquals(valorEsperado, valorObtenido, 0.01);
}
			
			@Test
			public void testPerimetroInterior(){
				
				Disco perimetroInt = new Disco();
				
				Double valorObtenido;
				Double valorEsperado;
				
				valorObtenido = perimetroInt.perimetroInterior(3.0);
				valorEsperado = 18.84;
				
				assertEquals(valorEsperado, valorObtenido, 0.01);
			}
			
			@Test
			public void TestPerimetroExterior() {
				
				Disco perimetroExt = new Disco();
				
				Double valorObtenido;
				Double valorEsperado;
				
				valorObtenido = perimetroExt.perimetroExterior(5.0);
				valorEsperado = 31.4;
				
				assertEquals(valorEsperado, valorObtenido, 1.0);
				
			}
			
			@Test
			
			public void testSuperficie(){
				
				Disco superficie = new Disco();
				
				Double valorObtenido;
				Double valorEsperado;
				
				valorObtenido = superficie.superficie(5.0);
				valorEsperado = 1962.5;
				
				assertEquals(valorEsperado, valorObtenido, 1.0);
				
			}
}
