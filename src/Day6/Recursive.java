package Day6;

public class Recursive {

        public static int binaryRecursive(int[] arr, int left, int right, int target) {
            if (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    return mid;
                }

                if (arr[mid] < target) {
                    return binaryRecursive(arr, mid + 1, right, target);
                } else {
                    return binaryRecursive(arr, left, mid - 1, target);
                }
            }

            return -1;
        }

        public static void main(String[] args) {
            int[] numbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91, 92};
            int target = 8;

            int result = binaryRecursive(numbers, 0, numbers.length - 1, target);
            System.out.println("Element found at index: " + result);
        }
    }

