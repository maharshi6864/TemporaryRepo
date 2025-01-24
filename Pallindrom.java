class Pallindrom {
  public static void main(String[] args) {

    int number = 121;
    int dupl = number;
    int newNumber = 0;

    while (number > 0) {
      int rem = number % 10;
      newNumber = (newNumber * 10) + rem;
      number = number / 10;
    }

    if (dupl == newNumber) {
      System.out.println("Pallindrom");
    } else {
      System.out.println("Not Pallindrom");
    }
  }
}