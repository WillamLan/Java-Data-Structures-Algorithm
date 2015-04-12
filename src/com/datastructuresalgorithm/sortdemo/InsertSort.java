/**  
 * 工程: DataStructures AlgorithmDemo <br>
 * 标题: InsertSort.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午5:33:05 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.datastructuresalgorithm.sortdemo;

/**
 * 类: InsertSort <br>
 * 描述: 插入排序 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午5:33:05
 */
public class InsertSort {
public static void sort(long [] arr){
	long temp=0;
	for(int i=1;i<arr.length;i++){
		temp=arr[i];
	    int 	j=i;
		while(j>0 && arr[j]>=temp){
			arr[j]=arr[j-1];
			j--;
		}
		arr[j]=temp;
	}
}
}
