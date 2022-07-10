import java.util.Scanner;

import javax.swing.JOptionPane;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Escribe tu nombre: ");
		String name = sc.nextLine();
		
		JOptionPane.showMessageDialog(null, name);
	}

}
