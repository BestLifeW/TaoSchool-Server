package com.wtc433.domain;

public class Inquiry {
    private Integer id;

    private String ishopname;

    private String idescription;

    private String itime;

    private String iusername;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIshopname() {
        return ishopname;
    }

    public void setIshopname(String ishopname) {
        this.ishopname = ishopname == null ? null : ishopname.trim();
    }

    public String getIdescription() {
        return idescription;
    }

    public void setIdescription(String idescription) {
        this.idescription = idescription == null ? null : idescription.trim();
    }

    public String getItime() {
        return itime;
    }

    public void setItime(String itime) {
        this.itime = itime == null ? null : itime.trim();
    }

    public String getIusername() {
        return iusername;
    }

    public void setIusername(String iusername) {
        this.iusername = iusername == null ? null : iusername.trim();
    }
}