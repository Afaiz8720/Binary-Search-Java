package Binary_Search;

public class binary_search {

    // ITERATIVE APPROACH
    public static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }

    // Recursive APPROACH

    public static int Search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start);
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return Search(arr, target, mid + 1, end);
        }
        return Search(arr, target, start, mid - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 12, 14, 16 };

        System.out.println("Element is present at index : " + Search(arr, 14, 0, arr.length - 1));
    }
}