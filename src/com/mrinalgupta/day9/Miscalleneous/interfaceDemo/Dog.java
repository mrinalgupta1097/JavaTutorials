package com.mrinalgupta.day9.Miscalleneous.interfaceDemo;

public class Dog extends Animal1 implements Pet, ServiceAnimal {

  @Override
  public void eat() {
    System.out.println("eating");
  }

  @Override
  public void cuddle() {
    System.out.println("cuddling");
  }

  @Override
  public void help() {
    System.out.println("helping");
  }

  @Override
  public void guard() {
    System.out.println("guarding");
  }
}
