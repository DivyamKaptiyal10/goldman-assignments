package java8.stream.factoryMethods;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AdvancedUnboxing {

	public static void main(String[] args) {

	List<Memory>	memories = IntStream.iterate(1, x -> x+1).limit(10)
		.mapToObj(i -> new Memory(i)).collect(Collectors.toList());
	System.out.println(memories);
	}
	
	

}
class Memory{
	int size;

	@Override
	public String toString() {
		return "Memory [size=" + size + "]";
	}

	public Memory(int size) {
		super();
		this.size = size;
	}
}
