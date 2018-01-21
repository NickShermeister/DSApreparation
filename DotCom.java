import java.util.ArrayList;
public class DotCom {
  ArrayList<String> locationCells;
  // int numOfHits;

  public void setLocationCells(ArrayList<String> newLocs) {
    locationCells = newLocs;
    // numOfHits = 0;
  }

  public String checkYourself(String guess) {
    // int newGuess = Integer.parseInt(guess);
    String result = "miss";
    int index = locationCells.indexOf(guess);

    if (index >= 0){
      locationCells.remove(guess);
      if(locationCells.isEmpty()) {
        result = "kill";
      } else {
        result = "hit";
      }
    }

    System.out.println("The result is: " + result);
    return result;
  }
}
