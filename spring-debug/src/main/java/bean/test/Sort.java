package bean.test;

import java.util.Arrays;

/**
 * @Author Qiang.Qi
 * @Date: 2022/4/13 17:16
 */
public class Sort {
	public static void main(String[] args) {
        Integer[] array = {1,5,8,2,99,10,55};
		System.out.println(Arrays.toString(array));
		Integer[] choiceSort = choiceSort(array);
		System.out.println(Arrays.toString(choiceSort));
	}
	public static Integer[] choiceSort(Integer[] array){
		if (array == null && array.length == 1){
			return array;
		}
		//0 - n-1
		//1 - n-1
		//2 - n-1
		int n = array.length;
		for (int i = 0; i < n ; i++) {

			int minIndex = i;
			for (int j = i; j < n; j++) {
				swap(array,j,i);
			}
		}
		return array;
	}

	private static void swap(Integer[] array, int i, int j) {
		if (array[i]<array[j]){
			int temp = array[j];
			array[j] = array[i];
			array[i] = temp;

		}
	}
}
