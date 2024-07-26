package geekBang.Spring_demo.class01.demo02;

import com.zhouyu.boot.ZhouyuSpringApplication;
import com.zhouyu.boot.ZhouyuSpringBootApplication;

@ZhouyuSpringBootApplication
class Class01Demo02Application {

    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        ZhouyuSpringApplication.run(Class01Demo02Application.class);
        System.out.println("启动耗时:" + (System.currentTimeMillis() - t1) + "ms");
    }
}