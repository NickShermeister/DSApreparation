public class SimpleDotComCheck {
  public static void main (String[] args) {
    DotCom simple = new DotCom();
    int[] locations = {2, 3, 4};

    simple.setLocationCells(locations);

    String userGuess = "2";

    //Why not just have a bool....????
    String result = simple.checkYourself(userGuess);

    String testResult = "Try again.";

    if (result.equals("hit")) {
      testResult = "passed";
    }
    System.out.println(testResult);
  }
}
