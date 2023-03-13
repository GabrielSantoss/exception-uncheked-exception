package excecoes_unchekedexception;

import javax.swing.*;

public class UnchekedException {

	public static void main(String[] args) {

		boolean continueLoop = true;
		do {
			String a = JOptionPane.showInputDialog("Numerador: ");
			String b = JOptionPane.showInputDialog("Denominador: ");
			
			try {
				int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
				System.out.println("Resultado: " + resultado);
				continueLoop = false;
			}catch (NumberFormatException e) {
				//e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Entrada invalida, informe um numero inteiro! " + e.getMessage());
			}catch (ArithmeticException e) {
				//e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Impossivel dividir um numero por zero! ");
			}finally {
				System.out.println("Chegou no finaly");
			}
			
		} while (continueLoop);
		

		System.out.println("O codigo continua");

	}

	public static int dividir(int a, int b) {
		return a / b;
	}

}
