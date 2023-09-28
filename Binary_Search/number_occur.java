package Binary_Search;

public class number_occur {

    public static int first(int[] arr, int k) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == k) {
                first = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return first;
    }

    public static int second(int[] arr, int k) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == k) {
                last = mid;
                // look for larger index on the right
                low = mid + 1;
            } else if (arr[mid] < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return last;
    }

    public static int[] solution(int[] arr, int k) {
        int first = first(arr, k);
        if (first == -1)
            return new int[] { -1, -1 };
        int last = second(arr, k);
        return new int[] { first, last };
    }

    public static int count(int arr[], int x) {
        int[] ans = solution(arr, x);
        if (ans[0] == -1)
            return 0;
        return (ans[1] - ans[0] + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 8, 8, 11, 13 };

        int count = count(arr, 8);
        System.out.println("Number of occurence is : " + count);
    }
}
