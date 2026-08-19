package Day3;

public class StudentData {
        String name;int age;
        StudentData(String name,int age){
            this.name=name;
            this.age=age;

    }
    public static void main(String[] args){
            StudentData s1=new StudentData("bob",123);
            System.out.println("name of student"+s1.name);
            System.out.println("age of student"+s1.age);


            StudentData s2=new StudentData("dog",124);
            System.out.println("name of student"+s2.name);
            System.out.println("age of student"+s2.age);



    }
    }

