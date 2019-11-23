package java8.bean;

import java.util.Arrays;
import java.util.List;


public class PlayerDB {

	public static List<Player> fetchAllPlayers(){
		Player p1 = new Player("messi", 32, Club.FCB);
		Player p2 = new Player("xavi", 40, Club.FCB);
		Player p3 = new Player("puyol", 40, Club.FCB);
		Player p4 = new Player("ronaldo", 33, Club.RMFC);
		Player p5 = new Player("Mane", 27, Club.LFC);
		Player p6 = new Player("Salah", 27, Club.LFC);
		Player p7 = new Player("zidane", 43, Club.RMFC);
		Player p8 = new Player("sane", 20, Club.MCFC);
		Player p9 = new Player("Toure", 41, Club.MCFC);
		Player p10 = new Player("Walker", 26, Club.MCFC);
		Player p11 = new Player("alonso", 32, Club.RMFC);
		
		return Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11);
	}
}
