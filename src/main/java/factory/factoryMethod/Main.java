package factory.factoryMethod;

import factory.JDfactory.Operation;
import factory.JDfactory.OperationFactory;

/**
 * @description:
 * @author: qian
 * @createDate: 2021/10/25
 */
public class Main {

    public static void main(String[] args) {

        factory factory = new VolunteerFactory(); // 想改的时候只要改着就行了
        LeiFeng volunteer = factory.CreateLeiFeng();
        volunteer.Cook();
        volunteer.Sweep();
        volunteer.Wash();



    }
}
