public abstract class Conta {
	private static int numeroDeContas;
	protected int id;
	protected double saldo;

	public Conta(int id){

		this.saldo = 0;
		this.id = id;
		numeroDeContas = numeroDeContas + 1;
	}

	public double getSaldo(){
		return this.saldo;
	}

	public abstract void credito(double valor);

	public abstract boolean debito(double valor);
}
