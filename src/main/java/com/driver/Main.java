package com.driver;

public class Main {
    public static void main(String[] args) {
        A obj = new B();
//        obj.meth();
        System.out.println(obj.meth());
    }
}
class A{
   String meth(){
        return "Invoking method from class A";
   }
}
class B extends A{
    String meth(){
        return "Method is overridden in Extendend class B";
    }
}
