class Plus extends Conta {
	public boolean credito(double credito){ //sobrecarga
		this.saldo = this.saldo + (saldo*1.005);
		return true;
	}

	public boolean debito(double debito){ //sobrecarga
		resultadoDebito = this.saldo - debito;
		if (resultadoDebito <= 0) {
			return false;
		}
		this.saldo = resultadoDebito;
		return true;

	}
}