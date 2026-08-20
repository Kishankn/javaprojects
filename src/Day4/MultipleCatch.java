package Day4;

public class MultipleCatch {
    public static void main(String[] args){
                try {
                    int[] numbers={10,20,30};
                    int a = Integer.parseInt("100");
                    int b = 0;
                    System.out.println("Division by"+a/b);
                    System.out.println("Prime numbers array"+ numbers[5]);
                }catch (ArithmeticException e){
                    System.out.println("Arthimetic exception "+e.getMessage());
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("ArrayIndexOutOfBoundsException"+e.getMessage());
                } catch (NumberFormatException e) {
                    System.out.println("Arthimetic exception "+e.getMessage());
                }
                System.out.println("Program successful");
            }
        }