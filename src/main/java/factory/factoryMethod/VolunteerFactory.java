package factory.factoryMethod;

/**
 * @description:
 * @author: qian
 * @createDate: 2021/10/25
 */
// 创建志愿者的工厂类
public class VolunteerFactory implements factory{

    @Override
    public LeiFeng CreateLeiFeng() {
        return new Volunteer();
    }
}
