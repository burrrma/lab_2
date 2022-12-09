import java.util.regex.*;
import java.util.Scanner;

class lab2_2 {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        System.out.println("Введите пароль. Пароль может состоять из цифр, английских букв и знаков подчёркивания: ");
        String password = input.nextLine();

        String key = "[a-zA-Z_0-9[_]]{8,}";
        Pattern capital = Pattern.compile("[A-Z]");
        Pattern uppercase = Pattern.compile("[a-z]");
        Pattern number = Pattern.compile("[0-9]");
        Pattern pattern_key = Pattern.compile(key); 
        Matcher matcher_uppercase = uppercase.matcher(password);
        Matcher matcher_capital = capital.matcher(password);
        Matcher matcher_key = pattern_key.matcher(password);
        Matcher matcher_number = number.matcher(password);

        if (matcher_key.find()&&matcher_capital.find()&&matcher_uppercase.find()&&matcher_number.find()) {
              System.out.print("Пароль надёжен");
           }

          else {
          System.out.print("Пароль ненадёжен. Повторите ввод.");
          }
    
   }
}
