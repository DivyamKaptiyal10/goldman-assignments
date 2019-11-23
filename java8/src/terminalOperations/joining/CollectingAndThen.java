package terminalOperations.joining;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import java8.bean.Club;
import java8.bean.Player;
import java8.bean.PlayerDB;

public class CollectingAndThen {

	public static void main(String[] args) {
		Map<Club, Optional<Player>> maxOptional= PlayerDB.fetchAllPlayers().stream()
			.collect(Collectors.groupingBy(Player::getClub, 
						Collectors.maxBy(Comparator.comparing(Player::getAge))
					));
		
		maxOptional.entrySet().forEach(entry -> System.out.println(entry.getKey()+ " "+ entry.getValue().get().getName()));
	System.out.println();
		Map<Club, Player> maxAge= PlayerDB.fetchAllPlayers().stream()
				.collect(Collectors.groupingBy(Player::getClub, 
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Player::getAge))
								, Optional::get)
							
						));
		maxAge.entrySet().forEach(player -> System.out.println(player.getKey() + " "+player.getValue().getName()));
		
		Map<Club, List<String>> clubPlayerNames= PlayerDB.fetchAllPlayers().stream()
				.collect(Collectors.groupingBy(Player::getClub, 
								Collectors.mapping(Player::getName, Collectors.toList())							
						));
		System.out.println(clubPlayerNames);
		
	}

}
