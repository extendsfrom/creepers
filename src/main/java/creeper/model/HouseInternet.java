package creeper.model;

import java.util.Date;

public class HouseInternet {
	private String cid;
	private String cHouseId;
	private String cInternetContent;
	private Date createTime;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getcHouseId() {
		return cHouseId;
	}
	public void setcHouseId(String cHouseId) {
		this.cHouseId = cHouseId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getcInternetContent() {
		return cInternetContent;
	}
	public void setcInternetContent(String cInternetContent) {
		this.cInternetContent = cInternetContent;
	}
}
