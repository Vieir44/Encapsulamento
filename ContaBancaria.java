package encapsulamento;

public class ContaBancaria {
	
	private double saldo;
	
	public ContaBancaria(double saldoinicial) {
		if(saldoinicial >= 0) {
			this.saldo = saldoinicial;
		}
		else {
			this.saldo = 0;
		}
		
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
		}
		else {
			System.out.println("Valor do depósito válido!");
		
		}
	}
     public void sacar(double valor) {
    	 if(valor > 0 && valor <= saldo) {
    		 saldo -= valor;
    	 }
    	 else {
    		 System.out.println("Saque inválido! Verifique o valor.");
    	 }
     }
	

	}


