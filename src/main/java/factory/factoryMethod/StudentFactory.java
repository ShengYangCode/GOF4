package factory.factoryMethod;

/**
 * @description:
 * @author: qian
 * @createDate: 2021/10/25
 */

// 创建学生的工厂类
public class StudentFactory implements factory{

    @Override
    public LeiFeng CreateLeiFeng() {
        return new Student();
    }
}
