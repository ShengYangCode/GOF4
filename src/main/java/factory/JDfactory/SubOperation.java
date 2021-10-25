package factory.JDfactory;

import factory.JDfactory.Operation;

/**
 * @description:
 * @author: qian
 * @createDate: 2021/10/25
 */
public class SubOperation implements Operation {

    @Override
    public double getResult(double NumberA, double NumberB) {
        return NumberA - NumberB;
    }
}
