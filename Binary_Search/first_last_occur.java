package Binary_Search;

public class first_last_occur {

    public static int first(int[] arr, int target) {
        int s = 0, e = arr.length - 1;

        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                ans = mid;
                e = mid - 1;
            }

            if (arr[mid] < target)
                s = mid + 1;
            else
                e = mid - 1;

        }
        return ans;
    }

    public static int second(int[] arr, int target) {
        int ans1 = arr.length;
        int s = 0, e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                ans1 = mid;
                s = mid + 1;
            }

            if (arr[mid] < target)
                s = mid + 1;
            else
                e = mid - 1;

        }
        return ans1;
    }

    public static int[] solution(int[] arr, int target) {
        int first = first(arr, target);
        int second = second(arr, target);
        int[] ans = { first, second };

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 7, 7, 7, 8, 9, 10 };

        int[] ans = solution(arr, 7);

        int second = second(arr, 7);
        int first = first(arr, 7);
        System.out.println("Second occurence is : " + second);
        System.out.println("First occurence is : " + first);
    }
}
