import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array ;
        int[] checked ;

        String s;
//        int n = sc.nextInt();
        String n1 = sc.nextLine();
        int n2= Integer.parseInt(n1);
        int[] rez = new int[n2];
        if (n2>100) System.out.println(-1);else {

            for (int j = 0; j < n2; j++) {

                array = new int[55];
                checked = new int[55];
                s = sc.nextLine();

                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == 'B') {
                        array[i] = 1;
                    } else if (s.charAt(i) == 'S') {
                        array[i] = 2;
                    } else if (s.charAt(i) == 'D') {
                        array[i] = 3;
                    } else {
                        array[i] = 0;
                    }

                }

                for (int i = 0; i < array.length; i++) {
                    if (array[i] == 3) {
                        checked[i] = 1;
                    } else if (array[i] == 2) {
                        checked[i] = 1;
                        if (i < checked.length - 1) checked[i + 1] = 1;
                        if (i > 1) checked[i - 1] = 1;
                    } else if (array[i] == 1) {
                        checked[i] = 1;
                        if (i < checked.length - 1) checked[i + 1] = 1;
                        if (i > 1) checked[i - 2] = 1;
                    }
                }

                rez[j] = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (checked[i] == 0) rez[j]++;
                }


            }
            for (int j = 0; j < n2; j++) {
                System.out.println(rez[j]);
            }
        }
    }
}