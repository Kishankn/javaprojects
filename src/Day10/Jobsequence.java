package Day10;
import java.util.*;
public class Jobsequence {
    static class job{
        String name;
        int deadline;
        int profit;
        job (String name, int deadline, int profit){
            this.name = name;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args){
        job[] jobs = {
                new job("a", 2, 100),
                new job("b", 1, 50),
        };
    }

    }