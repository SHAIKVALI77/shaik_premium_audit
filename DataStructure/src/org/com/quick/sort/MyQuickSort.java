package org.com.quick.sort;

public class MyQuickSort {

	private int[] array;
	private int length;
	
	public void sort(int[] inputArr) {
		if(inputArr == null || inputArr.length == 0) {
			return;
		}
		this.array = inputArr;
		length = inputArr.length;
		//System.out.println(length);
		quickSort(0,length-1);
	}
	private void quickSort(int lowIndex, int highIndex) {
		
		int i = lowIndex;
		int j = highIndex;
		
		int pivot = array[lowIndex+(highIndex-lowIndex)/2];
		
		while(i<=j) {
			while(array[i] < pivot) {
				i++;
			}
			while(array[j] > pivot) {
				j--;
			}
			if(i <= j) {
				exchangeNumbers(i,j);
				i++;
				j--;
			}
		}
		if(lowIndex < j) {
			quickSort(lowIndex, j);
		}if(i < highIndex) {
			quickSort(i, highIndex);
		}
	}
	private void exchangeNumbers(int i, int j) {

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
	public static void main(String[] args) {

		MyQuickSort sort = new MyQuickSort();
		int[] ar = {24,2,45,20,56,12};
		sort.sort(ar);
		for(int arr : ar) {
			System.out.println(arr);
		}
	}
}
