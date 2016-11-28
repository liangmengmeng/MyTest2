package com.bwie.test;

public class Test {

	 /** 
     * 二分查找 
     * 简介:  在二分搜寻法中，从数列的中间开始搜寻，如果这个数小于我们所搜寻的数，由于数列已排序，则该数左边的数一定都小于要搜寻的对象， 
     *      所以无需浪费时间在左边的数；如果搜寻的数大于所搜寻的对象，则右边的数无需再搜寻，直接搜寻左边的数。 
     * @param nums 待查找数组 
     * @num 待查找数 
     */  
	public static void main(String[] args) {
		int [] arr={1,2,3,4,5,6,7,8,9,10};
		System.out.println("所找的数 :"+seach(arr,8));
		
		
	}

	private static int seach(int[] arr, int i) {
		
		int start=0;
		int end=arr.length-1;
		//用二分法查找的数据必须是排好序的 因此只要比较一个元素和最后一个元素就可以确定所查找的数据是否在数组中
	if (i<arr[start]||i>arr[end]||start>end) {
		return -1;
	}
	while(start<=end){
		//算出中点数值
		int mid=(start+end)/2;
		//如果查找的数据小于中点的位置的数据,则把查找的结束位置定义在中点
		if (i<arr[mid]) {
			end=mid-1;
		}else if (i>arr[mid]) {//如果查找的数据大于中点的位置的数据,则把查找的起始位置定义在中点
			start=mid+1;
		}else{//返回查找的数据
			return mid;
		}
	}
		return -1;
	}

}
