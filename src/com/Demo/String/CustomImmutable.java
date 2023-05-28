package com.Demo.String;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//Create class as final
public final class CustomImmutable {

	//private final variables
	private final int number;
	private final Address address;
	private final Map<String, String> metadata;
	//Date is mutable object
	private final Date dob;
	
	//initialize all field constructor
	//deep copy of constructor
	public CustomImmutable(int number, Address address,Map<String, String> metadata,Date dob) {
		//super();
		this.number = number;
		this.address = address;
		Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry :
             metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.metadata = tempMap;
        this.dob=new Date(dob.getTime());
	}

	
	//provide only getters not setters
		public int getNumber() {
			return number;
		}

		public Address getAddress() {
			Address address=new Address();
			address.setCity(address.getCity());
			address.setState(address.getState());
			return address;
		}
		
		public Map<String, String> getMetadata()
	    {
	        Map<String, String> tempMap = new HashMap<>();
	        for (Map.Entry<String, String> entry :
	             this.metadata.entrySet()) {
	            tempMap.put(entry.getKey(), entry.getValue());
	        }
	        return tempMap;
	    }

		public Date getDob() {
			//return dob;
			return new Date(dob.getTime());
		}

		@Override
		public String toString() {
			return "CustomImmutable [number=" + number + ", address=" + address + ", metadata=" + metadata + ", dob=" + dob
					+ "]";
		}
		
		
	public static void main(String args[]) {
		
		
		System.out.println("Mutability----------");
		Address addr1=new Address("abc", "xyz");
		Address addr2=new Address("abc", "xyz");
		System.out.println(addr1);
		System.out.println(addr1.getCity());
		System.out.println(addr1.getState());
		//addr1=new Address("abc", "xyz");
		
		addr1.setCity("pune");
		addr1.setState("Maharashtra");
		System.out.println(addr1);
		System.out.println(addr1.getCity());
		System.out.println(addr1.getState());
		
		System.out.println("--------------------------------------");
		System.out.println("Immutability----------");
		/*
		 * CustomImmutable immutable=new CustomImmutable(1, addr1, null, null);
		 * System.out.println(immutable);
		 * 
		 * immutable=new CustomImmutable(1, addr1, null, null);
		 * System.out.println(immutable);
		 */
	
		
		Map<String, String> map = new HashMap<>();
        map.put("1", "first");
        map.put("2", "second");
        Address add=new Address();
        add.setCity("pune");
        add.setState("maharashtra");
		
        CustomImmutable s = new CustomImmutable(101,add, map,new Date());
        System.out.println(s.getMetadata());
 
        // Uncommenting below line causes error
        // s.regNo = 102;
 
        System.out.println(s.hashCode());
        map.put("3", "third");
        System.out.println(s.getMetadata()); // Remains unchanged due to deep copy in constructor
        s.getAddress().setCity("mumbai");
        s.getMetadata().put("4", "fourth");
        System.out.println(s.getAddress().getCity()); // Remains unchanged due to deep copy in getter
        System.out.println(s.hashCode());
        
        System.out.println("-----------------------------------");
        System.out.println(s.getDob().hashCode());
        s.getDob().setTime(12324324345L);
        System.out.println(s.getDob());
        System.out.println(s.getDob().hashCode());
        
    }
	
	
	
	
}
