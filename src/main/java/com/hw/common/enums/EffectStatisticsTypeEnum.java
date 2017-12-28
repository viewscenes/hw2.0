package com.hw.common.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @Description:效果统计类型
 * @date 14-9-18上午11:22
 */
public enum EffectStatisticsTypeEnum {
    GJT_TJ("11,", "国际台广播效果统计"),
    FST_TJ("21,22,23,","发射台播出效果统计"),
    YY_TJ("31,32,", "语言播出效果统计"),
    KTL_TJ("41,", "各地区、各大洲、可听率统计"),
    PS_TJ("51,", "各遥控站、各地区、各大洲、可保证收听频时统计"),
    DB_TJ("61,", "各月各遥控站、各地区、各大洲和全球可听率对比"),
    MYD_TJ("71,", "各频率可听度满意程度和可听率统计");

    private String value;
    private String name;
    public String getValue() {
        return value;
    }
    public String getName() {
        return name;
    }


    private EffectStatisticsTypeEnum(String value, String name){
        this.value = value;
        this.name = name;
    }

    public static Map<String,String> transferToMap(){
        Map<String,String> map = new HashMap<String,String>();
        for(EffectStatisticsTypeEnum sendType : EnumSet.allOf(EffectStatisticsTypeEnum.class)){
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
    public static String getValueName(String value) {
        for (EffectStatisticsTypeEnum o : EffectStatisticsTypeEnum.values()) {
            if (value.equals(o.getValue())) {
                return o.getName();
            }
        }
        return null;
    }
}
