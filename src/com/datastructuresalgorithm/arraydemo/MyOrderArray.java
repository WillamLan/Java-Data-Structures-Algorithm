/**  
 * 工程: DataStructures AlgorithmDemo <br>
 * 标题: MyOrderArray.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午2:41:56 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.datastructuresalgorithm.arraydemo;;

/**
 * 类: MyOrderArray <br>
 * 描述: 自定义数组中数据元素的长度构造函数中定义了，但是并没有添加元素的初始化操作，所以元素的添加完全
 * 由方法insert()来实现，所以要是该自定义数组为有序的话，只需要写好insert()方法就好。<br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午2:41:56
 */
public class MyOrderArray {

	private long[] arr;
	//表示有效数据的长度
	private int elements;
	
	public MyOrderArray(){
		arr=new long[50];//初始化数组的长度
	}
   /**
    * 添加数据
    */
	public void insert(long value){
		int i;
		for(i=0;i<elements;i++){
			if(arr[i]>value){
			  break;	
			}
		}
		for(int j =elements;j>i;j--){
			arr[j]=arr[j-1];
		}
		arr[i]=value;
		elements++;
	}
	/**
	 * 显示数据
	 */
	public void display(){
		System.out.print("[");
		for(int i=0;i<elements;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
	}
	/**
	 * 查找数据,根据值来查
	 */
	public int search(long value){
		int i;
		for(i=0;i<elements;i++){
			if(value==arr[i]){
				break;
			}
		}
		if(i==elements){
			return -1;
		}else{
			return i;
		}
	}
	
	/**
	 * 二分法查找数据
	 */
	public int binarySearch(long value){
		int middle=0;
		int low=0;
		int pow=elements;
		
		while (true) {
			middle=(pow+low)/2;
			if(arr[middle]==value){
				return middle;
			}else if(low>pow){//low>pow说明该数组中没有该元素（数据/值）
				return -1;
			}else if(arr[middle]>value){//这是对升序的有序数组才有的判断。
				pow=middle-1;
			}else{
				low=middle+1;
			}
		}
	}
	/**
	 * 查找数据，根据索引来查
	 */
	public long get(int index){
		if(index>=elements||index<0){
			throw new ArrayIndexOutOfBoundsException();
		}else{
			return arr[index];
		}
	}
	
	/**
	 * 删除数据
	 */
	public void delete(int index){
		if(index>=elements||index<0){
			throw new ArrayIndexOutOfBoundsException();
		}else{
			for(int i=index;i<elements;i++){
				arr[index]=arr[index+1];
			}
			elements--;
		}
	}
	
	/**
	 * 更新数据
	 */
	public void change(int index,int newValue){
		if(index>=elements||index<0){
			throw new ArrayIndexOutOfBoundsException();
		}else{
			arr[index]=newValue;
		}
	}


}
