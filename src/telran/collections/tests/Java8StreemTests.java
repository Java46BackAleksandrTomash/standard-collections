package telran.collections.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Java8StreemTests {
	static class Programmer {
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public String[] getTechnologies() {
			return technologies;
		}
		String name;
		int age;
		String [] technologies;
		public Programmer(String name, int age, String[] technologies) {
			
			this.name = name;
			this.age = age;
			this.technologies = technologies;
		}
		

	}
	List<Programmer>programmers;
	String[] technologies1 = {"Java", "SQL", "C++"};
	String[]technologies2 = {"Java"};
	String[]technologies3 = {"Java", "React", "SQL"};


@BeforeEach
void setUp() {
	programmers = Arrays.asList(new Programmer("Vasga", 30, technologies1),
			new Programmer("Petya", 25, technologies2),
			new Programmer("Sara", 35, technologies3));
}
	//////// 1 to many/////////////
	@Test
	void test() {
		int ar[][] = { { Integer.MAX_VALUE, 2 }, { 3, 4, 5 }, { 7 } };
		assertEquals((long) Integer.MAX_VALUE + 21, sumTwoDimArray(ar));
	}

	private Long sumTwoDimArray(int[][] ar) {

		return Arrays.stream(ar).flatMapToInt(a -> Arrays.stream(a)).asLongStream().sum();
	}
	@Test
	void averageProgrammersAge() {
		assertEquals(30.0, getAverageAge());
	}
	private Double getAverageAge() {
		
		//return programmers.stream().mapToInt(p ->p.getAge()).average().orElse(0);
		return programmers.stream().collect(Collectors.averagingInt(Programmer::getAge ));
	}
	@Test
	void mostPopularTechnolgyTest() {
		assertEquals("Java", getMostPopularTechnology());
	
		}
	private String getMostPopularTechnology() {
	
	return programmers.stream().flatMap(p -> Arrays.stream(p.getTechnologies()))
		.collect(Collectors.groupingBy(t ->t, Collectors.counting()))
		.entrySet().stream().sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
		.map(Map.Entry<String, Long> :: getKey)
		.findFirst().orElse(null);
	}
	@Test
	void printDigitStatistics() {
	int RamdomNum = 1_000_000;
	Random random = new Random();
	random.ints(RamdomNum, 0, Integer.MAX_VALUE).flatMap(n -> Integer.toString(n).chars()).boxed()
	.collect(Collectors.groupingBy(d -> d, Collectors.counting()))
	.entrySet().stream().sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
	.forEach(e -> System.out.printf("%c: %d\n", e.getKey(), e.getValue()));
	
	}
}


