package com.example.Model;

import javax.persistence.*;

/**
 * Created by Tran_Cao on 3/5/2017.
 */
@Entity
@Table(name = "student_enterprise_instructor", schema = "project02_p11", catalog = "")
@IdClass(StudentEnterpriseInstructorEntityPK.class)
public class StudentEnterpriseInstructorEntity {
    private int studentId;
    private int enterpriseInstructorId;
    private String urlOutline;
    private String comment;

    @Id
    @Column(name = "student_id")
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Id
    @Column(name = "enterprise_instructor_id")
    public int getEnterpriseInstructorId() {
        return enterpriseInstructorId;
    }

    public void setEnterpriseInstructorId(int enterpriseInstructorId) {
        this.enterpriseInstructorId = enterpriseInstructorId;
    }

    @Basic
    @Column(name = "url_outline")
    public String getUrlOutline() {
        return urlOutline;
    }

    public void setUrlOutline(String urlOutline) {
        this.urlOutline = urlOutline;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEnterpriseInstructorEntity that = (StudentEnterpriseInstructorEntity) o;

        if (studentId != that.studentId) return false;
        if (enterpriseInstructorId != that.enterpriseInstructorId) return false;
        if (urlOutline != null ? !urlOutline.equals(that.urlOutline) : that.urlOutline != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentId;
        result = 31 * result + enterpriseInstructorId;
        result = 31 * result + (urlOutline != null ? urlOutline.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }
}
