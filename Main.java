import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
class Main {
  public static void main(String[] args) 
  {
    deleteMadLib();
    boolean flag = true;
    while(flag)
    {
      createMadLib();
      Scanner reader = new Scanner(System.in);
      createMadLib();
      System.out.println("You are now going to create your Mad-Lib. \nPlease enter only 1 word.\nFor best results use the pop up button in the top right corner of the console");

      System.out.print("Enter Adjective: ");
      String adjective1 = reader.next();
      System.out.println("");

      System.out.print("Enter name: ");
      String name1 = reader.next();
      System.out.println("");

      System.out.print("Enter verb: ");
      String verb1 = reader.next();
      System.out.println("");

      System.out.print("Enter place: ");
      String place1 = reader.next();
      System.out.println("");

      System.out.print("Enter adjective: ");
      String adjective2 = reader.next();
      System.out.println("");

      System.out.print("Enter verb: ");
      String verb2 = reader.next();
      System.out.println("");

      System.out.print("Enter verb: ");
      String verb3 = reader.next();
      System.out.println("");

      System.out.print("Enter adjective: ");
      String adjective3 = reader.next();
      System.out.println("");

      System.out.print("Enter adjective: ");
      String adjective4 = reader.next();
      System.out.println("");

      System.out.print("Enter name: ");
      String name2 = reader.next();
      System.out.println("");

      System.out.print("Enter Famous Person: ");
      String famousPerson = reader.next();
      System.out.println("");

      story1(adjective1, name1, verb1, place1, adjective2, verb2, verb3, adjective3, adjective4, name2, famousPerson);

      MadLibWords(adjective1, name1, verb1, place1, adjective2, verb2, verb3, adjective3, adjective4, name2, famousPerson);

      displayMadLib();
      System.out.print("would you like to start over(Y/N)?");
      String input = reader.next();
      deleteMadLib();
      if(input.equals("N"))
      {
        break;
      }
    }
  }
  public static void createMadLib()
  {
    try {
      File MadLibFile = new File("MadLib.txt");
      MadLibFile.createNewFile();
    } 
    catch (IOException e) 
    {
      System.out.println("An error occurred");
    }
  }
  public static void MadLibWords(String adjective1, String name1, String verb1, String place1, String adjective2, String verb2, String verb3, String adjective3, String adjective4, String name2, String famousPerson)
  {
    try
    {
      FileWriter words = new FileWriter("MadLibWords.txt");
      words.write("Adjective: " + adjective1);
      words.write("\nName: " + name1);
      words.write("\nVerb: " + verb1);
      words.write("\nPlace: " + place1);
      words.write("\nAdjective: " + adjective2);
      words.write("\nVerb: " + verb2);
      words.write("\nVerb: " + verb3);
      words.write("\nAdjective: " + adjective3);
      words.write("\nAdjective: " + adjective4);
      words.write("\nName: " + name2);
      words.write("\nFamous Person: " + famousPerson);
      words.close();
    }
    catch (IOException e) 
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  public static void story1(String adjective1, String name1, String verb1, String place1, String adjective2, String verb2, String verb3, String adjective3, String adjective4, String name2, String famousPerson)
  {
    try 
    {
      FileWriter words = new FileWriter("MadLib.txt");
      words.write("Once there was a rather " + adjective1 + "minded student who's name was " + name1 + ".\nAfter a long " + verb1 + ", he decided to set out on his own to " + place1 + ".\nWith his rather " + adjective2 + " self, he took his belongs and got ready for a long journey. \nDuring his trip, in which he was " + verb2 + ", he decided to stop at a local farm to " + verb3 + " with the cows.\nAfter that, he visted the local, " + adjective3 + " pea market.\nThere he met a " + adjective4 + " fisherman by the name of " + name2 + " who decided to help him with the rest of his journey.\nAfter a 10 long years, with the help of the fisherman, he finally made it to his destination.\nHowever just as " + famousPerson + " didn't know how to use maps, neither did\nour main charectar and he ended up exactly where he was before.");
      words.close();
      System.out.println("your Mad Lib is now finished!");
    } 
    catch (IOException e) 
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  public static void displayMadLib()
  {
    try 
    {
      File MadLib = new File("MadLib.txt");
      Scanner MadLibReader = new Scanner(MadLib);
      while (MadLibReader.hasNextLine()) 
      {
        System.out.println(MadLibReader.nextLine());
      }
      MadLibReader.close();
    } 
    catch (FileNotFoundException e) 
    {
      System.out.println("An error occurred.");
    }
  }
  public static void deleteMadLib()
  {
    File MadLib = new File("MadLib.txt"); 
    MadLib.delete();
    File MadLibWords = new File("MadLibWords.txt"); 
    MadLib.delete();
  }
}
