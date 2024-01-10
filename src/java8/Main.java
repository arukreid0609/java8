package java8;

public class Main {

	public static void main(String[] args) {
		// 勇者を生成
		Hero h = new Hero();
		Hero h2 = new Hero();
		// フィールドに初期値を設定
		h.name = "ミナト";
		h.hp = 100;
		h2.name = "勇者";
		h2.hp = 150;
		System.out.println("勇者" + h.name + "を生み出しました!");
		
		// 勇者のメソッドを呼び出す
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
	}

}
