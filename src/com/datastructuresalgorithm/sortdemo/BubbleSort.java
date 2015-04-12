/**  
 * 工程: DataStructures AlgorithmDemo <br>
 * 标题: BubbleSort.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午4:59:59 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.datastructuresalgorithm.sortdemo;

/**
 * 类: BubbleSort <br>
 * 描述: 冒泡排序:每次都是把最小的数泡上来。 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午4:59:59
 */
public class BubbleSort {
	public static void sort(long[] arr){
	long temp=0;
	
		for(int i=0;i<arr.length-1;i++)	
	{
		for(int j=arr.length-1;j>i;j--)
		{
			if(arr[j]<arr[j-1]){
				//进行交换
				temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
		}
	}
	}

}
