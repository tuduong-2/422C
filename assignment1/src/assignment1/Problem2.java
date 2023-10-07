/* Student Name: Tu Duong, Lab Section: 17645 */
package assignment1;
import java.util.Scanner;

public class Problem2
{
    // The wicked wizard's wily wraith garnishes his master's pasta with garlic
    public static void main(String[] args)
    {
        // create a new Scanner object
        Scanner u = new Scanner(System.in);
        // first input is the string
        String str = u.nextLine();
        // splits the string input into arrays of individual words
        String[] arr = str.split(" ");
        // going through the array of strings
        for(int i = 0; i < arr.length; i++)
        {
            int sum = 0;
            // going through each character of the current word
            for(int j = 0; j < arr[i].length(); j++)
            {
                char currentChar = arr[i].charAt(j);
                // if currentChar is an alphabetical letter then updates sum accordingly
                if(currentChar >= 'a' && currentChar <= 'z')
                    sum += currentChar - 'a' + 1;
                else if(currentChar >= 'A' && currentChar <= 'Z')
                    sum += currentChar - 'A' + 1;
            }
            // if the word adds up to 100, print it out
            if(sum == 100)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
