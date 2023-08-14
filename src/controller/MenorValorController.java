package controller;

public class MenorValorController {

	public MenorValorController() {
		super();
	}
	public int menorValor(int[] vet, int tamanho, int menor) {
		// condição de parada - quando o tamanho do vetor for <= a 0;
		// e o menor valor será reconhecido quando todo o vetor já estiver percorrido por inteiro. 
		if (tamanho <= 0) {
			return menor;
		}
		if (vet[tamanho - 1] < menor) {
			menor = vet[tamanho - 1];
		}
		// relação de chamada dos passos - checar o se o valor é menor que o valor em questão;
		// X - 1 < Y? e logo após chamar a função com o valor sendo retirado um a um = isso irá encontrar o menor valor.
		return menorValor(vet, (tamanho - 1), menor);
	}
}
