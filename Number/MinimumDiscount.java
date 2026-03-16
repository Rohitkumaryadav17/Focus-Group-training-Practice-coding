import java.util.*;

public class MinimumDiscount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String minItem = "";
        double minDiscount = Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();
            String[] data = line.split(",");

            String name = data[0];
            int price = Integer.parseInt(data[1]);
            int discount = Integer.parseInt(data[2]);

            double discountAmount = price * discount / 100.0;

            if (discountAmount < minDiscount) {
                minDiscount = discountAmount;
                minItem = name;
            }
        }

        System.out.println(minItem);
    }
}