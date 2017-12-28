package com.hw.common.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @Description:
 * @date 14-9-18上午11:22
 */
public enum RunplanTypeEnum {
    GJT_RUNPLAN(1, "国际台运行图"),
    HWLD_RUNPLAN(2, "海外落地运行图"),
    WGT_RUNPLAN(3, "外国台运行图");

    private Integer value;
    private String name;
    public Integer getValue() {
        return value;
    }
    public String getName() {
        return name;
    }


    private RunplanTypeEnum(Integer value, String name){
        this.value = value;
        this.name = name;
    }

    public static Map<Integer,String> transferToMap(){
        Map<Integer,String> map = new HashMap<Integer,String>();
        for(RunplanTypeEnum sendType : EnumSet.allOf(RunplanTypeEnum.class)){
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
        for (RunplanTypeEnum o : RunplanTypeEnum.values()) {
            if (value == o.getValue()) {
                return o.getName();
            }
        }
        return null;
    }
}
