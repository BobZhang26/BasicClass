public class binarySearch {
    public int search(int[] array, int integer) {
        if (array == null || array.length == 0) {
            return -1;
        }

        // step 1: define scope
        int left = 0;
        int right = array.length - 1;

        // step 2:
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == integer) {
                return mid;
            } else if (array[mid] < integer) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int integer = 9;
        System.out.println(new binarySearch().search(array, integer));
    }
}
