/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;

	/** 受講生氏名 */
	private String studentName;

	/** 会社名 */
	private String companyName;

	/** 教室名 */
	private String className;

	/** メールアドレス */
	private String mail;

	/** パスワード */
	private String password;
	

	public void setID(int bangou) {
		this.studentId = bangou;
	}
	public int getID() {
		return this.studentId;
	}
	
	public void setName(String namae) {
		this.studentName = namae;
	}
	public String getName() {
		return studentName;
	}
	public void setCom(String kaisya) {
		this.companyName = kaisya;
	}
	public String getCom() {
		return companyName;		
	}
	public void setClasss(String kyousitu) {
		this.className = kyousitu;
	}
	public String getClasss() {
		return this.className;
	}
	public void setMail(String meru) {
		this.mail = meru;
	}
	public String getMail() {
		return this.mail;
	}
	public void setPass(String pasu) {
		this.password = pasu;
	}
	public String getPass() {
		return this.password;		
	}
	
}
