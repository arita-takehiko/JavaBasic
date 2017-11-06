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
		Car[] users = new Car[3];
		
		users[0] = new Car();
		users[0].color = "red";
		users[0].gasoline = 50;
		users[1] = new Car();
		users[1].color = "blue";
		users[1].gasoline = 40;
		users[2] = new Car();
		users[2].color = "yellow";
		users[2].gasoline = 30;
		
		for(int i=0;i<3;i++) {			
			int n=0;			
			for(int goal=300;goal>0;) {
				if(goal==301) {
					goal=0;
				}else{
					goal-=users[i].run();
						n++;
				}
				
				
			}
		if(users[i].gasoline>0) {
				System.out.println(users[i].color+"の車は"+n+"時間かかりました。残りのガソリンは"+users[i].gasoline+"です");
			}else {
				System.out.println(users[i].color+"の車は到達できませんでした。");
			}
					
					
							
							
		}
		

		





		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
	}
}
	

