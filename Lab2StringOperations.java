//Sara Alsaifi
//AP CS A Period 2
//28 August 2020

public class Lab2StringOperations{
  public static void main(String args[]){
    /*
    Challenge 1: this series of code scrambles words by putting the first half of the word after the second half.
    */
    String word1 = "scissors";
    int len1 = word1.length()/2;
    String firstHalf1 = word1.substring(0,len1);
    String secondHalf1 = word1.substring(len1);
    System.out.print(secondHalf1);
    System.out.println(firstHalf1);

    String word2 = "picture";
    int len2 = word2.length()/2;
    String firstHalf2 = word2.substring(0,len2);
    String secondHalf2 = word2.substring(len2);
    System.out.print(secondHalf2);
    System.out.println(firstHalf2);

    String word3 = "computer";
    int len3 = word3.length()/2;
    String firstHalf3 = word3.substring(0,len3);
    String secondHalf3 = word3.substring(len3);
    System.out.print(secondHalf3);
    System.out.println(firstHalf3);

    /*
    Challenge 2: this series of code makes ACSII art inspired by the images given in the assignment. For an extra challenge, I did it using one line of code. It is a bug!
    */
    System.out.println("   .   .\n    \\ /\n  `/ ! \\`\n  | o:o |\n ~| o:o |~\n / \\_:_/ \\");
  }
}    