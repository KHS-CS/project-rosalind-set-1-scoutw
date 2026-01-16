
/**
 * Write a description of class ProblemRNA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProblemREVC {
    public static void main() {
        // replace this string with the one from Project Rosalind
        final String inputDNA = "AAAACCCGGT";
        final String output = reverseComplement(inputDNA);
        // you can copy and paste from the terminal window into 
        //   Project Rosalind to check your answer
        System.out.println(output);
    }
        
    // This should take the given string and return a String 
    //   where As and Ts are swapped, Cs and Gs are swapped, 
    //   and is reversed. 
    private static String reverseComplement(String dnaString) {
        return "ACCGGGTTTT";
    }    
}