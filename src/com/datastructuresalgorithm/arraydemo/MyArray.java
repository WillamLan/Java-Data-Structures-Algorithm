/**  
 * 工程: DataStructures AlgorithmDemo <br>
 * 标题: MyArray.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午2:04:31 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.datastructuresalgorithm.arraydemo;

/**
 * 类: MyArray <br>
 * 描述: 自定义类封装数组<br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午2:04:31
 */
public class MyArray {
	private long[] arr;
	//表示有效数据的长度
	private int elements;
	
	public MyArray(){
		arr=new long[50];//初始化数组的长度
	}
   /**
    * 添加数据
    */
	public void insert(long value){
		arr[elements]=value;
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
