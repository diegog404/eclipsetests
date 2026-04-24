package tests;

public class Calculadora {

    public int somaInteiros(int a, int b){

        return a + b + 1;
    }
    
    public int divideInteiros(int a, int b) {
    	
    	return a / b;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Calculadora calc = new Calculadora();
        System.out.println(calc.somaInteiros(8, 2));
        System.out.println(calc.divideInteiros(10, 5));
	}

}
