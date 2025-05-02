import java.util.Scanner;

class exam {

    exam() {
        int hour;
        int min;
    }

    void add(int h1, int h2, int m1, int m2) {
        hour = h1 + h2;
        min = m1 + m2;

        System.out.println("exam: " + hour + ":" + min);
    }

    void subtract(int h1, int h2, int m1, int m2) {

        if (h1 > h2) {
            if (m1 >= m2) { // Corrected comparison
                hour = h1 - h2;
                min = m1 - m2;
            } else {
                hour = h1 - h2 - 1; // Handle negative minutes (add 60 and subtract 1 hour)
                min = m1 + 60 - m2;
            }
            System.out.println("exam: " + hour + ":" + min);
        } else if (h2 > h1) {
            if (m2 >= m1) {
                hour = h2 - h1;
                min = m2 - m1;
            } else {
                hour = h2 - h1 - 1;
                min = m2 + 60 - m1;
            }
            System.out.println("exam: " + hour + ":" + min);
        } else { // Handle equal hours
            if (m1 > m2) {
                hour = h1;
                min = m1 - m2;
                System.out.println("exam: " + hour + ":" + min);
            } else if (m2 > m1) {
                hour = h2;
                min = m2 - m1;
                System.out.println("exam: " + hour + ":" + min);
            } else { // Equal exams
                System.out.println("exams are equal.");
            }
        }
    }

    public static void main(String[] args) {

        exam t = new exam();
        Scanner sc = new Scanner(System.in);

        System.out.println("exam is in 24-hour format.");
        System.out.println("exam 1 (hour and minute):");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();

        System.out.println("exam 2 (hour and minute):");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();

        t.add(h1, h2, m1, m2);
        t.subtract(h1, h2, m1, m2);
    }
}
