class Extreme extends Conta {
	public abstract credito (double credito) {
		this.saldo = this.saldo + credito+(credito*0.002);
	}

	public abstract debito (double debito) {
		double novoDebito = debido-(credito*0.002);
		if (this.saldo-novoDebido < 0) {
			return false;
		}

		this.saldo = this.saldo - debido-(credito*0.002);
		return true;
	}
}