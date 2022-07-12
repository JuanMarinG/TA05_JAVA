import java.util.Scanner;
public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el dia de la semana: ");
		String dia= sc.nextLine();
		
		switch (dia) {
			case "Lunes":
			case "Martes":
			case "Miercoles":
			case "Jueves":	
			case "Viernes":
				System.out.println("Es laborable ");
				break;
				
			case "Sabado":
			case "Domingo":
				System.out.println("Hoy es festivo ");
			default: 
				System.out.println("Introduce correctamente el dia de la semana");
		}
				
		
		
		
	}

}
