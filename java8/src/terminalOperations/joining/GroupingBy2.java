package terminalOperations.joining;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java8.bean.Club;
import java8.bean.Player;
import java8.bean.PlayerDB;

public class GroupingBy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Club,Map<String,List<Player>>>  complexMap = PlayerDB.fetchAllPlayers().stream()
		.collect(Collectors.groupingBy(Player::getClub, Collectors.groupingBy(player -> {
			Player p = (Player)player;
			return p.getAge() <=33 ? "young": "old";
		})));
		
		//System.out.println(complexMap);
		
		Map<Club,Long> countKing = PlayerDB.fetchAllPlayers().stream()
		.collect(Collectors.groupingBy(Player::getClub, Collectors.counting()));
		System.out.println(countKing);
	}

}
