package edu.unlam.ar.pb2;

public class Disco {
	// Perimetro de un circulo:  2*PI*Radio;
	// Superficie:    Pi*Radio^4;
	
	public Integer radioInterior;
	public Integer radioExterior;
	
	public Disco(Integer radioInterior,Integer radioExterior){
		
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
		
	}
	
	public Integer radioInterior(Integer radioInterior){
		
		this.radioInterior = radioInterior;
		return this.radioInterior;
	}

	public Integer radioExterior(Integer radioExterior){
		
		this.radioExterior = radioExterior;
		return this.radioExterior;
	}
	
	public Double perimetroInterior(Double radioInterior){
		
		Double perimetroInterior;
		
		perimetroInterior = 2*Math.PI*radioInterior;
		return perimetroInterior;
	}
	
	public Double perimetroExterior(Double radioExterior){
		
		Double perimetroExterior;
		
		perimetroExterior = 2*Math.PI*radioExterior;
		return perimetroExterior;
	}
	
	public Double superficie(Double radioExterior){
		
		Double superficie;
		
		superficie = Math.PI*(Math.pow(radioExterior,4));
		return superficie;
	}	
}
