package Day3;

public class Product {
    String name;int bno;int pp;
    Product(String name,int bno,int pp){
        this.name=name;
        this.bno=bno;
        this.pp=pp;

    }
    public static void main(String[] args){
        Product p1=new Product("laptop",123 ,500);
        System.out.println("name of product"+p1.name);
        System.out.println("batch no of product"+p1.bno);
        System.out.println("product price"+p1.pp);

        Product p2=new Product("mobile",312 ,50000);
        System.out.println("name of product"+p2.name);
        System.out.println("batch no of product"+p2.bno);
        System.out.println("product price"+p2.pp);







    }
}


