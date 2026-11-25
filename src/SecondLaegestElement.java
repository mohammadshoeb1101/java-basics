public class SecondLaegestElement {
    // Write a function to get second largest element from the array.

        public static int findElement(int[] arr) {

            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }

        public static void main(String[] args) {
            int[] nums = {12, 35, 1, 10, 34};
            int result = findElement(nums);
            System.out.println(result + " is the largest number.");
        }
    }

