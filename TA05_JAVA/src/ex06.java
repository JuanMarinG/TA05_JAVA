import javax.swing.JOptionPane;
public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double IVA=0.21;
		String num=javax.swing.JOptionPane.showInputDialog("Introduce el precio del producto; ");
		
		double precio= Double.parseDouble(num);
		JOptionPane.showMessageDialog(null, "El producto tiene un precio de "+precio+"€ y su precio con IVA es de: "+(precio+(precio*IVA)));
	}

}
