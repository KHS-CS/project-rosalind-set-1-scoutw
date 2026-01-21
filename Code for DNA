
/**
 * Write a description of class ProblemDNA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProblemDNA
{
    public static void main() {
            final String data = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
            final int[] exampleExpectedCounts = new int[]{20,12,17,21};
            
        int[] output = nucleotideCounts(data);
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
        int a=0, c=0, g=0, t=0;
        
        for (int i = 0; i < dnaString.length();i++) {
            char nucleotide = dnaString.charAt (i);
            if (nucleotide == 'A') a++;
            else if(nucleotide == 'C') c++;
            else if(nucleotide == 'G') g++;
            else if(nucleotide == 'T') t++;
            
            
        }
        return new int[] {a,c,g,t}; 
    }
}
