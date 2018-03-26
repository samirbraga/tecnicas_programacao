class Lab3{
	public static void main(String[] args) {

		Figura q1 = new Quadrado2(10);
		Figura q2 = new Quadrado2();

		Figura c1 = new Circulo(5);
		Figura c2 = new Circulo();

		System.out.println(q1.calcularArea());
		System.out.println(q2.calcularArea());

		System.out.println(c1.calcularArea());
		System.out.println(c2.calcularArea());
	
		q1.mover(5, 10);
		q2.mover(10, 5);

		c1.mover(5, 10);
		c2.mover(10, 5);
	
		q1.desenhar();	
		q2.desenhar();

		c1.desenhar();	
		c2.desenhar();	
	}
}