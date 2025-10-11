/* 26 Define a class A in package apack. In class A, three variables are defined of access modifiers
protected, private and public. Define class B in package bpack which extends A and write
display method which accesses variables of class A.
Define class C in package cpack which has one method display() in that create one object of
class A and display its variables. Define class ProtectedDemo in package dpack in which write
main () method. Create objects of class B and C and class display method for both these objects
package dpack

*/

import bPack.B;
import cPack.C;

public class ProtectedDemo{
	public static void main(String[] args){
		B objB = new B();
		objB.display();
	
		C objC = new C();
		objC.display();
	}
}