package org.example.ccypsbackend.post.dao.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Setter
@Getter
@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String posterName; // posterName

    private String postContent; // postContent

    private String createTime; // createTime

    private String updateTime; // updateTime

    private Integer status; //valid or invalid

    private Long categoryId;// categoryId

    private String imgs; // imgs

    private Integer likes; // number of likes

    private Integer comments;// number of comments

    private Integer views; // number of views

    private Integer shares; // number of shares

    private Integer favorites; // number of favorites

    private Integer reports; // number of reports

    private Integer isDeleted; // isDeleted

    private String deleteTime; // deleteTime

    private String deleteReason;// deleteReason

    private Boolean recommend; // recommend
}
