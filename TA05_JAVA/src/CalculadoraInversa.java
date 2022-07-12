import java.util.Scanner;
public class CalculadoraInversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1;
		double num2;
		double resultado= 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor 1: ");
		num1=sc.nextDouble();
		System.out.println("Que quieres hacer? (+ - * / ^ %: ");
		String simbolo=sc.next();
		System.out.println("Introduce el valor 2: ");
		num2=sc.nextDouble();
		
		switch (simbolo) {
		case "+": resultado=num1+num2;
			break;
		case "-": resultado=num1-num2;
			break;
		case "*": resultado=num1*num2;
			break;
		case "/": resultado=num1/num2;
			break;
		case "^": resultado=(int)Math.pow(num1, num2);
			break;
		case "%": resultado=num1%num2;
			break;
			
		}
		System.out.println(num1+""+simbolo+""+num2+" = " +resultado);
		
		
	}

}
