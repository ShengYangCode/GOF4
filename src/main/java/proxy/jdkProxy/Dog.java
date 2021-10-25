package proxy.jdkProxy;

/**
 * @description:
 * @author: qian
 * @createDate: 2021/9/5
 */
public class Dog implements Speaker{

    @Override
    public void speak() {
        System.out.println("吃饭");
    }
}
