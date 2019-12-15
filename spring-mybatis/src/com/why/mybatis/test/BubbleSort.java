package com.why.mybatis.test;

public class BubbleSort { 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer arr[] = {2,4,7,6,8,5,9};
		//System.out.println(args.toString());
	for(int i=0;i<arr.length-1;i++) {
	//	System.out.println(1);
		for(int j=0;j<arr.length-1-i;j++) {
			//System.out.println(2);
			if (arr[j]>arr[j+1]) {
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
				
			}
		}
		
	}
	for (Integer integer : arr) {
		System.out.print(integer+"\t");
	}
	
	}
	
	
}
