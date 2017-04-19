package com.wtc433.domain;

public class Orders {
    private Integer id;

    private String shopid;

    private String buyerusername;

    private String sellerusername;

    private Integer count;

    private String time;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getBuyerusername() {
        return buyerusername;
    }

    public void setBuyerusername(String buyerusername) {
        this.buyerusername = buyerusername == null ? null : buyerusername.trim();
    }

    public String getSellerusername() {
        return sellerusername;
    }

    public void setSellerusername(String sellerusername) {
        this.sellerusername = sellerusername == null ? null : sellerusername.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

	@Override
	public String toString() {
		return "Orders [id=" + id + ", shopid=" + shopid + ", buyerusername=" + buyerusername + ", sellerusername="
				+ sellerusername + ", count=" + count + ", time=" + time + ", state=" + state + "]";
	}

}