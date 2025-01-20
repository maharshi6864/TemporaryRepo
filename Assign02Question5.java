public class Assign02Question5 {
  public static void main(String[] args) {

    int[][] arr = { { 56, 34, 45 }, { 67, 34, 23 }, { 56, 78, 90 } };
    System.out.println("Diplaying Unsorted array !!");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (min > arr[i][j]) {
          min = arr[i][j];
        }
      }
    }

    System.out.println("Minimum value is : " + min);
  }
}
