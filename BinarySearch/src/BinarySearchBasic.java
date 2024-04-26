public class BinarySearchBasic {
    public static void main(String[] args) {
        /*int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        System.out.println(binarySearchBasic(a, 7));
        System.out.println(binarySearchBasic(a, 13));
        System.out.println(binarySearchBasic(a, 21));
        System.out.println(binarySearchBasic(a, 30));
        System.out.println(binarySearchBasic(a, 38));
        System.out.println(binarySearchBasic(a, 44));
        System.out.println(binarySearchBasic(a, 52));
        System.out.println(binarySearchBasic(a, 53));
        System.out.println(binarySearchBasic(a, 555));
        System.out.println(binarySearchBasic(a, 556));*/

        int[] b = {1, 2, 4, 4, 4, 6, 7};
        /*System.out.println(binarySearchLeftMost1(b, 4));
        System.out.println(binarySearchLeftMost1(b, 1));
        System.out.println(binarySearchLeftMost1(b, 2));
        System.out.println(binarySearchLeftMost1(b, 6));
        System.out.println(binarySearchLeftMost1(b, 7));
        System.out.println(binarySearchLeftMost1(b, 0));
        System.out.println(binarySearchLeftMost1(b, 8));*/

        System.out.println(binarySearchRightMost1(b, 4));
        System.out.println(binarySearchRightMost1(b, 1));
        System.out.println(binarySearchRightMost1(b, 2));
        System.out.println(binarySearchRightMost1(b, 6));
        System.out.println(binarySearchRightMost1(b, 7));
        System.out.println(binarySearchRightMost1(b, 0));
        System.out.println(binarySearchRightMost1(b, 8));

    }

    // 二分查找基础版
    public static int binarySearchBasic(int[] a, int target) {
        // 设置指针并赋初值

        int i = 0;
        int j = a.length - 1;

        while (i <= j) {
//            int m = (i + j) / 2;
            int m = (i + j) >>> 1;
            if (target < a[m]) {        // 目标在左边
                j = m - 1;
            } else if (a[m] < target) { // 目标在右边
                i = m + 1;
            } else { // 找到了
                return m;
            }
        }
        // 没有找到
        return -1;
    }

    // 二分查找最左侧
    public static int binarySearchLeftMost1(int[] a, int target) {
        // 设置指针并赋初值

        int i = 0;
        int j = a.length - 1;
        int candidate = -1;

        while (i <= j) {
//            int m = (i + j) / 2;
            int m = (i + j) >>> 1;
            if (target < a[m]) {        // 目标在左边
                j = m - 1;
            } else if (a[m] < target) { // 目标在右边
                i = m + 1;
            } else { // 找到了
                candidate = m;
                j = m - 1;
            }
        }
        // 没有找到
        return candidate;
    }

    /**
     * binarySearchRightMost1
     *
     * @param a--待查找的升序数组
     * @param target--待查找的数值
     * @return 找到返回索引
     * 找不到返回-1
     */
    public static int binarySearchRightMost1(int[] a, int target) {
        // 设置指针并赋初值

        int i = 0;
        int j = a.length - 1;
        int candidate = -1;

        while (i <= j) {
//            int m = (i + j) / 2;
            int m = (i + j) >>> 1;
            if (target < a[m]) {        // 目标在左边
                j = m - 1;
            } else if (a[m] < target) { // 目标在右边
                i = m + 1;
            } else { // 找到了
                candidate = m;
                i = m + 1;
            }
        }
        // 没有找到
        return candidate;
    }

    /**
     * @param a--待查找的升序数组
     * @param target--待查找的数值
     * @return 返回 >= target 的最靠左索引
     */
    public static int binarySearchLeftMost2(int[] a, int target) {
        // 设置指针并赋初值

        int i = 0;
        int j = a.length - 1;

        while (i <= j) {
//            int m = (i + j) / 2;
            int m = (i + j) >>> 1;
            if (target <= a[m]) {           // 目标在左边
                j = m - 1;
            } else if (a[m] < target) {     // 目标在右边
                i = m + 1;
            }
        }
        // 没有找到
        return i;
    }

    /**
     * @param a--待查找的升序数组
     * @param target--待查找的数值
     * @return 返回 <= target的最靠右索引
     */
    public static int binarySearchRightMost2(int[] a, int target) {
        // 设置指针并赋初值

        int i = 0;
        int j = a.length - 1;

        while (i <= j) {
//            int m = (i + j) / 2;
            int m = (i + j) >>> 1;
            if (target < a[m]) {        // 目标在左边
                j = m - 1;
            } else if (a[m] <= target) { // 目标在右边
                i = m + 1;
            }
        }
        // 没有找到
        return i - 1;
    }
}
