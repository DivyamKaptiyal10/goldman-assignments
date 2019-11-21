package java8.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EffectiveFinalLambda {
	//instance variable
static int numa =32;
	public static void main(String[] args) {

		int num = 3;
		List<Integer> list = new ArrayList<Integer>();
		list.add(23);
		//same variable name will not compile
		//Consumer<Integer> c = (num) -> {
		Consumer<Integer> c = (num1) -> {
			System.out.println(num);
			//instance variable can be nmodified
			numa++;
		};
		
		//effective final
		Consumer<Integer> c1 = (num1) -> {
			System.out.println(num);
			list.add(32);
			//list= new ArrayList<Integer>();
			//can not modify
			//System.out.println(++num);
		};
	}

}
