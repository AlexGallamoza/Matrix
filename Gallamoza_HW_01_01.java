import java.util.*;

public class Gallamoza_HW_01_01 {
  public static void main(String[] args) { 
    int option = -1;
    int command = 0;
    while(option != 0){
      menu();
      command++;
      option = getInt(); 
      switch(option){
        case 1:
          add();
          break;
        case 2:
          subtract();
          break;
        case 3:
          multiply();
          break;
        case 4:
          multiplyByConstant();
          break;
        case 5:
          transpose();
          break;
        case 6:
          trace();
          break;
        default:
          System.out.println("Testing completed");
          break;
      } 
      System.out.println("        Command number " + command + " completed");
      System.out.println();
    }
  }
  
  
  
  public static int getInt() {
    Scanner input = null;
    input = new Scanner (System.in);
    int number = 0;
    while (true) {
      try {
        number = input.nextInt();
        break;
      } catch (InputMismatchException e) {
        System.out.print("Not an integer. Try again.\nEnter a number: ");
        input.next();
      }
    }
    return number;        
  }
  
  
  public static int[][] generateMatrix(int size){
    
    int[][]matrix = new int[size][size];
    Random rand = new Random();
    for(int r = 0; r < matrix.length; r++){
      for(int c = 0; c < matrix[r].length; c++){
        matrix[r][c] = rand.nextInt(10) + 1;
      } 
    }
    return matrix;
  }
  
  
  public static void add(){
    
    System.out.print("Enter the size of square matrices: ");
    int size = getInt();
    
    int[][] matrix1 = generateMatrix(size);
    System.out.println("First matrix is: ");
    print(matrix1);
    int[][] matrix2 = generateMatrix(size);
    System.out.println("Second matrix is: ");
    print(matrix2);
    int[][] result = new int[size][size]; 
    System.out.println("The resulting matrix is: ");
    for(int r = 0; r < matrix1.length; r++){
      for(int c = 0; c < matrix1[r].length; c++){
        result[r][c] = matrix1[r][c] + matrix2[r][c];
      }
    }
    print(result);
    
  }
  
  
  
  public static void subtract(){
    System.out.print("Enter the size of square matrices: ");
    int size = getInt();
    
    int[][] matrix1 = generateMatrix(size);
    System.out.println("First matrix is: ");
    print(matrix1);
    int[][] matrix2 = generateMatrix(size);
    System.out.println("Second matrix is: ");
    print(matrix2);
    int[][] result = new int[size][size]; 
    System.out.println("The resulting matrix is: ");
    for(int r = 0; r < matrix1.length; r++){
      for(int c = 0; c < matrix1[r].length; c++){
        result[r][c] = matrix1[r][c] - matrix2[r][c];
      }
    }
    print(result);
  }
  
  
  public static void multiply(){
    System.out.print("Enter the size of square matrices: ");
    int size = getInt();
    
    int[][] matrix1 = generateMatrix(size);
    System.out.println("First matrix is: ");
    print(matrix1);
    int[][] matrix2 = generateMatrix(size);
    System.out.println("Second matrix is: ");
    print(matrix2);
    int[][] result = new int[size][size]; 
    System.out.println("The resulting matrix is: ");
    for(int r = 0; r < matrix1.length ; r++){
      for(int c = 0; c < matrix1[r].length; c++){
        for(int j = 0; j < matrix1[r].length; j++){
          result[r][c] += matrix1[r][j] * matrix2[j][c];
        }
      }
    }
    print(result);
  }
  
  
  public static void multiplyByConstant(){
    System.out.print("Enter the size of square matrix: ");
    int size = getInt();
    System.out.print("Enter the multiplication constant: "); 
    int multConstant = getInt();
    int[][] matrix1 = generateMatrix(size);
    System.out.println("First matrix is: ");
    print(matrix1);
    int[][] result = new int[size][size]; 
    System.out.println("The resulting matrix is: ");
    for(int r = 0; r < matrix1.length; r++){
      for(int c = 0; c < matrix1[r].length; c++){
        result[r][c] = multConstant * matrix1[r][c];
      }
    }
    print(result);
  }
  
  
  
  public static void transpose(){
    System.out.print("Enter the size of square matrix: ");
    int size = getInt();
    int[][] matrix = generateMatrix(size);
    System.out.println("The matrix is: ");
    print(matrix);
    System.out.println("The resulting matrix is: ");
    int[][] result = new int[size][size];
    for(int r = 0; r < matrix.length; r++){
      for(int c = 0; c < matrix[r].length; c++){
        result[c][r] = matrix[r][c];
      }
    }
    print(result);
  }
  
  public static void trace(){
    int trace = 0;
    System.out.print("Enter the size of square matrix: ");
    int size = getInt();
    int[][] matrix = generateMatrix(size);
    System.out.println("The matrix is: ");
    print(matrix);
    System.out.println("The resulting matrix is: ");
    int[][] result = new int[size][size];
    for(int r = 0; r < matrix.length; r++){
      for(int c = 0; c < matrix[r].length; c++){
        if(r == c)
          trace += matrix[r][c];
      }
    }
    System.out.println("The trace for this matrix is: " + trace);
  }   
  
  
  public static void print(int[][] matrix){
    for(int r = 0; r < matrix.length; r++){
      for(int c = 0; c < matrix[r].length; c++){
        System.out.printf("%3d ",matrix[r][c]);
      }
      System.out.println();
    }
  }  
  
  public static void menu(){
    System.out.println("Your options are:");
    System.out.println("-----------------");
    System.out.println("        1) Add 2 matrices");
    System.out.println("        2) Subtract 2 matrices");
    System.out.println("        3) Multiply 2 matrices");
    System.out.println("        4) Multiply a matrix by a constant");
    System.out.println("        5) Transpose matrix");
    System.out.println("        6) Matrix trace");
    System.out.println("        0) EXIT");
    System.out.print("please enter your option:: ");
  }
  
  
  
  
  
  
  
  
}
