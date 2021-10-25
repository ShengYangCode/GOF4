package proxy;

/**
 * @description:
 * @author: qian
 * @createDate: 2021/9/5
 */
public class Client {

    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDaoProxy();

        teacherDao.teach();
    }

}
