import java.util.Scanner;

public class PrintPattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = 0;
        boolean invalid = true;
        while (invalid) {
            System.out.print("Enter the size: ");
            size = in.nextInt();
            in.nextLine();
            if (size > 5) {
                System.out.println("too big!");
            } else if (size < 1) {
                System.out.println("too small!");
            } else {
                invalid = false;
            }
        }

        for (int i = 1; i <= size; i++) {
            for (int j = i; j <= size + i - 1; j++) {
                System.out.print(j);
            }
            for (int j = size + i - 1; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = size; i >= 1; i--) {
            for (int j = i; j <= size + i - 1; j++) {
                System.out.print(j);
            }
            for (int j = size + i - 1; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
