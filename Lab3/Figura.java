public abstract class Figura {

	float x;
	float y;

	Figura(){
		this.x = 0;
		this.y = 0;
	}

	abstract void desenhar();
	abstract void mover(float dx , float dy);
	abstract float calcularArea();
}