package SportTeam;

public class MainClass {

	public static void main(String[] args) {
		
		Team team = new Team("Gorile");
		
		Player player = new Player("Donkey");
		Player player2 = new Player("Monkey");
		Player player3 = new Player("Simba");

		team.hirePlayer(player);
		team.hirePlayer(player2);
		team.hirePlayer(player3);
		
		team.firePlayer(player2);
		
		team.giveTheInfo();
	}

}
