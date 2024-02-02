package Unit03.Xtras;
import java.util.Scanner;
public class BasicTextAnalysis {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        scan.useDelimiter("\\Z");
        String textLines = scan.next();
        System.out.println("The text we read is: " + textLines);
        System.out.println("The text has "+textLines.length()+" characters");
        String word=textLines.substring(0, textLines.indexOf(" "));
        String sentence=textLines.substring(0,textLines.indexOf("."));
        System.out.println("The first word is: "+word);
        System.out.println("The first sentence is: "+sentence);

    }
}

// Enter your text interactively
// javac Unit03/Xtras/BasicTextAnalysis.java
// java Unit03.Xtras.BasicTextAnalysis

// Use a file as input
// javac Unit03/Xtras/BasicTextAnalysis.java
// cat Unit03/Xtras/gettysburg-address.txt | java Unit03.Xtras.BasicTextAnalysis
