//ABSTRACT
//  Initial version of a hangman game
//  Enhance KremalaGame.java
//ENHANCEMENT
//  Loop needed!
//  Importing a word_list library (No hardcoding!)
//  Adding words to existing library.add(impovement)
//  Create Methods for repetitive functions i.e(User_inputs)
//  Avoid type conversion/Better type interaction i.e. line89
//  Apply limits to amount of tries
//  Add visual effects from KremalaGame.java

package hangman_alpha;



import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class Hangman_alpha {

    
    public static void Print(String PR) {                                       //Shortcut.. Only for String(s)  ?Bad practise? 
      System.out.println(PR);
    }
    
        
    public static void main(String[] args) {
 
      ArrayList<String> wordArrayList = new ArrayList<String>();                // Hardcoding.. Copy paste from google word list.. https://stackoverflow.com/questions/16726946/java-add-each-word-to-an-arraylist
        for(String word : "algorithm template pseudo code artificial flow chart ethics media privacy teamwork pairs perseverance resilience google resource sequence repetition function selection procedure communication integer floating boolean field syntax binary decimal hexadecimal debug source equation matching symmetry byte kilobyte megabyte gigabyte terabyte petabyte deductive inductive logistics decomposition abstraction evaluation creativity computational education discovery machine hardware central digital analog variable constant mute network online offline editor iterate pixels software python java assembler argument graphics callback array database interpreter compiler bandwidth youtube precedence".split(" ")) {
            wordArrayList.add(word);}

        Print("Library");
        System.out.println(wordArrayList);

    int size = wordArrayList.size();
        
        System.out.println("Size of library "+"("+size+")"+" words");

    Random random = new Random();

    int randomIndex = random.nextInt(wordArrayList.size());
      String random_word = wordArrayList.get(randomIndex);
       Print("");
       Print("Random word ("+random_word+")"+" "+randomIndex+" of "+size);
      
    int letter_count = random_word.length();
      Print("letter_count "+letter_count);
      
      for (int y = 0; y < letter_count; y++){
        System.out.print("_ ");}
        System.out.print("  ---> Creating '_' inplace of each letter of word");
        Print("");
        Print("");
        
        
      for (int j = 0; j < letter_count; j++){                                 
        System.out.print(random_word.substring((j),(j+1)));                     // <type> substring -> from KremalaGame.java
        } Print(" ---> Using <substring type> to print/utilise each letter of word");
        Print("");
        
        Scanner letter_input = new Scanner (System.in);
        
        System.out.print("Letter? ");                                               
        String guess = letter_input.next();
        
        String guess_substring = guess.substring((0),(1));                      // Hardcoding?  [ String <-> substring ]
        
        ArrayList<String> found_andnotfound = new ArrayList<String>();          //Redundant type? Possible method needed?    
        
        for (int i = 0; i < letter_count; i++){
            if (random_word.substring((i),(i+1)).equals(guess_substring)) 
                {System.out.print(""+random_word.substring((i),(i+1))); found_andnotfound.add(random_word.substring((i),(i+1))); }
            else {System.out.print("_ "); found_andnotfound.add("_"); }
                }
           Print("");
           System.out.print(found_andnotfound);
           Print("");
           System.out.print(found_andnotfound.toString().replace("[", "").replace("]", "").replace(",", ""));   //Create method for better visual print
           Print("");
           Print("");
           Print("<Loop Needed>");                    
        
        // ***** Loop needed *****
        // for number_of_unique_letters repeat
        // word guessing_array =OR!= library.word
        
        
        
        
           Print("");
           Print("Letter? ");
           
           String guess_again = letter_input.next();
          
           String guess_substring_again = guess_again.substring((0),(1));
        
        for (int l = 0; l < letter_count; l++){
            if (random_word.substring((l),(l+1)).equals(guess_substring_again)) 
                { found_andnotfound.set(l, guess_again); }
                //else {if {System.out.print("_ "); found_andnotfound.set(l,"_"); }
                }
           Print("");
           System.out.print(found_andnotfound);
           Print("");
           System.out.print(found_andnotfound.toString().replace("[", "").replace("]", "").replace(",", ""));   //Create method
           //new try
           
           Print("");
           Print("");
           Print("Letter? ");
           String guess_again_again = letter_input.next();
          
           String guess_substring_again_again = guess_again_again.substring((0),(1));
        
        for (int l = 0; l < letter_count; l++){
            if (random_word.substring((l),(l+1)).equals(guess_substring_again_again)) 
                { found_andnotfound.set(l, guess_again_again); }
                }
           Print("");
           System.out.print(found_andnotfound);
           Print("");
           System.out.print(found_andnotfound.toString().replace("[", "").replace("]", "").replace(",", ""));  //Create method
           Print("");
           
        }

        
        
        
      
    }



