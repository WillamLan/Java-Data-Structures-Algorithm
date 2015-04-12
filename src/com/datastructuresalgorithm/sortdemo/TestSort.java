/**  
 * 工程: DataStructures AlgorithmDemo <br>
 * 标题: TestSort.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午5:08:21 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.datastructuresalgorithm.sortdemo;

/**
 * 类: TestSort <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午5:08:21
 */
public class TestSort {

	/**
	 * 方法: main <br>
	 * 描述: TODO <br>
	 * 作者: xiaoxiaolan <br>
	 * 时间: 2015-4-11 下午5:08:21
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		long[] arr = new long[5];
		arr[0] = 34;
		arr[1] = 23;
		arr[2] = 2;
		arr[3] = 1;
		System.out.print("[");
		for(long num:arr){
			System.out.print(num+" ");
		}
         System.out.println("]");
         
//        BubbleSort.sort(arr);
//        SelectionSort.sort(arr);
          InsertSort.sort(arr); 
        System.out.print("[");
		for(long num:arr){
			System.out.print(num+" ");
		}
         System.out.println("]");
	}

}
