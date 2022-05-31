class StringsTest {
  public static void main(String[] args) {
    String firstName = "Jonathan ";
    String lastName = "Su";
    String fullName = (firstName + lastName);
    System.out.println(fullName);

    String uppercase = fullName.toUpperCase();
    System.out.println(uppercase);

    String lowercase = fullName.toLowerCase();
    System.out.println(lowercase);

    System.out.println(fullName + " is 15 years old.");

    System.out.println("There is a \\ in this sentence.");

    int nameLength = fullName.length();
    System.out.println(nameLength);

    for (String separated: fullName.split(" ")) {
      System.out.println(separated);
    }

    String a = fullName.substring(4);
    System.out.println(a);
  }
}