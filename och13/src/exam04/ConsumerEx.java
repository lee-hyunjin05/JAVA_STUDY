package exam04;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;

public class ConsumerEx {

	public static void main(String[] args) {
		//		   리턴값없이 소비만 하는	파라메타					뿌려저
		Consumer<String> consumer = t -> System.out.println(t+"8");
		consumer.accept("1.java");
		//매개값은 있고 리턴값은 없는
		
		BiConsumer<String, String> biConsumer = (t,u) -> System.out.println(t+u);
		biConsumer.accept("2.Java", "8");
		
		DoubleConsumer doubleConsumer = d -> System.out.println("3.Java"+d);
		doubleConsumer.accept(8.0);
		
		ObjDoubleConsumer<String> objDoubleConsumer = (t,i) -> System.out.println(t+i);
		objDoubleConsumer.accept("4.JAva", 8);
	}
	
}
