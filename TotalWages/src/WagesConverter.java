
public class WagesConverter {

	//why do we need this class? we could just code this into actionListener
	// Add your new method here!
	public WagesConverter(){
		
	}
	public double calculateWages(double rate, double hours) {
		double amountEarned = 0;
		if (hours<40) {
			amountEarned = rate*hours;
		} else {
			amountEarned = ((hours-40.0)*(rate*1.5))+(hours*rate);
		}
		return amountEarned;
	}
}
