class SimpleCalculator {
    String owner;

    void addNumbers(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(owner + ":" + num1 + " + " + num2 + " = " + result);
    }
}
public class Day3 {
    public static void main(String[] args) {

        SimpleCalculator myCalc = new SimpleCalculator();
        myCalc.owner = "Alex";

        SimpleCalculator friendCalc = new SimpleCalculator();
        friendCalc.owner = "Sam";

        myCalc.addNumbers(5, 10);
        friendCalc.addNumbers(20, 30);
    }
}

