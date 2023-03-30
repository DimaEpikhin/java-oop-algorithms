package telran.util.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ArrayListTest {

	@Test
	void testAdd() {
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<String> strings = new ArrayList<>();
		numbers.add(5);
		numbers.add(10);
		strings.add("ABC");
		assertEquals(2, numbers.size());
		assertEquals(1, strings.size());
	}
	@Test
	void testRemove() {
		ArrayList<Integer> list = new ArrayList<>(10);
		list.add(0, 1);
		list.add(1, 2);
		int removed = list.remove(0);
		assertEquals(1, removed);
		assertEquals(1, list.size());
		assertEquals(2, list.get(0));
	}
	@Test
	void testGet() {
		ArrayList<Integer> list = new ArrayList<>(10);
		list.add(0, 1);
		list.add(1, 2);
		int result = list.get(1);
		assertEquals(2, result);
	}

}
