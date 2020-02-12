import java.util.Scanner;
public class footballPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length();
        int a = 0, b = 0;
        boolean ng = false;
        if (l <= 100) {
            for (int i = 0; i < l; i++) {
                if (s.charAt(i) == '0') {
                    a = 0;
                    b++;

                } else {
                    a++;
                    b = 0;

                }
                if (a == 7 || b == 7) {
                    ng = true;
                    break;
                }

            }

        }

            }

        }
