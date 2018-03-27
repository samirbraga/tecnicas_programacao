public abstract class Conta {
	private static int n;
	private int id;
	protected double saldo;

	public Conta (id) {
		this.saldo = 0;
		this.id = id;
	}

	public double getSaldo(){
		return this.saldo;
	}

	public abstract boolean credito(double valor);

	public abstract boolean debito(double valor);
}