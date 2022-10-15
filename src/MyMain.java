import java.util.Scanner;

/*
Define an custom exception (i.e. user defined exception) class called "MyFirstException".
This class contains a parameterized constructor which accept one argument String message.
Whenever this exception arise will print "Custom Exception Occurred".
Create another class called MyMain.
This class contains main method, to perform sum of two user given values by using Scanner class.
If the sum is less than 150 throw user defined exception or else display sum.

sample input output

input
     a = 30;
     b = 40;
     sum = a + b;
     as sum is 70 .. then

     output
     Custom Exception Occurred
 */
public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number one");
        int number1 = scanner.nextInt();
        System.out.println("enter umber two");
        int number2 = scanner.nextInt();
        MyMain myMain = new MyMain();
        try {
            int sum = myMain.sum(number1, number2);
            System.out.println("sum = " + sum);
        }catch(MyFirstException e){
            System.out.println(e.getMessage());
        }

    }
    public int sum(int number1, int number2) throws MyFirstException{
        //throws is used to forward or propagate exception 
        int sum = number1 + number2;
        if(sum < 150){
            //creating exception object
            MyFirstException myFirstException = new MyFirstException("sum is less then 150, Custom Exception Occurred");
            // to generate exception we use throw keyword
            throw myFirstException;
        }
        return sum;
    }
}
