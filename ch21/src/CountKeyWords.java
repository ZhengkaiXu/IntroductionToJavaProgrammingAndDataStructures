import java.util.*;
import java.io.*;
public class CountKeyWords {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Java source file: ");
        String filename = input.nextLine();

        File file = new File(filename);
        if (file.exists()) {
            System.out.println("The number of keywords in " + filename + " is " + countKeywords(file));
        } else {
            System.out.println("File " + filename + " does not exist");
        }
    }

    public static int countKeywords(File file) throws IOException {
        // Array of all Java keywords + true, false and null
        String[] keywordString = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", "default", "do", "double",
        "else", "enum", "extends", "for", "final", "finally", "float", "goto", "if", "implements", "import", "instanceof", "long", "native", "new", "package", "private", "protected",
        "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while", "true", "false", "null"};

        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));
        int count = 0;

        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String word = input.next();
            if (keywordSet.contains(word)) {
                count++;
            }
        }

        return count;
    }
}
