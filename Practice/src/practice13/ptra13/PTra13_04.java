/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {
		
		practice13.common.Hero dare = new practice13.common.Hero();
		dare.setName("勇者");
		practice13.common.Slime nama =new practice13.common.Slime();
		nama.setName("スライム");
		
		int i=0;
		int q=0;
		for(nama.damage(dare.attack());nama.damage(dare.attack())==false;) {
			i++;
		}
		for(dare.damage(nama.attack());dare.damage(nama.attack())==false;) {
			q++;
		}
		
		if(i<q) {
			System.out.println(dare.getName()+"は"+nama.getName()+"との戦闘に勝利した");
		}else {
			System.out.println(nama.getName()+"は"+dare.getName()+"との戦闘に勝利した");
		}
		
		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください

		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

	}
}
