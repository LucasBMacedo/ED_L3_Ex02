package controller;

public class Qtdnumerosegundo {

	public Qtdnumerosegundo() {
		super();
	}
	public int Qtdnumseg(int num1, int num2) {
		if (num1 == 0) {
			return 0; /* Condicao de parada: quando o numero for 0, nao será mais possivel 
			dividir e todos os numeros já terao sido verificados. */
		}
			return (num1 % 10 == num2 ? 1:0) + Qtdnumseg(num1/10, num2);
			/* Se o resto de num1/10 for igual a num2, retorna 1 indicando que num2 
			 aparece em num1, senao, retorna 0. Esse retorno, 1 ou 0, é somado a chamada da
			 funcao para validar o proximo numero. */
		}
}