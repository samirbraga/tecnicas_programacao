public class Lab4{
	public static void main(String[] args){
		Sistema banco = new Sistema();

		Conta contaBasic1 = banco.criarContaXPTOBasic();
		Conta contaPlus1 = banco.criarContaXPTOPlus();
		Conta contaExtreme1 = banco.criarContaXPTOExtreme();

		contaBasic1.credito(1000);
		contaPlus1.credito(1000);
		contaExtreme1.credito(1000);
		
		contaBasic1.debito(10);
		contaPlus1.debito(10);
		contaExtreme1.debito(10);

		System.out.println(contaBasic1.toString());
		System.out.println(contaPlus1.toString());
		System.out.println(contaExtreme1.toString());


	}
}
