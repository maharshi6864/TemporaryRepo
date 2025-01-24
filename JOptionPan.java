import javax.swing.JOptionPane;

public class JOptionPan {
  public static void main(String[] args) {
    // Message Dialog
    // JOptionPane.showMessageDialog(null, "This is a message !!");
    // JOptionPane.showMessageDialog(null, "This is a message !!", "Pitle",
    // JOptionPane.ERROR_MESSAGE);

    // Input Dialog
    // String str = JOptionPane.showInputDialog(null, "Enter your name");
    // String str1 = JOptionPane.showInputDialog(null, "Enter your name", "Ritle",
    // JOptionPane.ERROR_MESSAGE);
    // System.out.println("Name is : " + str1);

    // String inp = JOptionPane.showInputDialog("Enter number to check odd or even
    // !!");
    // int number = Integer.parseInt(inp);
    // if (number % 2 == 0) {
    // System.out.println("Even Number");
    // } else {
    // System.out.println("Odd Number");
    // }

    // String inp1 = JOptionPane.showInputDialog("Enter value of a ");
    // String inp2 = JOptionPane.showInputDialog("Enter value of b ");
    // int a = Integer.parseInt(inp1);
    // int b = Integer.parseInt(inp2);
    // System.out.println("Addition of a and b : " + (a + b));

    // String inp1 = JOptionPane.showInputDialog("Enter number to check prime or
    // not");
    // int number = Integer.parseInt(inp1);
    // int count = 0;
    // for (int i = 1; i <= number; i++) {
    // if (number % i == 0) {
    // count++;
    // }
    // }

    // if (count == 2) {
    // System.out.println("Prime number !!");
    // } else {
    // System.out.println("Not a Prime number !!");
    // }

    // int choice = JOptionPane.showOptionDialog(null, "This is a message", "Witle",
    // 0, 0, null, null, null);

    // if (choice == 0) {
    // System.out.println("I am male");
    // } else {
    // System.out.println("I am Female");
    // }

    String[] fruits = { "mango", "apple", "cherry", "grapes" };

    int choice = JOptionPane.showOptionDialog(null, "This is a message", "Witle", 0, JOptionPane.INFORMATION_MESSAGE,
        null, fruits, null);

    System.out.println(fruits[choice]);

  }
}
