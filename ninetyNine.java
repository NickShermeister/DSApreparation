public class ninetyNine {
  public static void main (String[] args){
    //Arguably, it shouldn't be "1 bottles of beer on the wall".
    //As you would have drunk 98 bottles of beer as of now, I'd argue you're drunk enough that it doesn't matter what's grammatically correct, as you would say bottles.
    int num = 99;
    String item = "bottes of beer";
    //Would use a "for" loop, but the textbook seems to want us to use while loops for now.
    while(num > 0){
      System.out.println(num + " " + item + " on the wall.");
      System.out.println(num + " " + item + "!");
      System.out.println("You take one down, pass it 'round,");
      num = num-1;

      if(num != 0){
        System.out.println(num + " number of " + item + "!");
      }
      else{
        System.out.println("No more " + item + " on the wall!");
      }
    }
  }
}
