public class Basic extends Conta {
	// public Conta(int id){
	// 	super(id);
	// }

	public boolean credito(double valor){
		if(super.saldo +=  valor)
			return true;
		return false;
	}

	public boolean debito(double valor){
		if((super.saldo > 0) && (super.saldo - valor >= 0)){
			super.saldo -=  valor;
			return true;
		}
		return false;
	}
}