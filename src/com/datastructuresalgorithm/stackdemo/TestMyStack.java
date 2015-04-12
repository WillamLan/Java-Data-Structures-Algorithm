/**  
 * 工程: DataStructures AlgorithmDemo <br>
 * 标题: TestMyStack.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午5:47:36 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.datastructuresalgorithm.stackdemo;

/**
 * 类: TestMyStack <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午5:47:36
 */
public class TestMyStack {

	/**
	 * 方法: main <br>
	 * 描述: TODO <br>
	 * 作者: xiaoxiaolan <br>
	 * 时间: 2015-4-11 下午5:47:36
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		MyStack ms = new MyStack(4);
		ms.push(23);
		ms.push(12);
		ms.push(1);
		ms.push(90);
	  System.out.println(ms.isEmpty());
	  System.out.println(ms.isFull());
	  
	  System.out.println(ms.peek());
	  
	  while(!ms.isEmpty()){
		  System.out.println(ms.pop());
	  }
	  
	  System.out.println(ms.isEmpty());
	  System.out.println(ms.isFull());
	}

}
