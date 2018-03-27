public class Plus extends Conta {

	public Plus(int id){
		super(id);
	}

	public void credito(double credito){ //sobrecarga
		super.saldo = super.saldo + (super.saldo*1.005);
	}

	public boolean debito(double debito){ //sobrecarga
		double resultadoDebito = super.saldo - debito;
		if (resultadoDebito <= 0) {
			return false;
		}
		super.saldo = resultadoDebito;
		return true;

	}

	public String toString(){
		return "Conta XPTO id =" + super.id + "  saldo da conta:" + super.saldo;
	}
}