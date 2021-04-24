package com.vrian7.model.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author brian.barrera
 */

@Entity
@Table(name="trello_list")
public class TrelloList { 



    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;


    @Basic
    @Column(name="code")
    private String code;


    @Basic
    @Column(name="name")
    private String name;


    @Basic
    @Column(name="description")
    private String description;


    @Basic
    @Column(name="date")
    private Date date;


    @Basic
    @Column(name="created_at")
    private Date created_at;


    @Basic
    @Column(name="updated_at")
    private Date updated_at;


    @ManyToOne
    @JoinColumn(name="ID_TRELLO_BOARD")
    private TrelloBoard trelloBoard;


    @OneToMany(mappedBy="trelloList")
    private List<TrelloCard> trelloCards;






    public Long getId()  {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getCode()  {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }



    public String getName()  {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getDescription()  {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public Date getDate()  {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



    public Date getCreated_at()  {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }



    public Date getUpdated_at()  {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }



    public TrelloBoard getTrelloBoard()  {
        return trelloBoard;
    }

    public void setTrelloBoard(TrelloBoard trelloBoard) {
        this.trelloBoard = trelloBoard;
    }



    public List<TrelloCard> getTrelloCards()  {
        if(trelloCards == null) {
            trelloCards = new ArrayList<>();
        }
        return trelloCards;
    }

    public void setTrelloCards(List<TrelloCard> trelloCards) {
        this.trelloCards = trelloCards;
    }

    public void addTrelloCard(TrelloCard trelloCard) {
getTrelloCards().add(trelloCard);
trelloCard.setTrelloList(this);
}

public void removeTrelloCard(TrelloCard trelloCard) {
getTrelloCards().remove(trelloCard);
trelloCard.setTrelloList(null);
}








}