// Jonathan Su, Jan. 2021

class Main {
  public static void main(String[] args) {
    for (int bottles = 99999; bottles > 0; bottles--) {
      if (bottles == 1) {
        System.out.println(bottles + " bottle of stuff on the wall.");
      } else {
        System.out.println(bottles + " bottles of stuff on the wall.");
      }
      int newBottles = bottles - 1;
      if (newBottles <= 1) {
        System.out.println("Take one down, pass it around, " + newBottles + " bottle of stuff on the wall.");
      } else {
        System.out.println("Take one down, pass it around, " + newBottles + " bottles of stuff on the wall.");
      }
      System.out.println();
    }
  }
}