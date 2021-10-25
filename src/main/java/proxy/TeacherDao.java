package proxy;

/**
 * @description:
 * @author: qian
 * @createDate: 2021/9/5
 */
public class TeacherDao implements ITeacherDao{

    @Override
    public void teach() {
        System.out.println(" 老师授课中  。。。。。");
    }
}
