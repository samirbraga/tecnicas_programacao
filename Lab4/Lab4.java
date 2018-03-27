public class Lab4{
	public static void main(String[] args){
		Sistema banco = new Sistema();

		Conta contaBasic1 = banco.criarContaXPTOBasic();
		Conta contaPlus1 = banco.criarContaXPTOPlus();
		Conta contaExtreme1 = banco.criarContaXPTOExtreme();

		contaBasic1.credito(100);
		contaPlus1.credito(100);
		contaExtreme1.credito(100);

		System.out.println("Saldo Conta Basic" + contaBasic1.getSaldo());
		System.out.println("Saldo Conta Plus" + contaPlus1.getSaldo());
		System.out.println("Saldo Conta Extreme" + contaExtreme1.getSaldo());
	}
}
