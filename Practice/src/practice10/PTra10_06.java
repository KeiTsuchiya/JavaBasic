package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car car = new Car();
		car.color = "Red";
		car.gasoline = 50;
		
		Car car2 = new Car();
		car2.color = "Yellow";
		car2.gasoline = 60;
		
		Car car3 = new Car();
		car3.color = "Blue";
		car3.gasoline = 40;
		
		
		final int distance = 300;
		
		
		
		int progress;
		progress = 0;
		
		int n;
		n = 0;
		
		while(progress < distance) {
			progress += car.run();
			n++;
			if(car.gasoline < 0) {
				break;
			}
		}
		
		if(car.gasoline < 0) {
			System.out.println("目的地に到達できませんでした");
		}else {
			System.out.println("目的地にまで" + n + "時間かかりました。残りのガソリンは、" + car.gasoline + "リットルです");
		}
		
		
		int progress2;
		progress2 = 0;
		
		int n2;
		n2 = 0;
		
		while(progress2 < distance) {
			progress2 += car2.run();
			n2++;
			if(car2.gasoline < 0) {
				break;
			}
		}
		
		if(car2.gasoline < 0) {
			System.out.println("目的地に到達できませんでした");
		}else {
			System.out.println("目的地にまで" + n2 + "時間かかりました。残りのガソリンは、" + car2.gasoline + "リットルです");
		}
		
		
		int progress3;
		progress3 = 0;
		
		int n3;
		n3 = 0;
		
		while(progress3 < distance) {
			progress3 += car3.run();
			n3++;
			if(car3.gasoline < 0) {
				break;
			}
		}
		
		if(car3.gasoline < 0) {
			System.out.println("目的地に到達できませんでした");
		}else {
			System.out.println("目的地にまで" + n3 + "時間かかりました。残りのガソリンは、" + car3.gasoline + "リットルです");
		}
	}
}
