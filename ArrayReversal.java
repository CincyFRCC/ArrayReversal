import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ArrayReversal {
    public static void main(String[] args) {
        int listnum = 0;
        List<Integer> list = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter values (-1 to stop)");
        int arraylenth = 0;
        while (arraylenth <= 100) {
            if (listnum == -1)
                break;
            System.out.print(":");
            listnum = in.nextInt();
            list.add(listnum);
            arraylenth += 1;
        }
        System.out.println("Your values, reversed:");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
