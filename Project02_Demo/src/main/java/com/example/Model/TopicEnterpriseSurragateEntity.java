package com.example.Model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Tran_Cao on 3/5/2017.
 */
@Entity
@Table(name = "topic_enterprise_surragate", schema = "project02_p11", catalog = "")
@IdClass(TopicEnterpriseSurragateEntityPK.class)
public class TopicEnterpriseSurragateEntity {
    private int topicId;
    private int enterpriseSurragateId;
    private Timestamp createDate;
    private Timestamp updateDate;

    @Id
    @Column(name = "topic_id")
    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    @Id
    @Column(name = "enterprise_surragate_id")
    public int getEnterpriseSurragateId() {
        return enterpriseSurragateId;
    }

    public void setEnterpriseSurragateId(int enterpriseSurragateId) {
        this.enterpriseSurragateId = enterpriseSurragateId;
    }

    @Basic
    @Column(name = "create_date")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "update_date")
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TopicEnterpriseSurragateEntity that = (TopicEnterpriseSurragateEntity) o;

        if (topicId != that.topicId) return false;
        if (enterpriseSurragateId != that.enterpriseSurragateId) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (updateDate != null ? !updateDate.equals(that.updateDate) : that.updateDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = topicId;
        result = 31 * result + enterpriseSurragateId;
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        return result;
    }
}
