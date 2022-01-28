package com.lokesh;

public class FindFloor {
    public static void main(String[] args) {
        int []arr = {12,23,33,44,55,};
        int target = 21;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }
    static int ceiling(int [] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean ascending = false;
        if(arr[start] < arr[end]) {
            ascending = true;
        }
        if(ascending){
            while(start <= end) {
                int mid = start + (end - start) / 2;
                if (target == arr[mid]) {
                    return arr[mid];
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            }
        }
        else
            while(start <= end) {
                int mid = start + (end - start) / 2;
                if (target == arr[mid]) {
                    return arr[mid];
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            }
        return arr[end];
    }
}
