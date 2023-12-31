package view;

import javax.swing.JOptionPane;

import controller.MenorValorController;

public class Principal {

	public static void main(String[] args) {
		MenorValorController menorValorCont = new MenorValorController();
		int tamanho = 0;
		
		do {
			try {
				String input = JOptionPane.showInputDialog("digite o tamanho do vetor: ");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "encerrado");
					System.exit(0);
				}
				tamanho = Integer.parseInt(input);
				if (tamanho <= 0) {
					JOptionPane.showMessageDialog(null, "tamanho inválido");
					continue;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "tamanho inválido");
				continue;
			}
			break;
		} while(true);
		
		int[] vet = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
			do {
				try {
					String input = JOptionPane.showInputDialog("digite o " + (i + 1) + "º valor do vetor: ", "");
					if (input == null) {
						JOptionPane.showMessageDialog(null, "encerrado");
						System.exit(0);
					}
					vet[i] = Integer.parseInt(input);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "valor inválido");
					continue;
				}
				break;
			} while(true);
		}
		
		JOptionPane.showMessageDialog(null, "menor valor do vetor: " + menorValorCont.menorValor(vet, tamanho, vet[tamanho - 1]));

	}

}
