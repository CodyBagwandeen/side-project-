import java.util.*; //random, scanner, arraylist
import java.io.*; //file, filenotfoundexception

public class schedule{
  private ArrayList<explainer> explainers;
  private intern[] interns;
  private advanced[] advances; // great name
  private master[] masters;
  private senior[] seniors;
  private String[][] data;

  public void addInterns() {
    Scanner scanner = new Scanner(System.in);
    // prompt for # of interns
    System.out.print("Enter number of Interns: ");
    int Count = scanner.nextInt();
    interns = new intern[Count];
    for ( int i = 0; i < Count; i++) {
      System.out.print("Enter name of Intern: ");
      String name = scanner.next();
      //System.out.println( name);
      intern person = new intern( name);
      interns[i] = person;
      //System.out.println( person);
      //interns.add(person);
    }
  }

  public void addAdvanced() {
    Scanner scanner = new Scanner(System.in);
    // prompt for # of interns
    System.out.print("Enter number of Advanced: ");
    int Count = scanner.nextInt();
    advances = new advanced[Count];
    for ( int i = 0; i < Count; i++) {
      System.out.print("Enter name of Advanced: ");
      String name = scanner.next();
      //System.out.println( name);
      advanced person = new advanced( name);
      advances[i] = person;
      //System.out.println( person);
      //interns.add(person);
    }
  }

  public void addMasters() {
    Scanner scanner = new Scanner(System.in);
    // prompt for # of interns
    System.out.print("Enter number of Masters: ");
    int Count = scanner.nextInt();
    masters = new master[Count];
    for ( int i = 0; i < Count; i++) {
      System.out.print("Enter name of Master: ");
      String name = scanner.next();
      //System.out.println( name);
      master person = new master( name);
      masters[i] = person;
      //System.out.println( person);
      //interns.add(person);
    }
  }

  public void addSeniors() {
    Scanner scanner = new Scanner(System.in);
    // prompt for # of interns
    System.out.print("Enter number of Seniors: ");
    int Count = scanner.nextInt();
    seniors = new senior[Count];
    for ( int i = 0; i < Count; i++) {
      System.out.print("Enter name of Senior: ");
      String name = scanner.next();
      //System.out.println( name);
      senior person = new senior( name);
      seniors[i] = person;
      //System.out.println( person);
      //interns.add(person);
    }
  }


  public schedule() {
    addInterns();
    addAdvanced();
    addMasters();
    addSeniors();
    data = new String[6][8];

  }



  public String toString() {
    String output = "";
    String people = " \n";
    for (int i=0; i< explainers.size() ;i++ ) {
      people += explainers.get(i);
    }
    output += people;
    return output;
  }
}
