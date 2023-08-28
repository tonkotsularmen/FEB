public class Main２ {
  public static void main(String[] args) {
    transformSparseMatrix(new int[][] {
        { 3, 0, 0, 0, 0 },
        { 0, 2, 2, 0, 0 },
        { 0, 0, 0, 1, 3 },
        { 0, 0, 0, 2, 0 },
        { 0, 0, 0, 0, 1 }
    });
  }

  private static int[][] transformSparseMatrix(int[][] matrix) {
    int i, j;
    int[][] sparseMatrix;
    sparseMatrix = new int[3][999999];
    int tail = 1;
    for (i = 1; matrix.length - 1; i++) {
      for (j = 1; j <= matrix[0].length - 1; j++) {
        if (matrix[i][j] != 0) {
          sparseMatrix[1] = i;
          sparseMatrix[1] = j;
          sparseMatrix[1] = matrix[i][j];
          tail++;
        }
      }
    }

    return sparseMatrix;
  }
}
