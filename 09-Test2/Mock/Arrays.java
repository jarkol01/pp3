public class Arrays {
    public static boolean arr(int[] arr1, int[] arr2) {
        int arr1Count = 0;
        int arr2Count = 0;

        for (int i : arr1) {
            if (i >= 10 && i <= 99) {
                arr1Count += 1;
            }
        }

        for (int i : arr2) {
            if (i >= 10 && i <= 99) {
                arr2Count += 1;
            }
        }
        
        if (arr1Count == arr2Count) {
            return true;
        } else {
            return false;
        }
    }
}
