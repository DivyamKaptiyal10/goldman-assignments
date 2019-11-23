package terminalOperations.joining;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java8.bean.Club;
import java8.bean.Player;
import java8.bean.PlayerDB;

public class GroupingBy1 {

	public static void main(String[] args) {
	Map<Club, List<Player>>	clubPlayersMap =PlayerDB.fetchAllPlayers().stream()
		.collect(Collectors.groupingBy(Player::getClub));
		
	System.out.println(clubPlayersMap);
	
	Map<String,List<Player>> complex =   PlayerDB.fetchAllPlayers().stream().
		collect(Collectors.groupingBy(player -> {
			Player p = (Player)player;
			if(p.getAge()<=33) {
				return "young";
			}else {
				return "old";
			}
		}));
	
	System.out.println(complex);
	}

}

