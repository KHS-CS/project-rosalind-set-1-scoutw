
/**
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProblemHAMM {
    public static void main() {
        // replace this string with the one from Project Rosalind
        final String inputDNA1 = "GAGCCTACTAACGGGAT";
        final String inputDNA2 = "CATCGTAATGACGGCCT";
        final int output = hammingDistance(inputDNA1, inputDNA2);
        // you can copy and paste from the terminal window into 
        //   Project Rosalind to check your answer
        System.out.println(output);
    }
        
    // This should take the given strings and return the number
    //   of times they differ at the same location
    private static int hammingDistance(String a, String b) {
        return 7;
    }    
}