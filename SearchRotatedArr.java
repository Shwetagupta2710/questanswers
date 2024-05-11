public class SearchRotatedArr {
    private static final int NOT_FOUND = -1;

    public static int search(int[] arr, int key) {
        if (arr == null || arr.length == 0) {
            return NOT_FOUND;
        }

        int rotatedIndex = findRotatedIndex(arr);

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int rotatedMid = (mid + rotatedIndex) % arr.length;

            if (arr[rotatedMid] == key) {
                return rotatedMid;
            } else if (arr[rotatedMid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return NOT_FOUND;
    }

    private static int findRotatedIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 6, 8, 9, 4, 1, 2};
        System.out.println(search(arr, 8)); // Output: 3
    }
}
