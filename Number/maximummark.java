import java.util.Scanner;

public class maximummark {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of semesters: ");
        int sem = sc.nextInt();

        for (int i = 1; i <= sem; i++) {

            System.out.print("Enter no of subjects in semester " + i + ": ");
            int subjects = sc.nextInt();

            int max = -1;

            System.out.println("Enter marks:");

            for (int j = 0; j < subjects; j++) {

                int mark = sc.nextInt();

                if (mark < 0 || mark > 100) {
                    System.out.println("You have entered invalid mark.");
                    return;
                }

                if (mark > max)
                    max = mark;
            }

            System.out.println("Maximum mark in semester " + i + ": " + max);
        }
    }
}