class Lab3{
	public static void main(String[] args) {
		float x , y;
		x = 1;
		y = 5;
		Quadrado q1 = new Quadrado(x,y);
		Quadrado q2 = new Quadrado(y,x);
		Circulo c1 = new Circulo(x);
		Circulo c2 = new Circulo(y);
		System.out.println(q1.toString());
		q1.mover(y ,y);
		System.out.println(q1.x);
		System.out.println(q1.y);
		System.out.println();
	}
}