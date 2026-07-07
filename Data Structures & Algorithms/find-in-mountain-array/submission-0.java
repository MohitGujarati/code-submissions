/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int length = mountainArr.length();
        
        // 1. Find the peak
        int peakIndex = findPeak(mountainArr, length);
        
        // 2. Search the ascending left half
        int result = binarySearch(mountainArr, target, 0, peakIndex, true);
        
        // 3. If not found, search the descending right half
        if (result == -1) {
            result = binarySearch(mountainArr, target, peakIndex + 1, length - 1, false);
        }
        
        return result;
    }

    private int findPeak(MountainArray arr, int length) {
        int start = 0;
        int end = length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) < arr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }

    private int binarySearch(
        MountainArray arr, int target, int start, int end, boolean isAscending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            int midVal = arr.get(mid);

            if (midVal == target) {
                return mid;
            }

            if (isAscending) {
                if (target > midVal) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < midVal) {
                    start = mid + 1;

                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
