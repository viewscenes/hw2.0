package com.hw.common.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @Description:效果统计规则
 * @date 14-9-18上午11:22
 */
public enum StatisticsRuleEnum {
    PLAY_TIME(1, "按播音时间"),
    HARF_HOUR(2, "按半小时"),
    ONE_HOUR(3,"按一小时");

    private Integer value;
    private String name;
    public Integer getValue() {
        return value;
    }
    public String getName() {
        return name;
    }


    private StatisticsRuleEnum(Integer value, String name){
        this.value = value;
        this.name = name;
    }

    public static Map<Integer,String> transferToMap(){
        Map<Integer,String> map = new HashMap<Integer,String>();
        for(StatisticsRuleEnum sendType : EnumSet.allOf(StatisticsRuleEnum.class)){
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
        for (StatisticsRuleEnum o : StatisticsRuleEnum.values()) {
            if (value == o.getValue()) {
                return o.getName();
            }
        }
        return null;
    }
}
