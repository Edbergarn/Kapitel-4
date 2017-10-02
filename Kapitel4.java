import javax.swing.*;
public class Kapitel4{
	public static void main(String[] args){
		char a1 = '\u00E5'; //å
		char A1 = '\u00C5'; //Å
		char a2 = '\u00E4'; //ä
		char A2 = '\u00C4'; //Ä
		char o1 = '\u00F6'; //ö
		char O1 = '\u00D6'; //Ö

		/*String minuter = JOptionPane.showInputDialog(null, "Antal minuter du ringer i m" + a1 +"naden" );
		String priset = JOptionPane.showInputDialog(null, "Hur mycket " + a2 +"r minutpriset?");
		double m = Double.parseDouble(minuter);
		double p = Double.parseDouble(priset);
		double summa = m * p;
		if (summa => 1000){summa = summa * 0.9;}
		JOptionPane.showMessageDialog(null, summa);*/
		String antal1, dagspris1, arskort1, profit;
		int arskort, dagspris, antal, summa;
		antal1 = JOptionPane.showInputDialog(null, "Hur manga ganger i veckan tranar du?");
		dagspris1 = JOptionPane.showInputDialog(null, "Hur mycket kostar dagskort?");
		arskort1 = JOptionPane.showInputDialog(null, "Hur mycket kostar " + a1 + "rskort");
		

		dagspris = Integer.parseInt(dagspris1);
		arskort = Integer.parseInt(arskort1);
		antal = Integer.parseInt(antal1);

		summa = (antal*52) * dagspris;
		if (arskort < summa){profit = A1 + "rskort";}
		else {profit = "Dagskort";}

		JOptionPane.showMessageDialog(null, A1 + "rskort:" + arskort + "\nDagskort: " + summa + "\nB" + A2 + "sta deal: "+ profit);
}
}