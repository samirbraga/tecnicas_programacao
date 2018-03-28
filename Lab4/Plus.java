public class Plus extends Conta {

	public Plus(int id){
		super(id);
	}

	public void credito(double credito){ 
		super.saldo = super.saldo + credito + (credito*0.005);
	}

	public boolean debito(double debito){ 
		double resultadoDebito = super.saldo - debito;
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