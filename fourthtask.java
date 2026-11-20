public class fourthtask {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        // Print original array
        System.out.print("Original: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Print array in reverse order
        System.out.print("\nReversed: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
