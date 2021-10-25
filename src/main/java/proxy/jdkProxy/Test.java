package proxy.jdkProxy;

import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: qian
 * @createDate: 2021/9/5
 */
public class Test {

    public static void main(String[] args) {

        Speaker speaker = new zhangsan();
        ObjProxy objProxy = new ObjProxy(speaker);
        Speaker proxyInstance =(Speaker) Proxy.newProxyInstance(speaker.getClass().getClassLoader(), speaker.getClass().getInterfaces(), objProxy);
        proxyInstance.speak();
    }
}
