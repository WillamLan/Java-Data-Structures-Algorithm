/**  
 * 工程: DataStructures AlgorithmDemo <br>
 * 标题: SelectionSort.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午5:21:41 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.datastructuresalgorithm.sortdemo;

/**
 * 类: SelectionSort <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午5:21:41
 */
public class SelectionSort {
public static void sort(long [] arr){
	int k=0;
	long temp=0;
	for(int i=0;i<arr.length-1;i++){
		k=i;
		for(int j=i;j<arr.length;j++)
		{
			if(arr[j]<arr[k]){
				k=j;
			}
		}
		temp=arr[i];
		arr[i]=arr[k];
		arr[k]=temp;
	}
}
}
