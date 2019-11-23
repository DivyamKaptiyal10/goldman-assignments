package terminalOperations.joining;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java8.bean.Player;
import java8.bean.PlayerDB;

public class CollectorPartitionBy {

	public static void main(String[] args) {
		Map<Boolean, List<String>> youngPlayers= PlayerDB.fetchAllPlayers().stream()
		.collect(Collectors.partitioningBy(p -> p.getAge()>=33
			,Collectors.mapping(Player::getName, Collectors.toList())
		));
		System.out.println(youngPlayers);
	}

}
