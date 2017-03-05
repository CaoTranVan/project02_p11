package com.example.Model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Tran_Cao on 3/5/2017.
 */
public class TopicEnterpriseSurragateEntityPK implements Serializable {
    private int topicId;
    private int enterpriseSurragateId;

    @Column(name = "topic_id")
    @Id
    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    @Column(name = "enterprise_surragate_id")
    @Id
    public int getEnterpriseSurragateId() {
        return enterpriseSurragateId;
    }

    public void setEnterpriseSurragateId(int enterpriseSurragateId) {
        this.enterpriseSurragateId = enterpriseSurragateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TopicEnterpriseSurragateEntityPK that = (TopicEnterpriseSurragateEntityPK) o;

        if (topicId != that.topicId) return false;
        if (enterpriseSurragateId != that.enterpriseSurragateId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = topicId;
        result = 31 * result + enterpriseSurragateId;
        return result;
    }
}
