package factory.JDfactory;

/**
 * @description:
 * @author: qian
 * @createDate: 2021/10/25
 */
public class Main {

    public static void main(String[] args) {

        Operation operation = OperationFactory.createOperation("/");
        double result = operation.getResult(10,0);
        System.out.println(result);

    }
}
