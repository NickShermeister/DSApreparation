public class loopTry {
  public static void main (String[] args) {
    int x = 1;
    System.out.println ("Not in the loop yet");
    while (x < 4){
      System.out.println("Gotta increment x now");
      System.out.println("Current x val " + x);
      x = x+1;
    }
    System.out.println("Post loop.");
  }
}
