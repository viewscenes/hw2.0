//package com.hw.common.utils;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.net.InetSocketAddress;
//import java.net.SocketAddress;
//
//import sun.net.ftp.FtpClient;
//import sun.net.ftp.FtpProtocolException;
//
//public class FTPUtil {
//
//
//    public static boolean ftpCanConnect(String url, int port, String username,
//                                       String password)
//    {
//        try {
//            FtpClient ftp = connectFTP(url,port,username,password);
//            if(ftp!=null){
//                disconnectFTP(ftp);
//                return true;
//            }
//        } catch (Exception e) {
//            return false;
//        }
//        return false;
//    }
//    /**
//     * 连接ftp服务器
//     *
//     * @param url
//     * @param port
//     * @param username
//     * @param password
//     * @return FtpClient
//     * @throws FtpProtocolException
//     * @throws IOException
//     */
//    public static FtpClient connectFTP(String url, int port, String username,
//                                       String password) throws Exception { // 创建ftp
//            FtpClient ftp = null;
//            // 创建地址
//            SocketAddress addr = new InetSocketAddress(url, port);
//            // 连接
//            ftp = FtpClient.create();
//            ftp.setConnectTimeout(3000);
//            ftp.connect(addr);
//            // 登陆
//            ftp.login(username, password.toCharArray());
//            ftp.setBinaryType();
//            System.out.println(ftp.getWelcomeMsg());
//        return ftp;
//    }
//
//    /**
//     * 切换目录
//     *
//     * @param ftp
//     * @param path
//     */
//    public static void changeDirectory(FtpClient ftp, String path) {
//        try {
//            ftp.changeDirectory(path);
//            System.out.println(ftp.getWorkingDirectory());
//        } catch (FtpProtocolException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * 关闭ftp
//     *
//     * @param ftp
//     */
//    public static void disconnectFTP(FtpClient ftp) {
//        try {
//            ftp.close();
//            System.out.println("disconnect success!!");
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * 上传文件
//     *
//     * @param localFile
//     * @param ftpFile
//     * @param ftp
//     */
//    public static void upload(String localFile, String ftpFile, FtpClient ftp) {
//        OutputStream os = null;
//        FileInputStream fis = null;
//        try {
//            // 将ftp文件加入输出流中。输出到ftp上
//            os = ftp.putFileStream(ftpFile);
//            File file = new File(localFile);
//            // 创建一个缓冲区
//            fis = new FileInputStream(file);
//            byte[] bytes = new byte[1024];
//            int c;
//            while ((c = fis.read(bytes)) != -1) {
//                os.write(bytes, 0, c);
//            }
//            System.out.println("upload success!!");
//        } catch (FtpProtocolException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } finally {
//            try {
//                if (os != null)
//                    os.close();
//                if (fis != null)
//                    fis.close();
//            } catch (IOException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
//    }
//
//    /**
//     * 文件下载
//     *
//     * @param localFile
//     * @param ftpFile
//     * @param ftp
//     */
//    public static void download(String localFile, String ftpFile, FtpClient ftp) {
//        InputStream is = null;
//        FileOutputStream fos = null;
//        try {
//            // 获取ftp上的文件
//            is = ftp.getFileStream(ftpFile);
//            File file = new File(localFile);
//            byte[] bytes = new byte[1024];
//            int i;
//            fos = new FileOutputStream(file);
//            while ((i = is.read(bytes)) != -1) {
//                fos.write(bytes, 0, i);
//            }
//            System.out.println("download success!!");
//        } catch (FtpProtocolException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } finally {
//            try {
//                if (fos != null)
//                    fos.close();
//                if (is != null) {
//                    is.close();
//                }
//            } catch (IOException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
//    }
//}