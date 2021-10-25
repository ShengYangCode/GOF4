package proxy;

/**
 * @description:
 * @author: qian
 * @createDate: 2021/9/5
 */
public class TeacherDaoProxy implements ITeacherDao{

    TeacherDao teacherDao = new TeacherDao();

    @Override
    public void teach() {

        System.out.println("老师准备上课");
        teacherDao.teach();
        System.out.println("老师上课后");
    }
}
