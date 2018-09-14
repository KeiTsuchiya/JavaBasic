/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		ArrayList<Player> array = new ArrayList<Player>();
        try {
        	Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"));
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] list = line.split(",",0);

                Player player = new Player();
                player.setPosition(list[0]);
                player.setName(list[1]);
                player.setCountry(list[2]);
                player.setTeam(list[3]);

                array.add(player);


            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

     // ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        Collections.shuffle(array);

        ArrayList<Player> gkList = new ArrayList<>();
        ArrayList<Player> dfList = new ArrayList<>();
        ArrayList<Player> mfList = new ArrayList<>();
        ArrayList<Player> fwList = new ArrayList<>();

	        for(Player canditate : array) {
		       	if(canditate.toString().contains("GK") && gkList.size() < 1){
		       		gkList.add(canditate);
		       	}else if(canditate.toString().contains("DF") && dfList.size() < 4){
		       		dfList.add(canditate);
		       	}else if(canditate.toString().contains("MF") && mfList.size() < 4){
		       		mfList.add(canditate);
		       	}else if(canditate.toString().contains("FW") && fwList.size() < 2){
		       		fwList.add(canditate);
		       	}
	        }

	   System.out.println("ーGKー");
	   for(Player gkCanditate : gkList) {
		   System.out.println("・" + gkCanditate);
	   }

	   System.out.println("ーDFー");
	   for(Player dfCanditate : dfList) {
		   System.out.println("・" + dfCanditate);
	   }

	   System.out.println("ーMFー");
	   for(Player mfCanditate : mfList) {
		   System.out.println("・" + mfCanditate);
	   }

	   System.out.println("ーFWー");
	   for(Player fkCanditate : fwList) {
		   System.out.println("・" + fkCanditate);
	   }
	}
}
