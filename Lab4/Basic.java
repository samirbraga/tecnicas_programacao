public class Basic extends Conta {
	public Basic(int id){
		super(id);
	}

	public void credito(double valor){
		super.saldo +=  valor;
	}

	public boolean debito(double valor){
		if((super.saldo > 0) && (super.saldo - valor >= 0)){
			super.saldo -=  valor;
			return true;
		}
		return false;
	}
}