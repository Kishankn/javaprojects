package day1;

public class hii {
    public static class Datatype{
        public void printVariable()
        {
            int age=25;
            System.out.println("by constructor"+age);

        }

    }
    public static void main(String[]args){
        int age=21;
        double salary=30000;
        char grade='A';
        boolean placed = false;
        String name="rahul";
        System.out.println(age);
        System.out.println(grade);
            System.out.println(placed);
            System.out.println(name);
            System.out.println(salary);
            Datatype dat= new Datatype();
            dat.printVariable();
    }

}
