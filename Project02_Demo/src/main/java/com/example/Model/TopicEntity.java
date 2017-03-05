package com.example.Model;

import javax.persistence.*;

/**
 * Created by Tran_Cao on 3/5/2017.
 */
@Entity
@Table(name = "topic", schema = "project02_p11", catalog = "")
public class TopicEntity {
    private int topicId;
    private String name;

    @Id
    @Column(name = "topic_id")
    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TopicEntity that = (TopicEntity) o;

        if (topicId != that.topicId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = topicId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
