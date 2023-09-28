public class Team{

//attributes of the class.	
	private String teamName;
	private int teamRank;
	private String[] players;

//constructor
	public Team (String teamName){
		this.teamName = teamName;
		this.teamRank = 0;
	}

//getter.
	public int getRank(){
		return teamRank;
		}
	

//setter.
	public void setRank (int teamRank){
		this.teamRank = teamRank;
	}

	public String toString(){
		return "Team: " + teamName + " : " + teamRank + ".";
	}

}