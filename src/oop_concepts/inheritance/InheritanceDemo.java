package oop_concepts.inheritance;

/*
Problem:
Demonstrate inheritance and method overriding in Java.

Approach:
- Create base class Animal with sound()
- Create child class Dog that overrides sound()
- Call methods and observe runtime behavior

Time Complexity: O(1)
Space Complexity: O(1)
*/
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();

        Dog d = new Dog();
        d.sound();

        // Polymorphism example:
        Animal ref = new Dog();
        ref.sound();
    }
}
