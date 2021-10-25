package factory.JDfactory;

/**
 * @description:
 * @author: qian
 * @createDate: 2021/10/25
 */
public class AddOperation implements Operation{

    @Override
    public double getResult(double NumberA, double NumberB) {
        return NumberA + NumberB;
    }
}
