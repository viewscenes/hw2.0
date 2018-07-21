package com.hw.common.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @Description:
 * @date 14-9-18上午11:22
 */
public enum SequenceEnum {
    MARK_ID("RADIO_MARK_ZST_SEQ", "打分序列"),
    REAIO_MARK_REL("RADIO_MARK_REL_SEQ", "打分录音关系序列");

    private String key;
    private String name;
    public String getKey() {
        return key;
    }
    public String getName() {
        return name;
    }


    private SequenceEnum(String key, String name){
        this.key = key;
        this.name = name;
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
    public static String getFullSequenceKey(String key) {
        for (SequenceEnum o : SequenceEnum.values()) {
            if (o.getKey().equals(key)) {
                return o.getKey()+".nextval";
            }
        }
        return null;
    }
}
