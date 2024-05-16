package com.demo.proj.pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaStream {
	
	public static void main(String[] args) {
//		filterMethod();
//		filterMethod1();
//		
		System.out.println("Code updated");
		mapMethod();
	}
	

	private static void mapMethod() {
		Product p1 = new Product(111, "AMobile");
		Product p2 = new Product(222, "Laptop");
		Product p3 = new Product(100, "Charger");
		Product p4 = new Product(101, "Charger");
		
		List<Product> list = new ArrayList<>();
		list.add(p3);
		list.add(p2);
		list.add(p1);
		list.add(p4);
		
		List<String> nameList = list.stream().map(ele -> ele.getName()).sorted().toList();
		System.out.println(nameList);
		
		Set<String> nameList1 = list.stream().map(ele -> ele.getName()).sorted().collect(Collectors.toSet());
		System.out.println(nameList1);
		//Find number product whose name start with 'A' or 'D'
		
		long count = nameList.stream().filter(ele -> ele.startsWith("A") || ele.startsWith("L")).count();
		System.out.println(count);
		
		int idSum = list.stream().collect(Collectors.summingInt(ele -> ele.getId()));
		System.out.println("Sum "+ idSum);
		
		Optional<Product> opt = list.stream().filter(ele -> ele.getId() < 10).findAny();
		if(opt.isPresent()) {
			System.out.println(opt.get().getName());
		}
		
	}


	private static void filterMethod() {
		//stream filter.
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		List<Integer> result = new ArrayList<>();
		
		for(int i=0;i<list.size();i++)
		{
			int val = list.get(i);
			if(val % 2 == 0)
			{
				result.add(val);
			}
		}
		System.out.println(result);
		
	}

	private static void filterMethod1() {
		//stream filter.
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		List<Integer> result = list.stream().filter(ele -> ele % 2 ==0).toList();
		
		System.out.println("With stream\n"+result);
		
	}
}
class Product{
	int id;
	String name;
	
	public Product(int i, String n) {
		id = i;
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
}
