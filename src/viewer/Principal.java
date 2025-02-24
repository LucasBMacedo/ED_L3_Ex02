package viewer;

import javax.swing.JOptionPane;

import controller.Qtdnumerosegundo;

public class Principal {

	public static void main(String[] args) {
		Qtdnumerosegundo qtd = new Qtdnumerosegundo ();
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro de 10 a 999999"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro de 0 a 9"));
		JOptionPane.showMessageDialog(null, "A quantidade de vezes que o número " + numero2 + " aparece em " + numero1 + " é: " + qtd.Qtdnumseg(numero1, numero2) + ".");
	}
}