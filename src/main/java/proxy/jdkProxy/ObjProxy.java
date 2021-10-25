package proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: qian
 * @createDate: 2021/9/5
 */
public class ObjProxy implements InvocationHandler {

    //需要代理的类
    Object o;
    public ObjProxy(Object o) {
        this.o = o;
    }

    /**
     *
     * @param proxy 动态代理实例
     * @param method 需要执行的方法
     * @param args 方法中参数
     * @return
     * @throws Throwable
     */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("引用法律");
        Object invoke = method.invoke(o, args);
        System.out.println("打人是不好的");
        return null;
    }
}
