package ar.edu.unlam.pb2;

public class CuentaBancaria {
	
	private Double miSaldo;

	
	public CuentaBancaria(Double miSaldo){
		
		this.miSaldo = miSaldo;
	
	}
	
	public Double extraerCuentaSueldo(Double extraerCuentaSueldo){
		
		this.miSaldo = this.miSaldo - extraerCuentaSueldo;
		return this.miSaldo;
	}

	public Double extraerCajaDeAhorro(Double extraerCajaDeAhorro,Integer contadorCajaDeAhorro){
				
		if(contadorCajaDeAhorro<=4)
		{
		this.miSaldo = this.miSaldo - extraerCajaDeAhorro;
		contadorCajaDeAhorro++;
		}
		else{
			this.miSaldo = this.miSaldo - extraerCajaDeAhorro - 6;
		}
		return this.miSaldo;
	}
	
	public Double extraerCuentaCorriente(Double extraerCuentaCorriente){
		
		if(this.miSaldo<extraerCuentaCorriente)
		{
			this.miSaldo = (this.miSaldo - extraerCuentaCorriente)*5/100;
		}
		else{
			this.miSaldo = this.miSaldo - extraerCuentaCorriente; 
		}
	return this.miSaldo;
	}

	
	
	public Double getMiSaldo() {
		return miSaldo;
	}

	public void setMiSaldo(Double miSaldo) {
		this.miSaldo = miSaldo;
	}

}
	

