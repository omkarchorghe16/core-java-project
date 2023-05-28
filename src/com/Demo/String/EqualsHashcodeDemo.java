package com.Demo.String;

public class EqualsHashcodeDemo {

	int id;
	String name;
	String address;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	//will have to give proper implm when we overidding hashcode method
	//so now its having wrong impl
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	//if you will use default impl then you will get diff hashcode
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsHashcodeDemo other = (EqualsHashcodeDemo) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		EqualsHashcodeDemo e=new EqualsHashcodeDemo();
		e.setId(1);
		EqualsHashcodeDemo e1=new EqualsHashcodeDemo();
		e1.setId(1);
		System.out.println(e1==e);
		if(e.equals(e1)) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
	}
}
