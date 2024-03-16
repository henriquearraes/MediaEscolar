package fundamentos;

import javax.swing.JOptionPane;

public class CalculadoraMediaEscolar {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Esta é sua média escolar, digite suas próximas notas.");
		String nomeStr = JOptionPane.showInputDialog("Digite seu nome: \n");
		String nota1Str = JOptionPane.showInputDialog("Digite a nota do seu primeiro semestre: \n");
		double nota1 = Double.parseDouble(nota1Str);
		String nota2Str = JOptionPane.showInputDialog("Digite a nota do seu segundo semestre: \n");
		double nota2 = Double.parseDouble(nota2Str);
		
		double media = (nota1+nota2)/2;
		
		if(media==10) {
			JOptionPane.showMessageDialog(null, nomeStr+",\nVocê foi aprovado por distinção!\nParabéns!\nSua média foi: "+media);
		}else if (media>=7 && media<10) {
			JOptionPane.showMessageDialog(null, nomeStr+",\nVocê foi aprovado!\nParabéns!\nSua média foi: "+media);
		}else if (media>=0 && media<7) {
			JOptionPane.showMessageDialog(null, nomeStr+",\nVocê foi reprovado!\nInfelizmente você não alcançou a nota desejada.\nSua média foi: "+media);
		}else {
			JOptionPane.showMessageDialog(null, nomeStr+",\nSua média está inválida!\nEntre em contato com sua instituição.");
		}
		
		JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema!\n By:Henrique Arraes.");
		
		

	}

}
