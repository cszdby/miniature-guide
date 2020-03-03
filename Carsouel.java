package com.csrtuv.po;

public class Carsouel {
    private Integer id;

    private String picpath;

    private String name;

    private Integer type;

    private Integer pagetype;

    private Integer pageid;

    private Integer sortorder;

    private Integer active;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPagetype() {
        return pagetype;
    }

    public void setPagetype(Integer pagetype) {
        this.pagetype = pagetype;
    }

    public Integer getPageid() {
        return pageid;
    }

    public void setPageid(Integer pageid) {
        this.pageid = pageid;
    }

    public Integer getSortorder() {
        return sortorder;
    }

    public void setSortorder(Integer sortorder) {
        this.sortorder = sortorder;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Carsouel{" +
                "id=" + id +
                ", picpath='" + picpath + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", pagetype=" + pagetype +
                ", pageid=" + pageid +
                ", sortorder=" + sortorder +
                ", active=" + active +
                '}';
    }


}