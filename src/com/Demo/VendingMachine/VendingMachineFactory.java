package com.Demo.VendingMachine;

public class VendingMachineFactory {
	public static VendingMachine createVendingMachine() {
		return new VendingMachineImpl(); 
		}
	}

