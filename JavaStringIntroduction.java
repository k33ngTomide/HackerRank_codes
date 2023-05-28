import java.io.*;
import java.util.*;

public class JavaStringIntroduction {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        String firstWord = scan.next();
        String secondWord = scan.next();
   
        int sum = firstWord.length() + secondWord.length();
        
        System.out.println(sum);
        int compare = firstWord.compareTo(secondWord);
        if (compare > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(firstWord.substring(0, 1).toUpperCase()+ firstWord.substring(1)+ " " + secondWord.substring(0, 1).toUpperCase()+ secondWord.substring(1));
        
    }
}

