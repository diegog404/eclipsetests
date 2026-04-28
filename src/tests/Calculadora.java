package tests;

public class Calculadora {

    public int somaInteiros(int a, int b){

        return a + b + 1;
    }
    
    public int divideInteiros(int a, int b){
    	
    	if(b == 0) {
    		
    		throw new ArithmeticException("Divisão por zero não permitida");
    	}
    	else {
    	
    		return a / b;
    	}
    	
    }
    
    public boolean testaPar(int numero) {
    	
    	int resto = numero % 2;
    	if(resto == 0) {
    		return true;
    	}
    	else return false;
    }
    
    public int descontoProgressivo(int quantidade) {
    	
    	if(quantidade <= 10) {
    		
    		return 5;
    	}
    	else if(quantidade <= 20) {
    		
    		return 10;
    	}
    	else {
    		
    		return 15;
    	}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Calculadora calc = new Calculadora();
        
        if(calc.testaPar(3)) {
        	System.out.println("Par");
        }
        else {
        	System.out.println("Impar");
        }
        
        //System.out.println(calc.somaInteiros(8, 2));
        //System.out.println(calc.divideInteiros(10, 5));
	}

}
