package com.mkyong.beans;

import java.util.Iterator;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private List<Address> addresses;// Aggregation

	public Employee(int id, String name, List<Address> addresses) {
		System.out.println("def cons");
		this.id=id;
		this.name=name;
		this.addresses=addresses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println(id + " " + name);

		Iterator<Address> itr = addresses.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}
