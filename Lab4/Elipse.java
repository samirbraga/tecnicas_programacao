figura
	boolean apagado

boolean apagar(){
	this.apagado = true;
}

void redimencionar(){
	
}

double perimetro(){
	
}

class elipse(){
	elipse(centro centro1, centro centro2){
		this.centro1 = centro1;
		this.centro2 = centro2;
	}

	void mover(float dx , float dy ){
		(this.centro1).mover(dx , dy);
		(this.centro2).mover(dx , dy);
	}

	void redimenciona(centro centro1 , centro centro2 , float radius){
		this.centro1 = centro1;
		this.centro2 = centro2;
		this.radius = radius;
	}


}

class retangulo(){}
class triangulo(){}

