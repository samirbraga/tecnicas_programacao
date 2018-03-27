public abstract class Conta {
	private static int n;
	protected int id;
	protected double saldo;


	public Conta(int id){

		this.saldo = 0;
		this.id = id;
	}

	public double getSaldo(){
		return this.saldo;
	}

	public abstract void credito(double valor);

	public abstract boolean debito(double valor);
}