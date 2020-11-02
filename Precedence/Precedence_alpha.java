//PURPOSE
//  Incorporate Week1 learnings into code
//ABSTRACT
//  Simple Quiz on the Precedence of mathematical operators
//EVALUATION
//  Current version has limited capability.. 
//  Poor Main If/Else design..
//ENCHANTMENT
//  Learn more!
//  Include floats / randomBrackets()! 

package precedence_alpha;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;          //--------------------------------------------// Used in line 39
import java.util.Random;


public class Precedence_alpha {
    
      
  public static void Print(String PR) {                                         //Shortcut.. Only for String(s)  ?Bad practise? 
      System.out.println(PR);
    }
  
  public static String randomOperator() {                                       // Enhanced -> https://stackoverflow.com/questions/51615286/java-random-operator-call-the-same-method-into-the-method
      Random random = new Random();
      ArrayList<String> mathsymbol = new ArrayList<String>()
      { {add("*");add("/");add("+");add("-");} };
      int randomIndex = random.nextInt(mathsymbol.size());
      String rand = mathsymbol.get(randomIndex);
      return rand;
    }
  
    public static void main(String[] args) {      
      
        int[] num;
        
        Print("Simple Quiz on the Precedence of mathematical operators");
        Scanner scan = new Scanner(System.in);
        Print("How many numbers? p.s Aslong as its 3 at the moment...");
        int howmanynumbers = scan.nextInt();                                    // Size of integer array... Max 3...
                                          
        num = new int[howmanynumbers];
        for (int i = 0; i < howmanynumbers; i++){
        Print("Number " + (i+1) + "?"); int n = scan.nextInt(); num[i]=n;       // (i+1) < zero-based array numbering >
        }
        
        
        
        System.out.println("Numbers choosen    " +Arrays.toString(num));        // https://stackoverflow.com/questions/409784/whats-the-simplest-way-to-print-a-java-array
        //System.out.println("Numbers encrypted! " +num);                         // Otherwise! ( Array concatenated with String )
        Print("And now for some random operators!");
        Random random = new Random();
        String operator_first = randomOperator();
        String operator_second = randomOperator();
        Print("First Random Operator (" + operator_first + ")" +
              " Second Random Operator (" + operator_second + ")");
        
        Print("Can you solve : "+num[0]+" "+operator_first+" "+num[1]+" "+operator_second+" "+num[2]+" = ?");
        int user_answer = scan.nextInt();

        
        int mem_res_1;
        int mem_res_2;
        int res;
        
        
        if (((operator_first.equals("*")) | (operator_first.equals("/"))) & ((operator_second.equals("*"))||(operator_second.equals("/")))) 
        { 
                     
                                            if(operator_first.equals("*")) {
                                            mem_res_1 = num[0]*num[1];
                                            }else{
                                            mem_res_1 = num[0]/num[1];
                                            }
                                            {
                                            if(operator_second.equals("*")) {
                                            res = mem_res_1*num[2];
                                            }else{
                                            res = mem_res_1/num[2];
                                            }
                                            }
        }else
        if(((operator_first.equals("*")) | (operator_first.equals("/"))) & ((operator_second.equals("+")) | (operator_second.equals("-"))))
        { 
                     
                                            if(operator_first.equals("*")) {
                                            mem_res_1 = num[0]*num[1];
                                            }else{
                                            mem_res_1 = num[0]/num[1];
                                            }
                                            {
                                            if(operator_second.equals("+")) {
                                            res = mem_res_1+num[2];
                                            }else{
                                            res = mem_res_1-num[2];
                                            }
                                            }
        }else
        if(((operator_first.equals("+"))|(operator_first.equals("-")))&((operator_second.equals("*"))|(operator_second.equals("/"))))
        { 
                     
                                            if(operator_second.equals("*")) {
                                            mem_res_2 = num[1]*num[2];
                                            }else{
                                            mem_res_2 = num[1]/num[2];
                                            }
                                            {
                                            if(operator_first.equals("+")) {
                                            res = num[0]+mem_res_2;
                                            }else{
                                            res = num[0]-mem_res_2;
                                            }
                                            }
        }else
        { 
                     
                                            if(operator_first.equals("+")) {
                                            mem_res_1 = num[0]+num[1];
                                            }else{
                                            mem_res_1 = num[0]-num[1];
                                            }
                                            {
                                            if(operator_second.equals("+")) {
                                            res = mem_res_1+num[2];
                                            }else{
                                            res = mem_res_1-num[2];
                                            }
                                            }
        }
        if (res==user_answer){                                                  //Primitive!
                Print("Congratulations! The correct the answer is " + res);}
        else Print("Sorry wrong answer..");
    }}
