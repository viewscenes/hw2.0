package com.hw.domain.vo;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FtpServerVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ip;//ftp ip
    private int port;//端口
    private String ftpUser;//ftp 用户;
    private String ftpPassword;//ftp 密码;
    private boolean canUsed =true;//是否可以使用
    private String states;//管理那些州


}
