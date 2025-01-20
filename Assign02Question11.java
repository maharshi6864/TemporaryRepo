import java.util.Scanner;

class Admin {
  int id;
  int enrollementNumber;
  String name;

  void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter id : ");
    id = sc.nextInt();
    System.out.println("Enter enrollement Number : ");
    enrollementNumber = sc.nextInt();
    System.out.println("Enter name : ");
    name = sc.next();
  }

  void display() {
    System.out.println("Admin id: " + id);
    System.out.println("Admin enrollment number: " + enrollementNumber);
    System.out.println("Admin name: " + name);
  }
}

public class Assign02Question11 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of admin : ");
    int numberOfAdmin = sc.nextInt();

    Admin[] admins = new Admin[numberOfAdmin];

    for (int i = 0; i < admins.length; i++) {
      admins[i] = new Admin();
      admins[i].input();
    }

    for (Admin admin : admins) {
      admin.display();
    }
  }
}
