package com.hw.common.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @Description:大洲枚举值
 * @date 14-9-18上午11:22
 */
public enum StateEnum {
    ASIA(0, "亚洲"),
    EUROPE(1,"欧洲"),
    AFRICA(2,"非洲"),
    NORTH_AMERICA(3,"北美洲"),
    SOUTH_AMERICA(4,"南美洲"),
    OCEANIA(5,"大洋洲"),
    ANTARCTICA(6,"南极洲");

    private Integer value;
    private String name;
    public Integer getValue() {
        return value;
    }
    public String getName() {
        return name;
    }


    private StateEnum(Integer value, String name){
        this.value = value;
        this.name = name;
    }


    public static Map<Integer,String> transferToMap(){
        Map<Integer,String> map = new HashMap<Integer,String>();
        for(StateEnum sendType : EnumSet.allOf(StateEnum.class)){
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
        for (StateEnum o : StateEnum.values()) {
            if (value == o.getValue()) {
                return o.getName();
            }
        }
        return null;
    }
}
