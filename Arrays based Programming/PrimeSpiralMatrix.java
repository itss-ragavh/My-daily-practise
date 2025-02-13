import java.util.Arrays;
import java.util.Scanner;

public class PrimeSpiralMatrix {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number you want to :");
        int n=sc.nextInt();
        int[][]matrix=matrixMarker(n);
        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        String SpiralMatrix=spiralMaker(matrix,n);
        System.out.println("\n\n"+SpiralMatrix+"\n\n");
    }

   

    public static boolean isPrime(int n){
        if(n<2)return false;
        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static int[] primeArray(int count){
        int index=0,n=2;
        int []prime=new int[count];
        while (count>index) {
            if (isPrime(n)) {
                prime[index++]=n;
            }
            n++;
        }
        return prime;
    }
    public static int[][] matrixMarker(int n){
        int[] prime=primeArray(n*n);
        int[][]matrix=new int[n][n];
        int index=0;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                matrix[i][j]=prime[index++];
            }
        }
        return matrix;
    }
    public static String spiralMaker(int[][]matrix,int n){

        String res="";
        int left=0,right=n-1,top=0,bottom=n-1;

        while (left<=right && top<=bottom) {
            
            for (int i = left; i <= right; i++) {
                res+=matrix[top][i]+" ";
            }
            top++;
             for (int i = top; i <= bottom; i++) {
                res+=matrix[i][right]+" ";
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res+=matrix[bottom][i]+" ";
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res+=matrix[i][left]+" ";
                }
                left++;
            }
        }
        
        return res;
    }
}
/*
import java.util.*;

class SpiralPrimeMatrix {
    
public static void printSpiral(int[][] matrix, int n) {
        List<Integer> spiralOrder = new ArrayList<>();
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                spiralOrder.add(matrix[top][i]);
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                spiralOrder.add(matrix[i][right]);
            }
            right--;

            // Traverse from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiralOrder.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse from bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiralOrder.add(matrix[i][left]);
                }
                left++;
            }
        }

        // Print the result
        for (int num : spiralOrder) {
            System.out.print(num + " ");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    // Function to generate the first n*n prime numbers
    public static int[] generatePrimes(int count) {
        int[] primes = new int[count];
        int num = 2, index = 0;
        
        while (index < count) {
            if (isPrime(num)) {
                primes[index++] = num;
            }
            num++;
        }
        return primes;
    }

    // Function to fill an n x n matrix with prime numbers
    public static int[][] fillMatrixWithPrimes(int n) {
        int[] primes = generatePrimes(n * n);
        int[][] matrix = new int[n][n];
        
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = primes[index++];
            }
        }
        return matrix;
    }

    // Function to print matrix in spiral order
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Input: Size of matrix

        int[][] primeMatrix = fillMatrixWithPrimes(n);
        printSpiral(primeMatrix, n);
        sc.close();
    }
}
*/