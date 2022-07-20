
public class BasketballTeam {
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	double fieldGoalPercentage;
	double freeThrowPercentage;
	
	public BasketballTeam() {
	
		this.fieldGoals=0;
		this.fieldGoalsAttempted=0;
		this.freeThrows=0;
		this.freeThrowsAttempted=0;
	}

	public BasketballTeam(String teamName,String teamMascot,String headCoach) {
	}
	public double fieldGoalPercentage() {
	return  fieldGoals/fieldGoalsAttempted;
	}
	public double freeThrowPercentage() {
	return  freeThrows/freeThrowsAttempted;
	}
	
	
}
