public class Lab4{
	public static void main(String[] args){
		Sistema banco = new Sistema();

		Conta contaBasic1 = banco.criarContaXPTOBasic();
		Conta contaPlus1 = banco.criarContaXPTOPlus();
		Conta contaExtreme1 = banco.criarContaXPTOExtreme();

		contaBasic1.credito(100);
		contaPlus1.credito(100);
		contaExtreme1.credito(100);

		System.out.println(contaBasic1.toString());
		System.out.println(contaPlus1.toString());
		System.out.println(contaExtreme1.toString());

		contaBasic1.debito(100);
		contaPlus1.debito(100);
		contaExtreme1.debito(100);

		System.out.println(contaBasic1.toString());
		System.out.println(contaPlus1.toString());
		System.out.println(contaExtreme1.toString());


	}
}
