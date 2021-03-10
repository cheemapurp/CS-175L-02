
public class RoachPopulation {

	double roachPopulation;
	
	public RoachPopulation(int initialPopulation) //a constructor starting with a initial roach population.
	{
		roachPopulation = initialPopulation;
	}
	
	public void breed()
	{
		roachPopulation *= 2;
	}
	
	public void spray(double sprayPct) // sprayPct is the given percentage of how much of the roaches should be sprayed.
	{
		roachPopulation =  roachPopulation - (int)(roachPopulation * sprayPct);
	}
	
	public double getRoaches()
	{
		return roachPopulation;
	}
}
