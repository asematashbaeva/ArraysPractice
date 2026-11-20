public class thirdtask {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60};

        int sum = 0;
        double average;
        int count = 0;


        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }


        average = (double) sum / numbers.length;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }

        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }


        System.out.println("\nAverage: " + average);
        System.out.println("Numbers above average: " + count);
    }
}