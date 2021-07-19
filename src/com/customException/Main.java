package com.customException;
import java.util.Arrays;
class Quicksort {
	  static int partition(int a[], int low, int high) {
	    int pivot = a[high];
	    int i = (low - 1);
	    for (int j = low; j < high; j++) {
	      if (a[j] <= pivot) {
	        i++;
	        int temp = a[i];
	        a[i] = a[j];
	        a[j] = temp;
	      }
	    }
	     int temp = a[i + 1];
	    a[i + 1] = a[high];
	    a[high] = temp;
	     return (i + 1);
	  }
	  static void quickSort(int a[], int low, int high) {
	    if (low < high) {
	      int pi = partition(a, low, high);
	      quickSort(a, low, pi - 1);
	      quickSort(a, pi + 1, high);
	    }
	  }
	}
	class Main {
	  public static void main(String args[]) {
	    int[] data = { 8, 7, 2, 1, 0, 9, 6 };
	    System.out.println("Unsorted ");
	    System.out.println(Arrays.toString(data));
	    int size = data.length;
	    Quicksort.quickSort(data, 0, size - 1);
	    System.out.println("Sorted");
	    System.out.println(Arrays.toString(data));
	  }
	}