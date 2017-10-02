import javax.swing.*;
public class Kapitel4{
	public static void main(String[] args){
		char a1 = '\u00E5'; //å
		char a2 = '\u00E4'; //ä
		char o1 = '\u00F6'; //ö

		String minuter = JOptionPane.showInputDialog(null, "Antal minuter du ringer i m" + a1 +"naden" );
		String priset = JOptionPane.showInputDialog(null, "Hur mycket " + a2 +"r minutpriset?");
		double m = Double.parseDouble(minuter);
		double p = Double.parseDouble(priset);
		double summa = m * p;
		if (summa => 1000){summa = summa * 0.9;}
		JOptionPane.showMessageDialog(null, summa);
	}	
}