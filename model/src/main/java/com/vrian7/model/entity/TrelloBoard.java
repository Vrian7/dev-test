package com.vrian7.model.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author brian.barrera
 */

@Entity
public class TrelloBoard { 



    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;


    @Basic
    @Column(name="code")
    private Integer code;


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


    @OneToMany(mappedBy="trelloBoard")
    private List<TrelloList> trelloLists;






    public Long getId()  {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public Integer getCode()  {
        return code;
    }

    public void setCode(Integer code) {
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



    public List<TrelloList> getTrelloLists()  {
        if(trelloLists == null) {
            trelloLists = new ArrayList<>();
        }
        return trelloLists;
    }

    public void setTrelloLists(List<TrelloList> trelloLists) {
        this.trelloLists = trelloLists;
    }

    public void addTrelloList(TrelloList trelloList) {
getTrelloLists().add(trelloList);
trelloList.setTrelloBoard(this);
}

public void removeTrelloList(TrelloList trelloList) {
getTrelloLists().remove(trelloList);
trelloList.setTrelloBoard(null);
}








}