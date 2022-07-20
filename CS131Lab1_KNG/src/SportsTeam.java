
public class SportsTeam {
	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins;
	protected int losses;

public SportsTeam() {
	this.teamName="";
	this.teamMascot="";
	this.headCoach="";
	this.wins=0;
	this.losses=0;
}

public SportsTeam(String teamName,String teamMascot,String headCoach) {
	
}
public double getWinPercentage(){
	return wins/(wins+losses);
}
public void getStats() {
}
}
