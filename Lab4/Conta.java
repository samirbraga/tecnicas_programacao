public abstract class Conta {
	private static int n;
	private int id;
	protected double saldo;

	public Conta(id){
		this.saldo = 0;
		this.id = id;
	}

	public double getSaldo(){
		return this.saldo;
	}

	public abstract boolean credito();

	public abstract boolean debito();
}