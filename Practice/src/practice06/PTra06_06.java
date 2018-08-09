package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 */
		for(int i = 0;i < 5;i++) {
			if(i < 1) {
				System.out.print("□");
			}else if(i >= 1){
				System.out.print("■");
			}
			if(i < 2) {
				System.out.print("□");
			}else if(i >= 2){
				System.out.print("■");
			}
			if(i < 3) {
				System.out.print("□");
			}else if(i >= 3){
				System.out.print("■");
			}
			if(i < 4) {
				System.out.print("□");
			}else if(i >= 4){
				System.out.print("■");
			}
			if(i < 5) {
				System.out.println("□");
			}else if(i >= 5){
				System.out.println("■");
			}
		}
	}
}
