package com.yancorrea.dslist.dto;

import com.yancorrea.dslist.entities.Game;
import com.yancorrea.dslist.projections.GameMinProjection;

public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){
    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getTitle();
        shortDescription = entity.getShortDescription();
    }

    public GameMinDTO(GameMinProjection projetction) {
        id = projetction.getId();
        title = projetction.getTitle();
        year = projetction.getYear();
        imgUrl = projetction.getTitle();
        shortDescription = projetction.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
