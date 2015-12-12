package creeper.model;

import java.util.Date;

/**
 * @ClassName: House
 * @Description: 房屋信息
 * @date 2015年10月26日 下午10:20:14
 * @author 小银龙
 */
public class House {
	private String cid;
	private Long iPrice;//单价
	private String cHouseName;//房屋标题
	private String cHouseStyle;//户型
	private String cToward;//朝向
	private String cFloor;//楼层
	private String cAddress;//位置
	private String cPlotId;//小区ID
	private String cHouseType;//房源类型
	private Long iHouseSpace;//面积
	private String cBuildYear;//建造年份
	private String cNearSchoolId;//附近学校
	private String cNearSchoolDesc;//附近学校
	private String cNearSubwayId;//附近地铁
	private String cNearSubwayDesc;//附近地铁
	private String cTaxFree;//交税契约
	private String cIsUnique;//是否独家房源
	private Date createTime;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public Long getiPrice() {
		return iPrice;
	}

	public void setiPrice(Long iPrice) {
		this.iPrice = iPrice;
	}

	public String getcHouseStyle() {
		return cHouseStyle;
	}

	public void setcHouseStyle(String cHouseStyle) {
		this.cHouseStyle = cHouseStyle;
	}

	public String getcToward() {
		return cToward;
	}

	public void setcToward(String cToward) {
		this.cToward = cToward;
	}

	public String getcFloor() {
		return cFloor;
	}

	public void setcFloor(String cFloor) {
		this.cFloor = cFloor;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public String getcPlotId() {
		return cPlotId;
	}

	public void setcPlotId(String cPlotId) {
		this.cPlotId = cPlotId;
	}

	public String getcHouseType() {
		return cHouseType;
	}

	public void setcHouseType(String cHouseType) {
		this.cHouseType = cHouseType;
	}

	public Long getiHouseSpace() {
		return iHouseSpace;
	}

	public void setiHouseSpace(Long iHouseSpace) {
		this.iHouseSpace = iHouseSpace;
	}

	public String getcBuildYear() {
		return cBuildYear;
	}

	public void setcBuildYear(String cBuildYear) {
		this.cBuildYear = cBuildYear;
	}

	public String getcTaxFree() {
		return cTaxFree;
	}

	public void setcTaxFree(String cTaxFree) {
		this.cTaxFree = cTaxFree;
	}

	public String getcIsUnique() {
		return cIsUnique;
	}

	public void setcIsUnique(String cIsUnique) {
		this.cIsUnique = cIsUnique;
	}

	public String getcHouseName() {
		return cHouseName;
	}

	public void setcHouseName(String cHouseName) {
		this.cHouseName = cHouseName;
	}

	public String getcNearSchoolId() {
		return cNearSchoolId;
	}

	public void setcNearSchoolId(String cNearSchoolId) {
		this.cNearSchoolId = cNearSchoolId;
	}

	public String getcNearSchoolDesc() {
		return cNearSchoolDesc;
	}

	public void setcNearSchoolDesc(String cNearSchoolDesc) {
		this.cNearSchoolDesc = cNearSchoolDesc;
	}

	public String getcNearSubwayId() {
		return cNearSubwayId;
	}

	public void setcNearSubwayId(String cNearSubwayId) {
		this.cNearSubwayId = cNearSubwayId;
	}

	public String getcNearSubwayDesc() {
		return cNearSubwayDesc;
	}

	public void setcNearSubwayDesc(String cNearSubwayDesc) {
		this.cNearSubwayDesc = cNearSubwayDesc;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
