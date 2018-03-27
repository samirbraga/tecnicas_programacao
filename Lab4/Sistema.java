class Sistema {
	static int n = 0;
	Conta[] contas = new Conta[100];

	Conta criarContaXPTOBasic () {
		int id = n;
		ContaBasic basic = new ContaBasic(id);
		contas[n] = basic;
		n++;
		return basic;
	}

	Conta criarContaXPTOPlus () {
		int id = n;
		ContaPlus plus = new ContaPlus(id);
		contas[n] = plus;
		n++;
		return plus;
	}

	Conta criarContaXPTOExtreme () {
		int id = n;
		ContaExtreme extreme = new ContaExtreme(id);
		contas[n] = extreme;
		n++;
		return extreme;
	}
}