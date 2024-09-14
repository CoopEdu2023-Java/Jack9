class BinarySearch {

    // 使用二分查找算法实现搜索插入位置
    public static int searchInsert(int[] nums, int target) {
        int left = 0; // 初始化左边界
        int right = nums.length - 1; // 初始化右边界

        while (left <= right) { // 当左边界不超过右边界时
            int mid = left + (right - left) / 2; // 计算中间索引，防止溢出

            if (nums[mid] == target) { // 如果找到目标值，返回其索引
                return mid;
            } else if (nums[mid] < target) { // 如果中间值小于目标值，目标值在右半部分
                left = mid + 1;
            } else { // 如果中间值大于目标值，目标值在左半部分
                right = mid - 1;
            }
        }

        // 如果没有找到目标值，返回插入位置
        return left;
    }

    // 正确的主方法
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("插入位置: " + searchInsert(nums1, target1)); // 输出: 2

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        System.out.println("插入位置: " + searchInsert(nums2, target2)); // 输出: 1

        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        System.out.println("插入位置: " + searchInsert(nums3, target3)); // 输出: 4
    }
}
