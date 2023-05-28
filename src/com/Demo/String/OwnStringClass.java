package com.Demo.String;

public final class OwnStringClass {

	private final int number;
	private final Address address;
	
	public OwnStringClass(int number, Address address) {
		this.number = number;
		this.address = address;
	}


	public int getNumber() {
		return number;
	}

	public Address getAddress() {
		return address;
	}
	
	public int getLength(String str){
		int count=0;
		for(int i=0;i<=str.length();i++) {
			count++;
			}
		return count;
	}
	public int getIndex(String str,char c){
		int index=0;
		for(int i=0;i<=str.length();i++) {
			char ch=str.charAt(i);
			if(c==ch) {
				return i;
			}
			}
		return index;
	}
}
