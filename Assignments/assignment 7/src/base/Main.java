package base;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] array = {8, 4, 6, 5, 3, 9, 11};

	    for (int i = 0,  size = array.length; i <size -1; i++){
			for (int j = 0; j < size - 1 - i; j++)
				if (array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
        }
        System.out.println(Arrays.toString(array));
    }
}
