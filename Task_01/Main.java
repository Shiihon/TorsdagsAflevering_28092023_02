
public class Main{
	
	public static void main (String[] args){

		  Team team01 = new Team("All Blacks"); //New Zealand rugby teams.
		  Team team02 = new Team("Kiwis"); 
		  Team team03 = new Team("Tonga"); 
		  Team team04 = new Team("Fiji"); 
		  Team team05 = new Team("Fern");
		

		team01.setRank(1); // setting rank to 1.
		team02.setRank(2);
		team03.setRank(3);
		team04.setRank(4);
		team05.setRank(5);

		int teamRank1 = team01.getRank();
		int teamRank2 = team02.getRank();
		int teamRank3 = team03.getRank();
		int teamRank4 = team04.getRank();
		int teamRank5 = team05.getRank();


		System.out.println(team01);
		System.out.println(team02);
		System.out.println(team03);
		System.out.println(team04);
		System.out.println(team05);


	}
}