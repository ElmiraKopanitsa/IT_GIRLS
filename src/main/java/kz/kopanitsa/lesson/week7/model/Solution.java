package kz.kopanitsa.lesson.week7.model;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] expectedNums = {0,1,2,3,4,0,0,0,0,0};
        int[] result = removeDuplicates(nums);

        System.out.println(Arrays.equals(result, expectedNums));
    }

    public static int[] removeDuplicates(int[] nums) {
        int addIndex = 1; // локальная переменная равная 1
        for (int i = 0; i < nums.length - 1; i++) { // цикл от 0 до 9
            if (nums[i] < nums[i + 1]) { // если следующее число больше в массиве, чем текушее
                nums[addIndex] = nums[i + 1]; // число с индексом 1 заменяем на следующее
                addIndex++; // увеличиваем локальную переменную на 1
            }
        }
        for (int i = addIndex; i < nums.length; i++) { // цикл от 1 до 10
            nums[addIndex] = 0; // nums[1] равно 0
            addIndex++; // увеличиваем локальную переменную на 1
        }
        return nums;
    }
}