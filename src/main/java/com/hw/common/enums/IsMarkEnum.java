package com.hw.common.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @Description:是否打分
 * @date 14-9-18上午11:22
 */
public enum IsMarkEnum {
    NOT_CHECK(0,"未检查"),
    MARKED(1,"打分"),
    NO_MARK(2,"未打分");

    private Integer value;
    private String name;
    public Integer getValue() {
        return value;
    }
    public String getName() {
        return name;
    }


    private IsMarkEnum(Integer value, String name){
        this.value = value;
        this.name = name;
    }

    public static Map<Integer,String> transferToMap(){
        Map<Integer,String> map = new HashMap<Integer,String>();
        for(IsMarkEnum sendType : EnumSet.allOf(IsMarkEnum.class)){
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
        for (IsMarkEnum o : IsMarkEnum.values()) {
            if (value == o.getValue()) {
                return o.getName();
            }
        }
        return null;
    }
}
