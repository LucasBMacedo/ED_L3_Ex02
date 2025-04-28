package viewer;

import javax.swing.JOptionPane;

import controller.Qtdnumerosegundo;

public class Principal {

	public static void main(String[] args) {
		Qtdnumerosegundo qtd = new Qtdnumerosegundo ();
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro de 10 a 999999"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro de 0 a 9"));
		JOptionPane.showMessageDialog(null, "A quantidade de vezes que o número " + n2 + " aparece em " + n1 + " é: " + qtd.qtdN2(n1, n2) + ".");
	}
}