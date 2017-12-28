
package com.hw.domain.po;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class Ypwjdfb   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Ypwjdfb";
	public static final String ALIAS_WENJM = "wenjm";
	public static final String ALIAS_MUD = "mud";
	public static final String ALIAS_YUAN = "yuan";
	public static final String ALIAS_BANBH = "banbh";
	public static final String ALIAS_JIESJH = "jiesjh";
	public static final String ALIAS_RENWID = "renwid";
	public static final String ALIAS_SHUAIJZT = "shuaijzt";
	public static final String ALIAS_PINL = "pinl";
	public static final String ALIAS_DIANP = "dianp";
	public static final String ALIAS_YASCS = "yascs";
	public static final String ALIAS_LUYSJ = "luysj";
	public static final String ALIAS_FANHSJ = "fanhsj";
	public static final String ALIAS_KETD = "ketd";
	public static final String ALIAS_PINDCD = "pindcd";
	public static final String ALIAS_PINDQK = "pindqk";
	public static final String ALIAS_SHOUTR = "shoutr";
	public static final String ALIAS_SHOUTSJ = "shoutsj";
	public static final String ALIAS_SHOUCSJID = "shoucsjid";
	public static final String ALIAS_JIEM = "jiem";
	public static final String ALIAS_TAIM = "taim";
	public static final String ALIAS_RENWMC = "renwmc";
	public static final String ALIAS_COUNTS = "counts";
	public static final String ALIAS_COUNTI = "counti";
	public static final String ALIAS_COUNTO = "counto";
	public static final String ALIAS_BEIZ = "beiz";
	public static final String ALIAS_GUOJ = "guoj";
	public static final String ALIAS_DIANT = "diant";
	public static final String ALIAS_YUY = "yuy";
	public static final String ALIAS_XIAOG = "xiaog";
	public static final String ALIAS_YUANWJM = "yuanwjm";
	public static final String ALIAS_KAIBSJ = "kaibsj";
	public static final String ALIAS_TINGBSJ = "tingbsj";
	public static final String ALIAS_FAST = "fast";
	public static final String ALIAS_FASFX = "fasfx";
	public static final String ALIAS_FASGL = "fasgl";
	public static final String ALIAS_JIEMLB = "jiemlb";
	public static final String ALIAS_ZILLY = "zilly";
	public static final String ALIAS_ZILLB = "zillb";
	public static final String ALIAS_FUWQ = "fuwq";
	public static final String ALIAS_CIRAF = "ciraf";
	public static final String ALIAS_DAOCSJ = "daocsj";
	public static final String ALIAS_SHOUCDD = "shoucdd";
	public static final String ALIAS_FASJH = "fasjh";
	public static final String ALIAS_YUNXTLX = "yunxtlx";
	public static final String ALIAS_ZIDPF = "zidpf";
	public static final String ALIAS_CHULZT = "chulzt";
	public static final String ALIAS_YITQR = "yitqr";
	public static final String ALIAS_QUERZXD = "querzxd";
	public static final String ALIAS_YUZ1 = "yuz1";
	public static final String ALIAS_ZHIXD1 = "zhixd1";
	public static final String ALIAS_YUZ2 = "yuz2";
	public static final String ALIAS_ZHIXD2 = "zhixd2";
	public static final String ALIAS_YUZ3 = "yuz3";
	public static final String ALIAS_ZHIXD3 = "zhixd3";
	public static final String ALIAS_YONGHQR = "yonghqr";
	public static final String ALIAS_WAVLENGTH = "wavlength";
	public static final String ALIAS_MUSICRATIO = "musicratio";
	public static final String ALIAS_NOISERATIO = "noiseratio";
	public static final String ALIAS_SPEECHLENGTH = "speechlength";
	public static final String ALIAS_CHULJG = "chuljg";
	public static final String ALIAS_GENGX = "gengx";
	
	//date formats

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * wenjm       db_column: WENJM 
     */	
	private String wenjm;
    /**
     * mud       db_column: MUD 
     */	
	
	private Long mud;
    /**
     * yuan       db_column: YUAN 
     */	
	
	private Long yuan;
    /**
     * banbh       db_column: BANBH 
     */	
	private String banbh;
    /**
     * jiesjh       db_column: JIESJH 
     */	
	
	private Boolean jiesjh;
    /**
     * renwid       db_column: RENWID 
     */	
	private String renwid;

	private String yuy;
    /**
     * shuaijzt       db_column: SHUAIJZT 
     */	
	
	private Boolean shuaijzt;
    /**
     * pinl       db_column: PINL 
     */	
	private String pinl;
    /**
     * dianp       db_column: DIANP 
     */	
	
	private Long dianp;
    /**
     * yascs       db_column: YASCS 
     */	
	
	private Boolean yascs;
    /**
     * luysj       db_column: LUYSJ 
     */	
	
	private Long luysj;
    /**
     * fanhsj       db_column: FANHSJ 
     */	
	
	private Date fanhsj;
    /**
     * ketd       db_column: KETD 
     */	
	
	private Long ketd;
    /**
     * pindcd       db_column: PINDCD 
     */	
	private String pindcd;
    /**
     * pindqk       db_column: PINDQK 
     */	
	private String pindqk;
    /**
     * shoutr       db_column: SHOUTR 
     */	
	private String shoutr;
    /**
     * shoutsj       db_column: SHOUTSJ 
     */	
	
	private Date shoutsj;
    /**
     * shoucsjid       db_column: SHOUCSJID 
     */	
	private String shoucsjid;
    /**
     * jiem       db_column: JIEM 
     */	
	private String jiem;
    /**
     * taim       db_column: TAIM 
     */	
	private String taim;
    /**
     * renwmc       db_column: RENWMC 
     */	
	private String renwmc;
    /**
     * counts       db_column: COUNTS 
     */	
	
	private Long counts;
    /**
     * counti       db_column: COUNTI 
     */	
	
	private Long counti;
    /**
     * counto       db_column: COUNTO 
     */	
	
	private Long counto;
    /**
     * beiz       db_column: BEIZ 
     */	
	private String beiz;
    /**
     * guoj       db_column: GUOJ 
     */	
	private String guoj;
    /**
     * diant       db_column: DIANT 
     */	
	private String diant;
    /**
     * yuy       db_column: YUY 
     */	
    /**
     * xiaog       db_column: XIAOG 
     */	
	private String xiaog;
    /**
     * yuanwjm       db_column: YUANWJM 
     */	
	private String yuanwjm;
    /**
     * kaibsj       db_column: KAIBSJ 
     */	
	private String kaibsj;
    /**
     * tingbsj       db_column: TINGBSJ 
     */	
	private String tingbsj;
    /**
     * fast       db_column: FAST 
     */	
	private String fast;
    /**
     * fasfx       db_column: FASFX 
     */	
	private String fasfx;
    /**
     * fasgl       db_column: FASGL 
     */	
	private String fasgl;
    /**
     * jiemlb       db_column: JIEMLB 
     */	
	
	private Long jiemlb;
    /**
     * zilly       db_column: ZILLY 
     */	
	
	private Long zilly;
    /**
     * zillb       db_column: ZILLB 
     */	
	
	private Long zillb;
    /**
     * fuwq       db_column: FUWQ 
     */	
	private String fuwq;
    /**
     * ciraf       db_column: CIRAF 
     */	
	private String ciraf;
    /**
     * daocsj       db_column: DAOCSJ 
     */	
	
	private Date daocsj;
    /**
     * shoucdd       db_column: SHOUCDD 
     */	
	private String shoucdd;
    /**
     * fasjh       db_column: FASJH 
     */	
	private String fasjh;
    /**
     * yunxtlx       db_column: YUNXTLX 
     */	
	
	private Long yunxtlx;
    /**
     * zidpf       db_column: ZIDPF 
     */	
	private String zidpf;
    /**
     * chulzt       db_column: CHULZT 
     */	
	
	private Boolean chulzt;
    /**
     * yitqr       db_column: YITQR 
     */	
	
	private Boolean yitqr;
    /**
     * querzxd       db_column: QUERZXD 
     */	
	
	private Integer querzxd;
    /**
     * yuz1       db_column: YUZ1 
     */	
	private String yuz1;
    /**
     * zhixd1       db_column: ZHIXD1 
     */	
	
	private Integer zhixd1;
    /**
     * yuz2       db_column: YUZ2 
     */	
	private String yuz2;
    /**
     * zhixd2       db_column: ZHIXD2 
     */	
	
	private Integer zhixd2;
    /**
     * yuz3       db_column: YUZ3 
     */	
	private String yuz3;
    /**
     * zhixd3       db_column: ZHIXD3 
     */	
	
	private Integer zhixd3;
    /**
     * yonghqr       db_column: YONGHQR 
     */	
	
	private Boolean yonghqr;
    /**
     * wavlength       db_column: WAVLENGTH 
     */	
	
	private Long wavlength;
    /**
     * musicratio       db_column: MUSICRATIO 
     */	
	
	private Integer musicratio;
    /**
     * noiseratio       db_column: NOISERATIO 
     */	
	
	private Integer noiseratio;
    /**
     * speechlength       db_column: SPEECHLENGTH 
     */	
	
	private Long speechlength;
    /**
     * chuljg       db_column: CHULJG 
     */	
	private String chuljg;
    /**
     * gengx       db_column: GENGX 
     */	
	private Integer gengx;
	//columns END

	public Ypwjdfb(){
	}


	public void setWenjm(String value) {
		this.wenjm = value;
	}
	
	public String getWenjm() {
		return this.wenjm;
	}
	public void setMud(Long value) {
		this.mud = value;
	}
	
	public Long getMud() {
		return this.mud;
	}
	public void setYuan(Long value) {
		this.yuan = value;
	}
	
	public Long getYuan() {
		return this.yuan;
	}
	public void setBanbh(String value) {
		this.banbh = value;
	}
	
	public String getBanbh() {
		return this.banbh;
	}
	public void setJiesjh(Boolean value) {
		this.jiesjh = value;
	}
	
	public Boolean getJiesjh() {
		return this.jiesjh;
	}
	public void setRenwid(String value) {
		this.renwid = value;
	}
	
	public String getRenwid() {
		return this.renwid;
	}
	public void setShuaijzt(Boolean value) {
		this.shuaijzt = value;
	}
	
	public Boolean getShuaijzt() {
		return this.shuaijzt;
	}
	public void setPinl(String value) {
		this.pinl = value;
	}
	
	public String getPinl() {
		return this.pinl;
	}
	public void setDianp(Long value) {
		this.dianp = value;
	}
	
	public Long getDianp() {
		return this.dianp;
	}
	public void setYascs(Boolean value) {
		this.yascs = value;
	}
	
	public Boolean getYascs() {
		return this.yascs;
	}
	public void setLuysj(Long value) {
		this.luysj = value;
	}
	
	public Long getLuysj() {
		return this.luysj;
	}

	public void setFanhsj(Date value) {
		this.fanhsj = value;
	}
	
	public Date getFanhsj() {
		return this.fanhsj;
	}
	public void setKetd(Long value) {
		this.ketd = value;
	}
	
	public Long getKetd() {
		return this.ketd;
	}
	public void setPindcd(String value) {
		this.pindcd = value;
	}
	
	public String getPindcd() {
		return this.pindcd;
	}
	public void setPindqk(String value) {
		this.pindqk = value;
	}
	
	public String getPindqk() {
		return this.pindqk;
	}
	public void setShoutr(String value) {
		this.shoutr = value;
	}
	
	public String getShoutr() {
		return this.shoutr;
	}

	public void setShoutsj(Date value) {
		this.shoutsj = value;
	}
	
	public Date getShoutsj() {
		return this.shoutsj;
	}
	public void setShoucsjid(String value) {
		this.shoucsjid = value;
	}
	
	public String getShoucsjid() {
		return this.shoucsjid;
	}
	public void setJiem(String value) {
		this.jiem = value;
	}
	
	public String getJiem() {
		return this.jiem;
	}
	public void setTaim(String value) {
		this.taim = value;
	}
	
	public String getTaim() {
		return this.taim;
	}
	public void setRenwmc(String value) {
		this.renwmc = value;
	}
	
	public String getRenwmc() {
		return this.renwmc;
	}
	public void setCounts(Long value) {
		this.counts = value;
	}
	
	public Long getCounts() {
		return this.counts;
	}
	public void setCounti(Long value) {
		this.counti = value;
	}
	
	public Long getCounti() {
		return this.counti;
	}
	public void setCounto(Long value) {
		this.counto = value;
	}
	
	public Long getCounto() {
		return this.counto;
	}
	public void setBeiz(String value) {
		this.beiz = value;
	}
	
	public String getBeiz() {
		return this.beiz;
	}
	public void setGuoj(String value) {
		this.guoj = value;
	}
	
	public String getGuoj() {
		return this.guoj;
	}
	public void setDiant(String value) {
		this.diant = value;
	}
	
	public String getDiant() {
		return this.diant;
	}
	public void setYuy(String value) {
		this.yuy = value;
	}
	
	public String getYuy() {
		return this.yuy;
	}
	public void setXiaog(String value) {
		this.xiaog = value;
	}
	
	public String getXiaog() {
		return this.xiaog;
	}
	public void setYuanwjm(String value) {
		this.yuanwjm = value;
	}
	
	public String getYuanwjm() {
		return this.yuanwjm;
	}
	public void setKaibsj(String value) {
		this.kaibsj = value;
	}
	
	public String getKaibsj() {
		return this.kaibsj;
	}
	public void setTingbsj(String value) {
		this.tingbsj = value;
	}
	
	public String getTingbsj() {
		return this.tingbsj;
	}
	public void setFast(String value) {
		this.fast = value;
	}
	
	public String getFast() {
		return this.fast;
	}
	public void setFasfx(String value) {
		this.fasfx = value;
	}
	
	public String getFasfx() {
		return this.fasfx;
	}
	public void setFasgl(String value) {
		this.fasgl = value;
	}
	
	public String getFasgl() {
		return this.fasgl;
	}
	public void setJiemlb(Long value) {
		this.jiemlb = value;
	}
	
	public Long getJiemlb() {
		return this.jiemlb;
	}
	public void setZilly(Long value) {
		this.zilly = value;
	}
	
	public Long getZilly() {
		return this.zilly;
	}
	public void setZillb(Long value) {
		this.zillb = value;
	}
	
	public Long getZillb() {
		return this.zillb;
	}
	public void setFuwq(String value) {
		this.fuwq = value;
	}
	
	public String getFuwq() {
		return this.fuwq;
	}
	public void setCiraf(String value) {
		this.ciraf = value;
	}
	
	public String getCiraf() {
		return this.ciraf;
	}

	public void setDaocsj(Date value) {
		this.daocsj = value;
	}
	
	public Date getDaocsj() {
		return this.daocsj;
	}
	public void setShoucdd(String value) {
		this.shoucdd = value;
	}
	
	public String getShoucdd() {
		return this.shoucdd;
	}
	public void setFasjh(String value) {
		this.fasjh = value;
	}
	
	public String getFasjh() {
		return this.fasjh;
	}
	public void setYunxtlx(Long value) {
		this.yunxtlx = value;
	}
	
	public Long getYunxtlx() {
		return this.yunxtlx;
	}
	public void setZidpf(String value) {
		this.zidpf = value;
	}
	
	public String getZidpf() {
		return this.zidpf;
	}
	public void setChulzt(Boolean value) {
		this.chulzt = value;
	}
	
	public Boolean getChulzt() {
		return this.chulzt;
	}
	public void setYitqr(Boolean value) {
		this.yitqr = value;
	}
	
	public Boolean getYitqr() {
		return this.yitqr;
	}
	public void setQuerzxd(Integer value) {
		this.querzxd = value;
	}
	
	public Integer getQuerzxd() {
		return this.querzxd;
	}
	public void setYuz1(String value) {
		this.yuz1 = value;
	}
	
	public String getYuz1() {
		return this.yuz1;
	}
	public void setZhixd1(Integer value) {
		this.zhixd1 = value;
	}
	
	public Integer getZhixd1() {
		return this.zhixd1;
	}
	public void setYuz2(String value) {
		this.yuz2 = value;
	}
	
	public String getYuz2() {
		return this.yuz2;
	}
	public void setZhixd2(Integer value) {
		this.zhixd2 = value;
	}
	
	public Integer getZhixd2() {
		return this.zhixd2;
	}
	public void setYuz3(String value) {
		this.yuz3 = value;
	}
	
	public String getYuz3() {
		return this.yuz3;
	}
	public void setZhixd3(Integer value) {
		this.zhixd3 = value;
	}
	
	public Integer getZhixd3() {
		return this.zhixd3;
	}
	public void setYonghqr(Boolean value) {
		this.yonghqr = value;
	}
	
	public Boolean getYonghqr() {
		return this.yonghqr;
	}
	public void setWavlength(Long value) {
		this.wavlength = value;
	}
	
	public Long getWavlength() {
		return this.wavlength;
	}
	public void setMusicratio(Integer value) {
		this.musicratio = value;
	}
	
	public Integer getMusicratio() {
		return this.musicratio;
	}
	public void setNoiseratio(Integer value) {
		this.noiseratio = value;
	}
	
	public Integer getNoiseratio() {
		return this.noiseratio;
	}
	public void setSpeechlength(Long value) {
		this.speechlength = value;
	}
	
	public Long getSpeechlength() {
		return this.speechlength;
	}
	public void setChuljg(String value) {
		this.chuljg = value;
	}
	
	public String getChuljg() {
		return this.chuljg;
	}
	public void setGengx(Integer value) {
		this.gengx = value;
	}
	
	public Integer getGengx() {
		return this.gengx;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Wenjm",getWenjm())
			.append("Mud",getMud())
			.append("Yuan",getYuan())
			.append("Banbh",getBanbh())
			.append("Jiesjh",getJiesjh())
			.append("Renwid",getRenwid())
			.append("Shuaijzt",getShuaijzt())
			.append("Pinl",getPinl())
			.append("Dianp",getDianp())
			.append("Yascs",getYascs())
			.append("Luysj",getLuysj())
			.append("Fanhsj",getFanhsj())
			.append("Ketd",getKetd())
			.append("Pindcd",getPindcd())
			.append("Pindqk",getPindqk())
			.append("Shoutr",getShoutr())
			.append("Shoutsj",getShoutsj())
			.append("Shoucsjid",getShoucsjid())
			.append("Jiem",getJiem())
			.append("Taim",getTaim())
			.append("Renwmc",getRenwmc())
			.append("Counts",getCounts())
			.append("Counti",getCounti())
			.append("Counto",getCounto())
			.append("Beiz",getBeiz())
			.append("Guoj",getGuoj())
			.append("Diant",getDiant())
			.append("Yuy",getYuy())
			.append("Xiaog",getXiaog())
			.append("Yuanwjm",getYuanwjm())
			.append("Kaibsj",getKaibsj())
			.append("Tingbsj",getTingbsj())
			.append("Fast",getFast())
			.append("Fasfx",getFasfx())
			.append("Fasgl",getFasgl())
			.append("Jiemlb",getJiemlb())
			.append("Zilly",getZilly())
			.append("Zillb",getZillb())
			.append("Fuwq",getFuwq())
			.append("Ciraf",getCiraf())
			.append("Daocsj",getDaocsj())
			.append("Shoucdd",getShoucdd())
			.append("Fasjh",getFasjh())
			.append("Yunxtlx",getYunxtlx())
			.append("Zidpf",getZidpf())
			.append("Chulzt",getChulzt())
			.append("Yitqr",getYitqr())
			.append("Querzxd",getQuerzxd())
			.append("Yuz1",getYuz1())
			.append("Zhixd1",getZhixd1())
			.append("Yuz2",getYuz2())
			.append("Zhixd2",getZhixd2())
			.append("Yuz3",getYuz3())
			.append("Zhixd3",getZhixd3())
			.append("Yonghqr",getYonghqr())
			.append("Wavlength",getWavlength())
			.append("Musicratio",getMusicratio())
			.append("Noiseratio",getNoiseratio())
			.append("Speechlength",getSpeechlength())
			.append("Chuljg",getChuljg())
			.append("Gengx",getGengx())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Ypwjdfb == false) return false;
		if(this == obj) return true;
		Ypwjdfb other = (Ypwjdfb)obj;
		return new EqualsBuilder()
			.isEquals();
	}
}

