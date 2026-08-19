package Day3;

public class FieldStudent {
    String name;
    FieldStudent(String name) {this.name=name;}
    void display(){System.out.println("the student name is"+this.name);}

    public static void main(String[] args){
        new FieldStudent("charlie").display();
    }
}