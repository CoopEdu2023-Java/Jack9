
class BinarySearch {
    public static int binarySearch( int n, int a[], int target) {
        int left = 0;
        int right = a.length - 1, mid;
        while(left <= right){
            mid = (left + right) / 2;
            if(a[mid] == target){
                return mid;
            }else if(a[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
    
}
