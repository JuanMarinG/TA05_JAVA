import java.util.Scanner;
public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        String contraseña="qwerty";
  
        final int num=3;
        boolean acierto=false;
  
        String pass;
        for (int i=0;i<num && !acierto;i++){
            System.out.println("Introduce tu contraseña (Recuerda que solo tienes 3 intentos): " );
            pass = sc.next();
  
            if (contraseña.equals(pass)){
                System.out.println("Enhorabuena");
                acierto=true;}
            else {
            	System.out.println("La contraseña es incorrecta");
            	acierto=false;
            }
            
        }
        
	}
	
}
                
                
        

