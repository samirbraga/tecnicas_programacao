public class Sistema {
	static int n = 0;
	Conta[] contas = new Conta[100];

	Conta criarContaXPTOBasic () {
		int id = n;
		Conta basic = new Basic(id);
		contas[n] = basic;
		n++;
		return basic;
	}

	Conta criarContaXPTOPlus () {
		int id = n;
		Conta plus = new Plus(id);
		contas[n] = plus;
		n++;
		return plus;
	}

	Conta criarContaXPTOExtreme () {
		int id = n;
		Conta extreme = new Extreme(id);
		contas[n] = extreme;
		n++;
		return extreme;
	}
}