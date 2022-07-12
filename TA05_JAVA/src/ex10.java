import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma=0;
		
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Numero de ventas: ");
        int num=sc.nextInt();
  
        
        for (int i=0;i<num;i++){
           
            System.out.println("El precio de la venta "+(i+1)+" es: ");
            int venta=sc.nextInt();
            suma=(int) (suma+venta);
        }
  
        System.out.println("La suma del precio de todas las ventas es: "+suma +"€");

}
}