public class MoveZeros {

    public static void moveZeros(int[] arr) {
        int nonZeroIndex = 0;

        // Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZeros(arr);

        System.out.print("After moving zeros: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}