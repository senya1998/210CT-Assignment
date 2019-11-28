package Basic1to3;

import java.io.File;
import java.util.Scanner;
 
public class CheckSubString {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "";
        Scanner s = new Scanner(System.in);  
        //Ask user for inputing
        System.out.println("enter string1¡G");
        if (s.hasNext()) {
            str1 = s.next();
            System.out.println("you input " + str1);
        }
        //ask user for inputing 
        System.out.println("enter string2¡G");
       if (s.hasNext()) {
            str2 = s.next();
            System.out.println("you input " + str2);
        }
        
        boolean status = str1.contains(str2);
        if(status == true){
        System.out.println("string2 is the substring of string1");
        }else{
            System.out.println("string2 is not the substring of string1");
        }
    }
}

