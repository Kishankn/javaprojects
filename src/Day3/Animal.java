package Day3;

public class Animal {
    void eat(){
        System.out.println("dog eats");
    }
    static class dog extends Animal{
        void bark(){
            System.out.println("dog barks");
        }
    }
        public static void main(String[] args) {
            dog myDog = new dog();
            myDog.eat();
            myDog.bark();
    }
}

