/* Student Name: Tu Duong, Lab Section: 17645 */
package assignment1;
import java.util.Scanner;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;

public class Problem3
{
    // I was slowly walking to the park with my over enthusiastic dog when he bit me, and I shouted, Ouch!
    public static void main(String[] args)
    {
        // create a new Scanner object
        Scanner u = new Scanner(System.in);
        // first input = string
        String str = u.nextLine();
        // create a new tagger object
        MaxentTagger tagger = new MaxentTagger("english-bidirectional-distsim.tagger");
        // get new string with attached tagger using the .tagString method
        String taggedStr = tagger.tagString(str);
        // print the new tagged string out
        System.out.println(taggedStr);
    }
}
