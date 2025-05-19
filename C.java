// File: C.java (Package: cpack)
package cpack;

import apack.A;

public class C {

    // Method to display variables from an object of class A
    public void display() {
        A objA = new A();  // Creating an object of class A
        // Accessing variables from class A
        // System.out.println("Default Variable: " + objA.defaultVar);  // Not accessible from outside package
        // System.out.println("Protected Variable: " + objA.protectedVar);  // Not accessible from outside package
        // System.out.println("Private Variable: " + objA.privateVar);  // Not accessible
        System.out.println("Public Variable: " + objA.publicVar);  // Accessible because it's public
    }

    public static void main(String[] args) {
        C objC = new C();
        objC.display();
    }
}
