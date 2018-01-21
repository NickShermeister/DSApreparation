public class SimpleDotComGame {
  public static void main (String[] args) {
    int numGuesses = 0;

    GameHelper helper = new GameHelper();

    DotCom simple = new DotCom();

    int randNum = (int)(Math.random()*5);

    int[] randLocs = {randNum, randNum+1, randNum+2};
    simple.setLocationCells(randLocs);
    boolean isAlive = true;

    while(isAlive){
      String guess = helper.getUserInput("Enter a number: ");
      numGuesses++;
      String result = simple.checkYourself(guess);
      if (result.equals("kill")){
        isAlive = false;
        System.out.println("You took " + numGuesses + " guesses.");
      }
    }
  }
}
