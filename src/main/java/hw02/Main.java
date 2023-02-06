package hw02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int taskChoice;
        while (true) {
            System.out.println("Для выбора задачи \n палиндром введите 1 \n 100 повторений: 2");
            try {
                taskChoice = Integer.parseInt(sc.next());
                if (taskChoice == 1) {
                    System.out.print(palindrom());
                    break;
                }
                if (taskChoice == 2) {
                    test100file();
                    break;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Введите корректный номер задачи");
            }
        }
    }

        public static boolean palindrom() {
        Scanner userString = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String palCheck = userString.next();
        if (palCheck.length() == 1) {
            return true;
        }
        for (int i = 0; i < palCheck.length()/2; i++) {
            if (palCheck.charAt(i) != palCheck.charAt(palCheck.length() - 1 - i))
                return false;
        }
        return true;
    }

        public static void test100file() {
        String userLine = "TEST";
        int userIter = 100;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < userIter; i++){
            builder.append(userLine);
        }

        try (PrintWriter out = new PrintWriter("res.txt"))
        {
            out.print(builder);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //System.out.println(builder);

    }
}
