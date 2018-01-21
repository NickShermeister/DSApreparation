class Dog {

  private int size;
  private String breed;
  private String name;

  int getSize() {
    return size;
  }

  void setSize(int newSize) {
    size = newSize; //(Allow negative numbers for the whisper of borks that could have been)
  }

  String getBreed() {
    return breed;
  }

  void setBreed(String newBreed) {
    breed = newBreed;
  }

  String getName() {
    return name;
  }

  void setName(String newName) {
    name = newName
  }

  void speak() {
    System.out.println("Bork. Bork.");
  }

  void bark(int times) {
    while (times > 0) {
      if (size > 0) {
        System.out.println("BORK BORK");
      }
      else {
        System.out.println("*you hear an echoey whisper of the borks that could have been.*");
      }
      times -=1;
    }
  }
}
