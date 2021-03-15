import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;
public class AgeCalculation {

	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog("Enter your Birth Date YYYY-MM-DD:");
		String birthdate = input;
		
		
		LocalDate dob = LocalDate.parse(birthdate);
		LocalDate today = LocalDate.now();
		
		Period difference = Period.between(dob, today);
		
		JOptionPane.showMessageDialog(null, "As of today, you are " + difference.getYears() + " years and " + difference.getMonths() + " months old.");
		
		
		
	}
}
