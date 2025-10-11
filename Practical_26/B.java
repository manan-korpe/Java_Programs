package bPack;

import aPack.A;

public class B extends A{
	public void display(){
		System.out.println("\nClass B called......");
		System.out.println("B extends A ");
		System.out.println("Public var "+ publicVar);
		System.out.println("Protected Var "+ protectedVar);
	}
}