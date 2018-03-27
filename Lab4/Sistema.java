public class Sistema {
	static int n = 0;
	Conta[] contas = new Conta[100];

	Conta criarContaXPTOBasic () {
		int id = n;
		Basic basic = new Basic(id);
		contas[n] = basic;
		n++;
		return basic;
	}

	Conta criarContaXPTOPlus () {
		int id = n;
		Plus plus = new Plus(id);
		contas[n] = plus;
		n++;
		return plus;
	}

	Conta criarContaXPTOExtreme () {
		int id = n;
		Extreme extreme = new Extreme(id);
		contas[n] = extreme;
		n++;
		return extreme;
	}
}