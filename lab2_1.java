import java.util.regex.*;
import java.util.Scanner;


 public class lab2_1 {
  public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print ("Введите дату в формате dd/mm/yyyy: ");
        String date = in.nextLine();
    
        String pattern_general = "(((0[1-9]|[12][0-9]|3[01])[/](0[13579]|1[12]))|((0[1-9]|[12][0-9]|3[0])[/](0[468]|1[0]))|((0[1-9]|1[0-9]|2[0-8])[/](0[2])))[/](([1][9][0-9]{2}])|([2-9][0-9]{3}))";  
        String pattern_format = "(((0[1-9]|[12][0-9]|3[01])[^/](0[13579]|1[12]))|((0[1-9]|[12][0-9]|3[0])[^/](0[468]|1[0]))|((0[1-9]|1[0-9]|2[0-8])[^/](0[2])))[^/](([1][9][0-9]{2})|([2-9][0-9]{3}))"; 
        Pattern general = Pattern.compile(pattern_general);
        Pattern format = Pattern.compile(pattern_format);
        Matcher matcher_format = format.matcher(date);
        Matcher matcher_general = general.matcher(date);

          if (matcher_general.find()) {
            System.out.print("Введённое выражение является датой");
          }

          else {
            if (matcher_format.find()) {
              System.out.print("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
            }
               else {
                System.out.print("Введённое выражение не является датой");
             }
         }

      }
   }
 
