/**  
 * 工程: DataStructures AlgorithmDemo <br>
 * 标题: TestMyQueue.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午8:56:26 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.datastructuresalgorithm.queuedemo;

/**
 * 类: TestMyQueue <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午8:56:26
 */
public class TestMyQueue {

	/**
	 * 方法: main <br>
	 * 描述: TODO <br>
	 * 作者: xiaoxiaolan <br>
	 * 时间: 2015-4-11 下午8:56:26
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		MyCycleQueue mq = new MyCycleQueue(4);
		mq.insert(23);
		mq.insert(45);
		mq.insert(13);
		mq.insert(1);

		System.out.println(mq.isFull());
		System.out.println(mq.isEmpty());
		
		System.out.println(mq.peek());
		
		while(!mq.isEmpty()){
			System.out.print(mq.remove()+" ");
		}
		System.out.println();
		
		mq.insert(23);
		mq.insert(45);
		mq.insert(13);
		mq.insert(1);
		
	 while(!mq.isEmpty()){
		 System.out.print(mq.remove()+" ");
	 }
	}

}
