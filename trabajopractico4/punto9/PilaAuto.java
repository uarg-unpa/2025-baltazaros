package punto9;

public class PilaAuto {

   final int maxpila=10;
	Auto [] elementos;
	int cima;
	
	public PilaAuto() {
		elementos = new Auto[maxpila];
		cima = -1;
	}
	
	public boolean estaVacia() {
		return (cima == -1);
	}
	
	public boolean estaLlena() {
		return (cima == maxpila-1);
	}
	
	public void meter(Auto e) {     
		cima = cima+1;	
      elementos[cima]=e;           			
	}
   
	public Auto sacar() {		      
		Auto aux = elementos[cima];
		cima = cima - 1;    
		return aux;
	}

}