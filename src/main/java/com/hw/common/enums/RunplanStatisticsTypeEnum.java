package com.hw.common.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @Description:
 * @date 14-9-18上午11:22
 */
public enum RunplanStatisticsTypeEnum {
    STATION_STATISTICS(1, "按台名统计"),
    LANGAGE_STATISTICS(2, "按语言统计"),
    AREA_STATISTICS(3, "按地区统计"),
    PLAY_TIME_STATISTICS(4, "按播音时间统计"),
    HEADEND_STATISTICS(5, "按站点统计");

    private Integer value;
    private String name;
    public Integer getValue() {
        return value;
    }
    public String getName() {
        return name;
    }


    private RunplanStatisticsTypeEnum(Integer value, String name){
        this.value = value;
        this.name = name;
    }

    public static Map<Integer,String> transferToMap(){
        Map<Integer,String> map = new HashMap<Integer,String>();
        for(RunplanStatisticsTypeEnum sendType : EnumSet.allOf(RunplanStatisticsTypeEnum.class)){
            map.put(sendType.getValue(),sendType.getName());
        }
        return map;
    }

    /**
     *
     * @Title: getValueName
     * @Description: TODO(根据value得到name)
     * @param @param value
     * @param @return    设定文件
     * @return String    返回类型
     * @throws
     */
    public static String getValueName(int value) {
        for (RunplanStatisticsTypeEnum o : RunplanStatisticsTypeEnum.values()) {
            if (value == o.getValue()) {
                return o.getName();
            }
        }
        return null;
    }
}
