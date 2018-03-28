public class Basic extends Conta {
	
	public Basic(int id){
		super(id);
	}

	public void credito(double valor){
		super.saldo +=  valor;
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