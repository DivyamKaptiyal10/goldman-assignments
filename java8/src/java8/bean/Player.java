package java8.bean;


public class Player {
	

	private String name;
	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", club=" + club + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Club getClub() {
		return club;
	}
	public void setClub(Club club) {
		this.club = club;
	}
	public Player(String name, int age, Club club) {
		super();
		this.name = name;
		this.age = age;
		this.club = club;
	}
	private int age;
	private Club club;

}
