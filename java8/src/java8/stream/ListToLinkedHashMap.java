package java8.stream;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

import java8.bean.Club;
import java8.bean.Player;
import java8.bean.PlayerDB;

public class ListToLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> sortedMap = PlayerDB.fetchAllPlayers().stream()
			.sorted(Comparator.comparing(Player::getAge))
			.collect(Collectors.toMap(Player :: getName, Player:: getAge, 
					(v1, v2) -> {
                        throw new IllegalStateException();
                    }
					, LinkedHashMap::new));
		
		System.out.println(sortedMap);
		
		
	}

}
