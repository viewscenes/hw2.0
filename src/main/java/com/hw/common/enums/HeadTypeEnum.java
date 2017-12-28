package com.hw.common.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @Description:大洲枚举值
 * @date 14-9-18上午11:22
 */
public enum HeadTypeEnum {
    CJD(101, "采集点"),
    YKZ(102,"遥控站");

    private Integer value;
    private String name;
    public Integer getValue() {
        return value;
    }
    public String getName() {
        return name;
    }


    private HeadTypeEnum(Integer value, String name){
        this.value = value;
        this.name = name;
    }

    public static Map<Integer,String> transferToMap(){
        Map<Integer,String> map = new HashMap<Integer,String>();
        for(HeadTypeEnum sendType : EnumSet.allOf(HeadTypeEnum.class)){
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
        for (HeadTypeEnum o : HeadTypeEnum.values()) {
            if (value == o.getValue()) {
                return o.getName();
            }
        }
        return null;
    }
}
