package Day6;

public class Examplefreq {
        public static void main(String[] args) {

            int[] arr = {1, 2, 2, 3, 1, 1};

            for (int i = 0; i < arr.length; i++) {

                int count = 0;
                boolean duplicate = false;

                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        duplicate = true;
                        break;
                    }
                }

                if (duplicate)
                    continue;

                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                System.out.println(arr[i] + " = " + count);
            }
        }
    }