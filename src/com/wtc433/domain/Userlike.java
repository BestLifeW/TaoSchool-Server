package com.wtc433.domain;

public class Userlike {
    private Integer id;

    private String username;

    private Integer shopid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

	@Override
	public String toString() {
		return "Userlike [id=" + id + ", username=" + username + ", shopid=" + shopid + "]";
	}
    
}