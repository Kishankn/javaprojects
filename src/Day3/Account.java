package Day3;

public class Account {
    String name;
    int accountno;
    double balance;

    Account(String name , int accountno,double balance) {this.name=name;this.accountno=accountno;this.balance=balance;}

    void display(){System.out.println("the name is" +this.name);
    System.out.println("account no" +this.accountno);
    System.out.println("balance" +this.balance);
    }

    public static void main(String[] args){
        new Account("charlie",123,5000 ).display();
    }
}

