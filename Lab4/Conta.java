public abstract class Conta{
	private static int n;
	private int id;
	private double saldo;

	public abstract public double getSaldo();

	public abstract public boolean credito();

	public abstract public boolean debito();
}