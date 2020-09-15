package SportTeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team implements TeamInterface {

	Scanner sc = new Scanner(System.in);

	private List<Player> players;
	String updateInfo;

	public Team(String teamName) {
		super();
		this.players = new ArrayList<>();
	}

	public void setUpdateInfo(String updateInfo) {
		System.out.print("\nEnter info for players: ");
		this.updateInfo = sc.nextLine();
	}

	@Override
	public void hirePlayer(Player player) {

		System.out.println("We hired " + player.getName());
		players.add(player);
		player.enrole(this);
	}

	@Override
	public void firePlayer(Player player) {
		System.out.println("We fired " + player.getName());
		players.remove(player);
		player.leaveTeam(this);
	}

	@Override
	public void giveTheInfo() {

		setUpdateInfo(updateInfo);

		for (Player player : players) {
			player.update();
			System.out.println(updateInfo);
		}

	}

}
