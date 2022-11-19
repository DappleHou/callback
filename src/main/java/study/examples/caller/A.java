package study.examples.caller;

import study.examples.callee.B;

public class A {
	//A call B
    public void fun(){
    	B b = new B();
    	b.fun(()->callMe());//register a callback function
    }
    
    public void callMe() {
    	System.out.println("This is a callback test");
    }
}
