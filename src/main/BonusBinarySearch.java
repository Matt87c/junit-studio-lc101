package main;

public class BonusBinarySearch {

    public static int binarySearch(int[] sortedNumbers, int n) {
        int right = sortedNumbers.length - 1;
        int left = 0;
        while (right >= left && right != 1) {
            int mid = left + ((right - left) / 2);
            if (sortedNumbers[mid] > n) {
                right = mid;
            } else if (sortedNumbers[mid] < n) {
                left = mid;
            } else {
                return mid;
            }
            if (left == sortedNumbers.length -1 || right == 1) {
                return -1;
            }
        }
        return -1;
    }
}
