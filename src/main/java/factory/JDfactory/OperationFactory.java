package factory.JDfactory;

/**
 * @description:
 * @author: qian
 * @createDate: 2021/10/25
 */
public class OperationFactory {

    public static Operation createOperation(String s) {
        Operation operation;
        if (s == "+")
            operation = new AddOperation();
        else if (s == "*")
            operation = new MulOperation();
        else if (s == "/")
            operation = new DivOperation();
        else
            operation = new SubOperation();
        return operation;
    }


}
