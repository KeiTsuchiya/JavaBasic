/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {


		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください

		practice13.common.Employee[] employees = new practice13.common.Employee[3];

		for(int i = 0; i < employees.length; i++) {

			employees[i] = new practice13.common.Employee();


			employees[i].setUserNm(NAMEDATA[i]);

			employees[i].setMail(MAILDATA[i]);

			employees[i].setPassword(PASSDATA[i]);

			employees[i].setDepartmentNm(QUATERDATA[0][i]);

			int num = Integer.parseInt(QUATERDATA[1][i]);
			employees[i].setDepartmentCnt(num);
		}

		for(int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].getPassword());
		}

	}
}