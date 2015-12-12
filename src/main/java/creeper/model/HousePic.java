package creeper.model;

import java.util.Date;

public class HousePic {
	private String cid;
	private String cHouseId;
	private String cHousePicPath;
	private String cEnable;
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
	public String getcHousePicPath() {
		return cHousePicPath;
	}
	public void setcHousePicPath(String cHousePicPath) {
		this.cHousePicPath = cHousePicPath;
	}
	public String getcEnable() {
		return cEnable;
	}
	public void setcEnable(String cEnable) {
		this.cEnable = cEnable;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
