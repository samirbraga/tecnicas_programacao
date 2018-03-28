public class Extreme extends Conta{
	
	public Extreme(int id){
		super(id);
	}

	public void credito(double credito){
		super.saldo = super.saldo + credito + (credito*0.002);
	}

	public boolean debito(double debito){
		double resultadoDebito = super.saldo - debito + (debito*0.002);
		if (resultadoDebito < 0) {
			return false;
		}

		super.saldo = resultadoDebito;
		return true;
	}

	public String toString(){
		return "Conta XPTO Basic id = " + super.id + "  saldo da conta: R$ " + String.format("%.2f", super.saldo);
	}
}