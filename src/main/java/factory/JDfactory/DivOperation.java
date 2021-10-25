package factory.JDfactory;

/**
 * @description:
 * @author: qian
 * @createDate: 2021/10/25
 */
public class DivOperation implements Operation {

    @Override
    public double getResult(double NumberA, double NumberB) {
        if (NumberB == 0)
          throw new RuntimeException("除数不能为零");
        return NumberA / NumberB;
    }
}
