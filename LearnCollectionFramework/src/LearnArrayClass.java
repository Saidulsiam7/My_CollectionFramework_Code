import java.util.Arrays;

public class LearnArrayClass {

    public static void main(String[] args) {

//        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        int index = Arrays.binarySearch(numbers, 4);
//
//        System.out.println("The index of element 4 in the array is " + index);

        Integer[] numbers = { 10, 2, 32, 12, 15, 76, 48, 79, 9};
        Arrays.sort(numbers);
       // Arrays.fill(numbers, 12);  sob guli 12 hoye jabe

        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
