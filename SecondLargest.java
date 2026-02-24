public class SecondLargest {

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1; // Not enough elements
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            return -1; // No second largest found
        }

        return second;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20};

        int result = findSecondLargest(arr);

        if (result != -1) {
            System.out.println("Second Largest Element: " + result);
        } else {
            System.out.println("No second largest element found");
        }
    }
}