package Day1;

public class idcards {
    public static void main(String[]args)
    {
        String id1="AdR";
        String id2="PAN";

        if(id1 == "DL")
        {
            System.out.println("you are distinction pass");
        }
        else if(id2 == "LC")
        {
            System.out.println("your firstclass");
        }
        else{
            System.out.println("Sorry not allowed neither don't have "+id1+ " or" +id2);
        }
    }
}
