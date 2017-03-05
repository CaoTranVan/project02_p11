package com.example.Model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Tran_Cao on 3/5/2017.
 */
public class StudentEnterpriseInstructorEntityPK implements Serializable {
    private int studentId;
    private int enterpriseInstructorId;

    @Column(name = "student_id")
    @Id
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Column(name = "enterprise_instructor_id")
    @Id
    public int getEnterpriseInstructorId() {
        return enterpriseInstructorId;
    }

    public void setEnterpriseInstructorId(int enterpriseInstructorId) {
        this.enterpriseInstructorId = enterpriseInstructorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEnterpriseInstructorEntityPK that = (StudentEnterpriseInstructorEntityPK) o;

        if (studentId != that.studentId) return false;
        if (enterpriseInstructorId != that.enterpriseInstructorId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentId;
        result = 31 * result + enterpriseInstructorId;
        return result;
    }
}
