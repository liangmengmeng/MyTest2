package com.bwie.test;

public class Test {

	 /** 
     * ���ֲ��� 
     * ���:  �ڶ�����Ѱ���У������е��м俪ʼ��Ѱ����������С����������Ѱ���������������������������ߵ���һ����С��Ҫ��Ѱ�Ķ��� 
     *      ���������˷�ʱ������ߵ����������Ѱ������������Ѱ�Ķ������ұߵ�����������Ѱ��ֱ����Ѱ��ߵ����� 
     * @param nums ���������� 
     * @num �������� 
     */  
	public static void main(String[] args) {
		int [] arr={1,2,3,4,5,6,7,8,9,10};
		System.out.println("���ҵ��� :"+seach(arr,8));
		
		
	}

	private static int seach(int[] arr, int i) {
		
		int start=0;
		int end=arr.length-1;
		//�ö��ַ����ҵ����ݱ������ź���� ���ֻҪ�Ƚ�һ��Ԫ�غ����һ��Ԫ�ؾͿ���ȷ�������ҵ������Ƿ���������
	if (i<arr[start]||i>arr[end]||start>end) {
		return -1;
	}
	while(start<=end){
		//����е���ֵ
		int mid=(start+end)/2;
		//������ҵ�����С���е��λ�õ�����,��Ѳ��ҵĽ���λ�ö������е�
		if (i<arr[mid]) {
			end=mid-1;
		}else if (i>arr[mid]) {//������ҵ����ݴ����е��λ�õ�����,��Ѳ��ҵ���ʼλ�ö������е�
			start=mid+1;
		}else{//���ز��ҵ�����
			return mid;
		}
	}
		return -1;
	}

}
