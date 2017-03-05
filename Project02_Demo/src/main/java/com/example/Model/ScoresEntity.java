package com.example.Model;

import javax.persistence.*;

/**
 * Created by Tran_Cao on 3/5/2017.
 */
@Entity
@Table(name = "scores", schema = "project02_p11", catalog = "")
public class ScoresEntity {
    private int scoreId;
    private String urlScore;

    @Id
    @Column(name = "score_id")
    public int getScoreId() {
        return scoreId;
    }

    public void setScoreId(int scoreId) {
        this.scoreId = scoreId;
    }

    @Basic
    @Column(name = "url_score")
    public String getUrlScore() {
        return urlScore;
    }

    public void setUrlScore(String urlScore) {
        this.urlScore = urlScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScoresEntity that = (ScoresEntity) o;

        if (scoreId != that.scoreId) return false;
        if (urlScore != null ? !urlScore.equals(that.urlScore) : that.urlScore != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = scoreId;
        result = 31 * result + (urlScore != null ? urlScore.hashCode() : 0);
        return result;
    }
}
