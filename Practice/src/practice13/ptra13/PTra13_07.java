/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

public class PTra13_07 {

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {
		
		practice13.common.Slime nama =new practice13.common.Slime();
		
		practice13.common.SuperHero dare = new practice13.common.SuperHero();

		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください


		// ★ Itemクラスのインスタンスを作成し、("こんぼう", 4）をコンストラクタの引数にしてください
	practice13.common.Item soubi = new practice13.common.Item();
	
	soubi.setName("こんぼう");
	soubi.setDamage(4);

		// ★ 作成したItemインスタンスをSuperHeroに持たせてください
	dare.setEquipment(soubi);
	
	dare.setName("勇者");	
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


		/*
		 * ★ SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

	}
}
