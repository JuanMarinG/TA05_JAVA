import java.util.Scanner;

public class ex04 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	double area, radio;
	
	Scanner valor= new Scanner(System.in);
	System.out.println("Introduce el valor del radio: ");
	
	radio= valor.nextDouble();
	valor.close();
	
	area = Math.PI*Math.pow(radio,2);
	System.out.println("El area es; "+area);
		
	
	}
}
	
	


