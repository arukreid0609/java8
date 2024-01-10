package java8;

public class Hero {
	String name;
	int hp;
	
	public void sleep() {
		this.hp = 100;
		System.out.printf("%dは、眠って回復した!\n",this.name);
	}
}
