package com.hw.domain.vo;




import java.io.Serializable;


public class FtpServerVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ip;//ftp ip
    private int port;//端口
    private String ftpUser;//ftp 用户;
    private String ftpPassword;//ftp 密码;
    private boolean canUsed =true;//是否可以使用
    private String states;//管理那些州

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public String getFtpUser() {
        return ftpUser;
    }

    public void setFtpUser(String ftpUser) {
        this.ftpUser = ftpUser;
    }

    public String getFtpPassword() {
        return ftpPassword;
    }

    public void setFtpPassword(String ftpPassword) {
        this.ftpPassword = ftpPassword;
    }

    public boolean isCanUsed() {
        return canUsed;
    }

    public void setCanUsed(boolean canUsed) {
        this.canUsed = canUsed;
    }
}
