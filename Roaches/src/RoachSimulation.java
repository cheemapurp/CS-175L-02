import javax.swing.JOptionPane;
/**
 * This program is to simulation a roach population as it breeds and what 
 * happens when it gets sprayed.
 * 
 * @author cheemapurp
 * 
 */
public class RoachSimulation {

	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog("Enter Starting Roach Population:");
		int roachInitial = Integer.parseInt(input);
		RoachPopulation bugs = new RoachPopulation(roachInitial);
		JOptionPane.showMessageDialog(null, "The Initial Roach Population is " + roachInitial);
		
		bugs.breed();
		JOptionPane.showMessageDialog(null, "The Roach Population after Cycle 1 breeding is " + bugs.getRoaches());
		
		String input2 = JOptionPane.showInputDialog("Enter Spray Percentage for Cycle 1:");
		double sprayPct = Double.parseDouble(input2);
		bugs.spray(sprayPct);
		JOptionPane.showMessageDialog(null, "The Roach Population after Cycle 1 " + sprayPct * 100 + "% spraying is " + bugs.getRoaches());
		
		bugs.breed();
		JOptionPane.showMessageDialog(null, "The Roach Population after Cycle 2 breeding is " + bugs.getRoaches());
		
		String input3 = JOptionPane.showInputDialog("Enter Spray Percentage for Cycle 2:");
		double sprayPct2 = Double.parseDouble(input3);
		bugs.spray(sprayPct2);
		JOptionPane.showMessageDialog(null, "The Roach Population after Cycle 2 " + sprayPct2 * 100 + "% spraying is " + bugs.getRoaches());
		
		bugs.breed();
		JOptionPane.showMessageDialog(null, "The Roach Population after Cycle 3 breeding is " + bugs.getRoaches());
		
		String input4 = JOptionPane.showInputDialog("Enter Spray Percentage for Cycle 3:");
		double sprayPct3 = Double.parseDouble(input4);
		bugs.spray(sprayPct3);
		JOptionPane.showMessageDialog(null, "The Roach Population after Cycle 3 " + sprayPct3 * 100 + "% spraying is " + bugs.getRoaches());
		
		bugs.breed();
		JOptionPane.showMessageDialog(null, "The Roach Population after Cycle 4 breeding is " + bugs.getRoaches());
		
		String input5 = JOptionPane.showInputDialog("Enter Spray Percentage for Cycle 4:");
		double sprayPct4 = Double.parseDouble(input5);
		bugs.spray(sprayPct4);
		JOptionPane.showMessageDialog(null, "The Roach Population after Cycle 4 " + sprayPct4 * 100 + "% spraying is " + bugs.getRoaches());
	}
}
