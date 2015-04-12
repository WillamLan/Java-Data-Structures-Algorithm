/**  
 * 工程: DataStructures AlgorithmDemo <br>
 * 标题: MyQueue.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午6:12:11 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.datastructuresalgorithm.queuedemo;

/**
 * 类: MyQueue <br>
 * 描述: 自定义循环队列：先进先出 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午6:12:11
 */
public class MyCycleQueue {
	//底层使用的数组
 private long [] arr;
    //有效数据的大小
 private int elements;
    //队头
 private int front;
    //队尾
 private int end;
 /**
  * 默认构造方法
  */
 public MyCycleQueue(){
	 arr =new long [10];
	 elements=0;
	 front=0;
	 end=-1;
 }
 /**
  * 带参数 的构造方法
  */
 public MyCycleQueue(int maxsize)
 {
	 arr =new long [maxsize];
	 elements=0;
	 front=0;
	 end=-1;
}
 /**
  * 添加数据，从队尾插入
  * 
  */
 public void insert(long value){
	 if(end==arr.length-1){
		 end =-1;//当
	 }
	 arr[++end]=value;
	 elements++;
 }
 /**
  * 删除数据，从队头删除
  */
 public long remove(){
	 long value=arr[front++];
	 if(front==arr.length){
		 front=0;
	 }
	 elements--;
	 return value;
 }
 /**
  * 查看数据，从队头查看
  */
 public long peek(){
	 return arr[front];
 }
 /**
  * 判断是否为空
  */
 public boolean isEmpty(){
	 return elements==0;
 }
 /**
  * 判断是否满了
  */
 public boolean isFull(){
	 return elements==arr.length;
 }
}