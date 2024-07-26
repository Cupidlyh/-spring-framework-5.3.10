package geekBang.Spring_demo.class01.demo01;

import com.zhouyu.boot.ZhouyuSpringApplication;
import com.zhouyu.boot.ZhouyuSpringBootApplication;

@ZhouyuSpringBootApplication
class Class01Demo01Application {

    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        ZhouyuSpringApplication.run(Class01Demo01Application.class);
        System.out.println("启动耗时:" + (System.currentTimeMillis() - t1) + "ms");
    }
}