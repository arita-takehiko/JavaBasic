package practice10;
/*
 * PTra10_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_01 {

	/*
	 * ★ 以下の仕様のクラスを作成してください（新しくJavaファイルを作成してください）
	 *
	 * クラス名
	 * 		User
	 * フィールド
	 * 		userId		:	int型
	 * 		userNm		：	String型
	 * 		mail		：	String型
	 * 		password	:	String型
	 * メソッド
	 * 		なし
	 */

	public static void main(String[] args) {
		User us=new User();
		us.userId=12345;
		us.userNm="67890";
		us.mail="abcde";
		us.password="fghij";
		
		
		

		// Userクラスを作成後に着手してください
		// ★ User型の変数usを宣言してください

		// ★ 変数usに、Userクラスのインスタンスを作成・代入してください
		System.out.println(us.userId);
		System.out.println(us.userNm);
		System.out.println(us.mail);
		System.out.println(us.password);
		// ★ 変数usに格納されているインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください

	}
}
