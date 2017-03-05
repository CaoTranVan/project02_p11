package com.example.Model;

import javax.persistence.*;

/**
 * Created by Tran_Cao on 3/5/2017.
 */
@Entity
@Table(name = "state", schema = "project02_p11", catalog = "")
public class StateEntity {
    private int stateId;
    private String state;
    private String evaluate;
    private String report;

    @Id
    @Column(name = "state_id")
    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    @Basic
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "evaluate")
    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    @Basic
    @Column(name = "report")
    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StateEntity that = (StateEntity) o;

        if (stateId != that.stateId) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (evaluate != null ? !evaluate.equals(that.evaluate) : that.evaluate != null) return false;
        if (report != null ? !report.equals(that.report) : that.report != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stateId;
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (evaluate != null ? evaluate.hashCode() : 0);
        result = 31 * result + (report != null ? report.hashCode() : 0);
        return result;
    }
}
