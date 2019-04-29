package edu.handong.csee.java.inheritance;

public class Cat extends Animal {
	
	String name = "Cat";
	
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.testClassMethod();
        myCat.testInstanceMethod();
        System.out.println(myCat.name);
        
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
        System.out.println(myAnimal.name);
        
        Animal myAnimal2 = new Dog();
        myAnimal2.testClassMethod();
        myAnimal2.testInstanceMethod();
    }
}
