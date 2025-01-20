public class Assign02Question6 {
  public static void main(String[] args) {

    int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    // Displaying matrix !!
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (i == j) {
          sum += arr[i][j];
        }
      }
    }

    System.out.println("Sum of the diagonal elements is  : " + sum);
  }
}
