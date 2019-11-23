package java8.stream;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import java8.bean.Club;
import java8.bean.Player;
import java8.bean.PlayerDB;

public class GoupingBy3 {
public static void main(String[] args) {
	Map<Club,Map<String,List<Player>>> clubPlayerMap= PlayerDB.fetchAllPlayers().stream()
	.collect(Collectors.groupingBy(Player::getClub,Collectors.groupingBy(player -> {
		Player p = (Player) player ;
		return p.getAge() >33 ? "old" : "young";
	})));
;
	System.out.println(clubPlayerMap);
	
	Map<Club, List<Player>> sortedPlayers = PlayerDB.fetchAllPlayers().stream()
	.sorted(Comparator.comparing(Player::getAge))
	.collect(Collectors.groupingBy(Player::getClub, LinkedHashMap::new, Collectors.toList()));
	System.out.println(sortedPlayers);
}
}
