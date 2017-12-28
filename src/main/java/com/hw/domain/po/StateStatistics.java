
package com.hw.domain.po;



import java.util.List;


public class StateStatistics implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;


	//date formats

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     *   所有
     */
	private List<ResHeadendTab> allHeadendList;
    /**
     *   采集点
     */
    private List<ResHeadendTab> cjdHeadendList;

    /**
     *   遥控站
     */
    private List<ResHeadendTab> ykzHeadendList;


	//columns END

	public StateStatistics(){
	}

    public List<ResHeadendTab> getAllHeadendList() {
        return allHeadendList;
    }

    public void setAllHeadendList(List<ResHeadendTab> allHeadendList) {
        this.allHeadendList = allHeadendList;
    }

    public List<ResHeadendTab> getCjdHeadendList() {
        return cjdHeadendList;
    }

    public void setCjdHeadendList(List<ResHeadendTab> cjdHeadendList) {
        this.cjdHeadendList = cjdHeadendList;
    }

    public List<ResHeadendTab> getYkzHeadendList() {
        return ykzHeadendList;
    }

    public void setYkzHeadendList(List<ResHeadendTab> ykzHeadendList) {
        this.ykzHeadendList = ykzHeadendList;
    }
}

