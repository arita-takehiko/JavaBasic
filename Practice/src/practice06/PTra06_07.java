package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int z=6-i;z<=4;z++) {
				System.out.print("■");
			}
			for(int x=i;x<=5;x++) {
				System.out.print("□");
			}
			System.out.println("");
		}
		for(int h=1;h<=5;h++) {
			for(int y=h;y<=5;y++) {
				System.out.print("■");
			}
			for(int w=6-h;w<=4;w++) {
				System.out.print("□");
			}
			System.out.println("");
		}
			
		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */

	}
}
