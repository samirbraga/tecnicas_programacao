class Plus extends Conta {
	public boolean credito(double credito){ //sobrecarga
		this.saldo = this.saldo + (saldo*1.005);
		return true;
	}

	public boolean debito(double debito){ //sobrecarga
		double resultadoDebito = this.saldo - debito;
		if (resultadoDebito <= 0) {
			return false;
		}
		this.saldo = resultadoDebito;
		return true;

	}

	public String toString(){
		return "Conta XPTO id ="+this.id+"  saldo da conta:"+this.saldo;
	}
}