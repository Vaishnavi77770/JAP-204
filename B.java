package bpack;

import apack.A;

public class B extends A {

    public B() {
        super();
        System.out.println("Class B Constructor Called");
    }

    public void display() {
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Public Variable: " + publicVar);
        System.out.println("Protected Variable: " + defaultVar);


    }
    public static void main(String[] args) {
        B objB = new B();
        objB.display();
    }
}
