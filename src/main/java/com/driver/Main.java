package com.driver;

public class Main {
  public static void main(String[] args){
    B obj = new B();
    obj.meth;
    System.out.print(obj);
  }
}
class A{
  void meth(){
    System.out.print("Invoking method from class A");
  }
}
class B extends A{
  void meth(){
    System.out.print("Method is overridden in Extendend class B");
  }
}
