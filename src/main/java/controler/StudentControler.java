package controler;

import data.model.*;
import javax.faces.bean.ManagedBean;

@ManagedBean (name = "StudentController")
public class StudentControler {

    private Student student = new Student();

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String isNextPage(){

        return "success";
    }
}
