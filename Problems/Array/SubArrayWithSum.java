// Solved using two pointers method
// Time complexity - O(n)
import java.util.*;

class SubArrayWithSum {
    public static void main(String[] args) {
        int[] arr = new int[6]; // given array
        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 20;
        arr[3] = 3;
        arr[4] = 10;
        arr[5] = 5;
        int k = 33; // given sum
        
        int left=0;
        int right=0;
        int currentSum = arr[0];
        while (right < arr.length) { // until right pointer reaches the last element
          if (currentSum == k) { // got the sum
            System.out.println("Sub Array is: ");
            for(int j=left; j<=right; j++) {
              System.out.print(arr[j]+ " ");
            }
            break;
          }
          else if (currentSum < k) { // if current sum is less than k move right one step
            right++;
            currentSum += arr[right];
          } else { // if current sum is greater than k move left one step
            currentSum -= arr[left];
            left++;
          }
        }
    }
}