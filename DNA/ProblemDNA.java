
/**
 * Write a description of class ProblemDNA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProblemDNA
{
    public static void main() {
        // replace this string with the one from Project Rosalind
        final String data = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
        final int[] exampleExpectedCounts = new int[]{20,12,17,21};
        int[] output = nucleotideCounts(data);
        // you can copy and paste from the terminal window into 
        //   Project Rosalind to check your answer
        System.out.println(formatData(output));
    }
    
    // This should take the array of counts and return a 
    //   space-delimited String with the respective counts
    //   in A C G T order
    private static String formatData(int[] counts) {
        String output = "";
        for( int count : counts ) {
            output += count + " ";
        }
        return output; 
    }
    
    // This should take the given string and return an int
    //   array of how many times each letter occurs in the 
    //   string. Ideally in A C G T order. 
    private static int[] nucleotideCounts(String dnaString) {
        return new int[]{20,12,17,21};
    }
}