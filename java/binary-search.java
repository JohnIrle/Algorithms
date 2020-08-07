class binarySearch {

    public static int binarySearch(int[] arr, int item) {
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high) {
            int mid = (low + high) / 2;
            int guess = arr[mid];
            if (guess == item) {
                return mid;
            } else if(guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] test_arr = {1, 3, 5, 7, 9};

        System.out.println(binarySearch(test_arr, 3));
        System.out.println(binarySearch(test_arr, -1));
    }
}
