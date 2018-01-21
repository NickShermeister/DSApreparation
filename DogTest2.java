class DogTest2 {
  public static void main(String[] args){
    Dog d = new Dog();
    d.size = 40;
    d.bark(2);
    System.out.println("Now for the fake dog.");
    Dog e = new Dog();
    e.size = -1;
    e.bark(3);
  }
}
