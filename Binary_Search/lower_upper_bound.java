package Binary_Search;

public class lower_upper_bound {

    public static int lower_bound(int[] arr, int start, int end, int target) {
        if (start > end)
            return -1;

        int ans = -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] > target) {
            ans = mid;
            end = mid - 1;

        } else {

            start = mid + 1;
        }
        return ans;

    }

    public static int upper_bound(int[] arr, int start, int end, int target) {
        if (start > end)
            return -1;

        int ans = -1;
        int mid = start + (end - start) / 2;

        if (arr[mid] >= target) {
            ans = mid;
            end = mid - 1;
        } else {
            start = mid + 1;
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 7, 9, 10 };

        System.out.println("Lower bound index is : " + lower_bound(arr, 0, arr.length - 1, 2));
        System.out.println("Upper bound index is : " + upper_bound(arr, 0, arr.length - 1, 10));
    }
}
