public class PrintPattern1 {
    public static void main(String[] args) {

        int size;
        if (args.length > 0) {
            size = Integer.parseInt(args[0]);
        } else {
            size = 0;
        }

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
