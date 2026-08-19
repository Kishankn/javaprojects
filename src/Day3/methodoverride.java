package Day3;

class animal2{void sound(){System.out.println("animal sound");}}
class dog extends animal2{
    @Override void sound(){System.out.println("dog barks");}
}
public class methodoverride {
    public static void main(String[] args){
        dog d= new dog();
        System.out.println("the parent class methods is sound");
        d.sound();
        animal2 a= new animal2();
        d.sound();
    }
}
