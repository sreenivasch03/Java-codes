/*Pre-condition :
 *three runners with different names, different jersey number, runs marathon of 20km
 *first runner will take 45min to complete the race
 *second runner will take 70min to complete the race
 *third runner will take 84min to complete the race
 */
class Runner
{
	public String runnerName;
	public int jerseyNum;
	public static int distance =20;
	public int time;

	public Runner(String runnerName,int jerseyNum,int time)
	{
		this.runnerName = runnerName;
		this.jerseyNum = jerseyNum;
		this.time = time;
	}
	public void runnerDetails()
	{
		System.out.println("----------Runner Details----------");
		System.out.println("Runner Name : "+runnerName);
		System.out.println("Jersey Number : "+jerseyNum);
		System.out.println("Distance : "+distance+"Km");
		System.out.println("Reached time : "+time+" minutes");
	}
	public void convert()
	{
		int sec = time*60;
		System.out.println("Reached time in Seconds : "+sec+" Seconds");
	}
}
class  MainClassRunner
{
	public static void main(String[] args) 
	{
		Runner runner1 = new Runner("Sreenivas",9,45);
		Runner runner2 = new Runner("Ramesh",45,70);
		Runner runner3 = new Runner("Kiran",18,84);
		runner1.runnerDetails();
		runner1.convert();
		runner2.runnerDetails();
		runner2.convert();
		runner3.runnerDetails();
		runner3.convert();
	}
}