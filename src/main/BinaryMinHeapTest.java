package main;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BinaryMinHeapTest {
	private static final double EPS = 0.01;
	
	@Test
	public void testBinaryHeap() {
		BinaryMinHeap<Integer> bh = new BinaryMinHeap<>();
		assertTrue(bh != null);
		assertEquals(bh.size(), 0);
	}

	@Test
	public void testInsert() {
		Double val = new Double(2.2);
		BinaryMinHeap<Double> bh = new BinaryMinHeap<>();
		bh.insert(val);
		assertEquals(bh.size(), 1);
		
	}

	@Test
	public void testExtractMin() {
		BinaryMinHeap<Double> bh = new BinaryMinHeap<>();
		bh.insert(2.0);
		bh.insert(1.0);
		bh.insert(99.0);
		assertEquals(bh.size(), 3);
		assertEquals(bh.extractMin(), 1.0, EPS);
		assertEquals(bh.size(), 2);
	}

	@Test
	public void testBuildHeap() {
		List<Integer> list = new ArrayList<>(Arrays.asList(5,21,8,43,7,2,1,7));
		BinaryMinHeap<Integer> bh = new BinaryMinHeap<>();
		bh.buildHeap(list);
		assertEquals(bh.size(), 8);
		assertTrue(bh.extractMin() == 1);
		assertTrue(bh.extractMin() == 2);
		assertTrue(bh.extractMin() == 5);
		assertTrue(bh.extractMin() == 7);
		assertTrue(bh.extractMin() == 7);
		assertTrue(bh.extractMin() == 8);
		assertTrue(bh.extractMin() == 21);
		assertTrue(bh.extractMin() == 43);

	}

}
