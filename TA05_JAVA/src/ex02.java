import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Tu nombre es: ");
		
		String name = sc.nextLine();
		sc.close();
		
		System.out.println("Hola " +name.toUpperCase());
		
	}

}
