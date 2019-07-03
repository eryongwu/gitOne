package com.eryong.domain;
/**@文件名: InGoodsInfo.java
 * @类功能说明: 物品管理实体类
 * @作者: CAOZHI
 * @Email: 610288154@qq.com
 * @日期: 2019年6月26日上午9:06:28
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: CAOZHI</li>
 * 	 <li>日期: 2019年6月26日上午9:06:28</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class InGoodsInfo {
	
	private Integer ingiId;//物品id
	
	private String ingiCode;//物品编码
	
	private String ingiName;//物品名
	
	private String ingiSpell;//简拼
	
	private Integer ingcid;//物品类别id
	
	private String ingcName;//物品类别名称
	
	private Integer ingtid;//物品类型id
	
	private String ingtName;//物品类型名称
	
	private Integer ingpid;//物品生产商id
	
	private String ingpName;//物品生产商名称
	
	private String ingiFormat;//物品规格
	
	private String ingiModel;//物品型号
	
	private String ingiLicensenum;//许可证号
	
	private int ingiShelflife;//保质期
	
	private int ingiExplosive;//易燃易爆标志，0为非易燃为易爆，1为易燃为易爆
	
	private int ingiToxic;//毒麻标志，0为非毒麻，1为毒麻
	
	private int ingiCorrosion;//腐蚀标志，0为非腐蚀标志，1为腐蚀标志
	
	private int ingiFragile;//易碎标志，0为非易碎标志，1为易碎标志
	
	private String ingiRemark;//备注
	
	private int ingiState;//状态
	
	private int ingiDelflag;//删除标记，0为未删除，1为已删除
	
	private int ingiStopflag;//停用标记，0为未停用，1为已停用
	
	private int optId;//操作人id
	
	private String optName;//操作人名
	
	private String currDate;//业务发生时间

	public Integer getIngiId() {
		return ingiId;
	}

	public void setIngiId(Integer ingiId) {
		this.ingiId = ingiId;
	}

	public String getIngiCode() {
		return ingiCode;
	}

	public void setIngiCode(String ingiCode) {
		this.ingiCode = ingiCode;
	}

	public String getIngiName() {
		return ingiName;
	}

	public void setIngiName(String ingiName) {
		this.ingiName = ingiName;
	}

	public String getIngiSpell() {
		return ingiSpell;
	}

	public void setIngiSpell(String ingiSpell) {
		this.ingiSpell = ingiSpell;
	}

	

	public String getIngiFormat() {
		return ingiFormat;
	}

	public void setIngiFormat(String ingiFormat) {
		this.ingiFormat = ingiFormat;
	}

	public String getIngiModel() {
		return ingiModel;
	}

	public void setIngiModel(String ingiModel) {
		this.ingiModel = ingiModel;
	}

	public String getIngiLicensenum() {
		return ingiLicensenum;
	}

	public Integer getIngcid() {
		return ingcid;
	}

	public void setIngcid(Integer ingcid) {
		this.ingcid = ingcid;
	}

	public String getIngcName() {
		return ingcName;
	}

	public void setIngcName(String ingcName) {
		this.ingcName = ingcName;
	}

	public Integer getIngtid() {
		return ingtid;
	}

	public void setIngtid(Integer ingtid) {
		this.ingtid = ingtid;
	}

	public String getIngtName() {
		return ingtName;
	}

	public void setIngtName(String ingtName) {
		this.ingtName = ingtName;
	}

	public Integer getIngpid() {
		return ingpid;
	}

	public void setIngpid(Integer ingpid) {
		this.ingpid = ingpid;
	}

	public String getIngpName() {
		return ingpName;
	}

	public void setIngpName(String ingpName) {
		this.ingpName = ingpName;
	}

	public void setIngiLicensenum(String ingiLicensenum) {
		this.ingiLicensenum = ingiLicensenum;
	}

	public int getIngiShelflife() {
		return ingiShelflife;
	}

	public void setIngiShelflife(int ingiShelflife) {
		this.ingiShelflife = ingiShelflife;
	}

	public int getIngiExplosive() {
		return ingiExplosive;
	}

	public void setIngiExplosive(int ingiExplosive) {
		this.ingiExplosive = ingiExplosive;
	}

	public int getIngiToxic() {
		return ingiToxic;
	}

	public void setIngiToxic(int ingiToxic) {
		this.ingiToxic = ingiToxic;
	}

	public int getIngiCorrosion() {
		return ingiCorrosion;
	}

	public void setIngiCorrosion(int ingiCorrosion) {
		this.ingiCorrosion = ingiCorrosion;
	}

	public int getIngiFragile() {
		return ingiFragile;
	}

	public void setIngiFragile(int ingiFragile) {
		this.ingiFragile = ingiFragile;
	}

	public String getIngiRemark() {
		return ingiRemark;
	}

	public void setIngiRemark(String ingiRemark) {
		this.ingiRemark = ingiRemark;
	}

	public int getIngiState() {
		return ingiState;
	}

	public void setIngiState(int ingiState) {
		this.ingiState = ingiState;
	}

	public int getIngiDelflag() {
		return ingiDelflag;
	}

	public void setIngiDelflag(int ingiDelflag) {
		this.ingiDelflag = ingiDelflag;
	}

	public int getIngiStopflag() {
		return ingiStopflag;
	}

	public void setIngiStopflag(int ingiStopflag) {
		this.ingiStopflag = ingiStopflag;
	}

	public int getOptId() {
		return optId;
	}

	public void setOptId(int optId) {
		this.optId = optId;
	}

	public String getOptName() {
		return optName;
	}

	public void setOptName(String optName) {
		this.optName = optName;
	}

	public String getCurrDate() {
		return currDate;
	}

	public void setCurrDate(String currDate) {
		this.currDate = currDate;
	}

	@Override
	public String toString() {
		return "InGoodsInfo [ingiId=" + ingiId + ", ingiCode=" + ingiCode
				+ ", ingiName=" + ingiName + ", ingiSpell=" + ingiSpell
				+ ", ingcid=" + ingcid + ", ingcName=" + ingcName + ", ingtid="
				+ ingtid + ", ingtName=" + ingtName + ", ingpid=" + ingpid
				+ ", ingpName=" + ingpName + ", ingiFormat=" + ingiFormat
				+ ", ingiModel=" + ingiModel + ", ingiLicensenum="
				+ ingiLicensenum + ", ingiShelflife=" + ingiShelflife
				+ ", ingiExplosive=" + ingiExplosive + ", ingiToxic="
				+ ingiToxic + ", ingiCorrosion=" + ingiCorrosion
				+ ", ingiFragile=" + ingiFragile + ", ingiRemark=" + ingiRemark
				+ ", ingiState=" + ingiState + ", ingiDelflag=" + ingiDelflag
				+ ", ingiStopflag=" + ingiStopflag + ", optId=" + optId
				+ ", optName=" + optName + ", currDate=" + currDate + "]";
	}
	
	
}
