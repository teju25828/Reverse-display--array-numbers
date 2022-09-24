import java.util.Scanner;

public class DisplayReverseArray {
    public static void main(String[] args) {
        System.out.println("enter number of elements you want to enter in array-->");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int array[];
        array = new int[count];
        System.out.println("Enter " + count + " integer numbers in array-->");
        for (int i = 0; i < count; i++)
            array[i] = scanner.nextInt();
        System.out.println("All array elements in normal order are-->");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("All array elements in reverse order are-->");
        for (int i = (array.length-1); i >= 0 ; i--) {
                System.out.println(array[i]);
        }
    }
}
