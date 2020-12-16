package springboot.springboot_data_mybatis.bean;

/**
 * @author lifei
 * @date 2020/11/29 8:59
 */
public class course {
    private String courseId;
    private String courseName;
    private String credit;
    private String term;
    private String teacherName;
    private String studentId;
    private Integer achievement;

    public course() {
    }

    public course(String courseId, String courseName, String credit, String term) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credit = credit;
        this.term = term;
    }

    public course(String courseId, String courseName, String credit, String term, String teacherName, String studentId, Integer achievement) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credit = credit;
        this.term = term;
        this.teacherName= teacherName;
        this.studentId = studentId;
        this.achievement = achievement;
    }
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Integer getAchievement() {
        return achievement;
    }

    public void setAchievement(Integer achievement) {
        this.achievement = achievement;
    }



    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }
}
