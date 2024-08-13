package com.zhouyu;

import com.zhouyu.boot.ZhouyuSpringApplication;
import com.zhouyu.boot.ZhouyuSpringBootApplication;

@ZhouyuSpringBootApplication
public class Test {

	public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
		ZhouyuSpringApplication.run(Test.class);
        System.out.println("启动耗时:" + (System.currentTimeMillis() - t1) + "ms");
	}

}
