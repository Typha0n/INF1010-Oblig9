import java.util.Scanner;
import java.io.File;

public class Sort{
  public static void main(String[] args) throws Exception {
    int antTraader = Integer.parseInt(args[0]);
    File innFil = new File(args[1]);
    String navnUtFil = args[2];

    Scanner in = new Scanner(innFil);
    String[] navnTabell = lesInnFil(in);

    int antPerTraad = navnTabell.length / antTraader;
    String[][] tabellArray = new String[antTraader][antPerTraad];

    int teller = 0;
    int tellerTabell = 0;

    for(String s : navnTabell){
      if(teller == antPerTraad){
        teller = 0;
        tellerTabell++;
      }
      tabellArray[tellerTabell][teller] = s;
      teller++;
    }
  }

  public static String[] lesInnFil(Scanner in){
    String[] navnTabell = new String[Integer.parseInt(in.nextLine())];
    int teller = 0;

    while(in.hasNextLine()){
      navnTabell[teller] = in.nextLine();
      teller++;
    }
    return navnTabell;
  }

  public static void skrivUtFil(){

  }
}
