package SportTeam;

public class Player implements PlayerInterface {

	private String name;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void enrole(Team team) {
		System.out.println(name + ": you joined the team");

	}

	@Override
	public void leaveTeam(Team team) {
		System.out.println(name + ": You left the team");
	}

	@Override
	public void notification() {

		System.out.println("Just to notify you!");

	}

	public void update() {

		System.out.println("Hey, " + name);
	}

}
