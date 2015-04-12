/**  
 * 工程: DataStructures AlgorithmDemo <br>
 * 标题: MyStack.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午5:42:16 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.datastructuresalgorithm.stackdemo;

import com.sun.swing.internal.plaf.basic.resources.basic;

/**
 * 类: MyStack <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午5:42:16
 */
public class MyStack {
//底层实现是一个数组
	private long [] arr;
	private int top;
	/**
	 * 默认的构造方法
	 */
	public MyStack(){
		arr =new long [10];
		top=-1;
	}
	/**
	 * 带参数构造方法，参数为数组初始化大小
	 */
	public MyStack(int maxsize){
		arr =new long [maxsize];
		top=-1;
	}
	/**
	 * 添加数据
	 */
	public void push(int value)
	{
		arr[++top]=value;
	}
	/**
	 * 移除数据
	 */
	public long pop(){
		return arr[top--];
	}
	/**
	 * 查看数据
	 */
	public long peek(){
		return arr[top];
	}
	/**
	 * 判断是否为空
	 */
	public boolean isEmpty(){
		return top==-1;
	}
	/**
	 * 判断是否满了
	 */
	public boolean isFull(){
		return top==arr.length-1;
	}
}
