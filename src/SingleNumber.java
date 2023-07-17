import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements : " );
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        int output = findSingleNumber(array);
        System.out.println("Output : " + output);
    }

    private static int findSingleNumber(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++){
//            System.out.print(result + " ^ " + array[i] + " -> ");
            result = result ^ array[i];
//            System.out.println(result);
        }
        return result;
    }
}
