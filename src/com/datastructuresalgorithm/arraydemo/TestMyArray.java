/**  
 * 工程: DataStructures AlgorithmDemo <br>
 * 标题: TestMyArray.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午2:26:57 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.datastructuresalgorithm.arraydemo;;

/**
 * 类: TestMyArray <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-4-11 下午2:26:57
 */
public class TestMyArray {

	/** 
	 * 方法: main <br>
	 * 描述: TODO <br>
	 * 作者: xiaoxiaolan <br>
	 * 时间: 2015-4-11 下午2:26:58
	 * @param args
	 */
	public static void main(String[] args) {
            /*MyArray arr=new MyArray();
            arr.insert(13);
            arr.insert(34);
            arr.insert(90);
            System.out.println("调用自定义数组的display()方法显示数组元素：");  
            arr.display();
            
            System.out.println("使用自定义数组的search()方法来通过值查询元素的位置：");
            int index=arr.search(90);
            System.out.println(index);
            
            System.out.println("使用自定义数组的get()方法来通过索引获取元素的值：");
            long value=arr.get(1);
            System.out.println(value);
            
            System.out.println("使用自定义数组的change()方法来更新数组元素的值：");
            arr.change(0, 12);
            System.out.println(arr.get(0));
            arr.display();*/
		MyOrderArray arr_1=new MyOrderArray();
		arr_1.insert(90);
		arr_1.insert(80);
		arr_1.insert(50);
		arr_1.insert(70);
		arr_1.insert(60);
		arr_1.display();
		long value_1=20;
		int index_1=arr_1.binarySearch(value_1);
		if(index_1!=-1){
		System.out.println(index_1);
		}else{
			System.out.println("该升序数组中没有数据元素："+value_1);
		}
		}

}
