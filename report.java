
import java.util.Scanner;

class ReportCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        String[] sub = {"English", "Maths", "Social", "Chemistry", "Physics", "Biology"};
        int total = 0;

        System.out.println("REPORT CARD");
        System.out.println("Name: " + name);

        for (String s : sub) {
            System.out.print(s + " marks: ");
            int m = sc.nextInt();
            total += m;
        }

        System.out.println("Total: " + total);
        System.out.println("Percentage: " + total / 6.0 + "%");

        sc.close();
    }
