public class Patterns{
    public static void main(String[] args){
        //Pyramid
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = num; j>i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Inverted Pyramid

        for (int i = num; i>=1; i--) {
            for (int j = num; j>i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Pyramid are done here now we are going to print the Right Handed Trinagle\n\n");
        // Right angled triangle
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Inverted Right angled Triangle
        System.out.println();

        for (int i = num; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Number Triangle 

        for (int i = 0; i <num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // floyd's Triangle

        int no = 1;
        for (int i = 0; i<num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(no);
                no++;
            }
            System.out.println();
        }

        System.out.println("Now we are gonna print the rectangle ");
        //code for the rectangle.
        for (int i = 1; i < num; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
System.out.println("\n");
        // Kokhla rectangle
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < 9; j++) {
                if (i==1 || i==num || j==1 ||j==num) {
                    System.out.print("* ");
                }else{
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }

}