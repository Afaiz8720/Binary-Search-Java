package Binary_Search;

public class search_rotated {
    public static int solution(int[] arr, int target) {
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int mid = (s + e) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[s] <= arr[mid]) {
                if (arr[s] < target && target <= arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else {
                if (arr[e] <= target && target <= arr[mid]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int solution_2(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low = mid + 1;
                high = mid - 1;
                continue;
            }

            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 1, 2, 3, 3, 3, 4, 5, 6 };
        int target = 3;
        int ans = solution_2(arr, target);
        System.out.println("Search is : " + ans);
    }
}
