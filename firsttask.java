public class firsttask {

    public static void main(String[] args) {

        int[] numbers = {10, -2, 0, 8, -1, 0, 11, -3, 6, 2};

        int positive = 0;
        int negative = 0;
        int zero = 0;


        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                positive++;
            } else if (numbers[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }


        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        
        System.out.println("\nPositive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }
}