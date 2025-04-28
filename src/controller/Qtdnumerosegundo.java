package controller;

public class Qtdnumerosegundo {

	public Qtdnumerosegundo() {
		super();
	}
	public int qtdN2(int n1, int n2) {
		if (n1 == 0) {
			return 0; 
		}
		return (n1 % 10 == n2 ? 1:0) + qtdN2(n1/10, n2);
		}
}