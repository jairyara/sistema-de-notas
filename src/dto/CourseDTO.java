package dto;

public class CourseDTO {
    private String codeCourse;
    private String nameCourse;
    private String courseLevel;

    public CourseDTO(String codeCourse, String nameCourse, String courseLevel) {
        this.codeCourse = codeCourse;
        this.nameCourse = nameCourse;
        this.courseLevel = courseLevel;
    }

    public String getCodeCourse() {
        return codeCourse;
    }

    public void setCodeCourse(String codeCourse) {
        this.codeCourse = codeCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public String getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(String courseLevel) {
        this.courseLevel = courseLevel;
    }
}
