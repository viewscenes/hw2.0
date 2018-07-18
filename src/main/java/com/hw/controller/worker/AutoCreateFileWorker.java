package com.hw.controller.worker;

import com.hw.common.constant.SystemConstants;
import com.hw.domain.po.ResHeadendTab;
import com.hw.service.ResHeadendService;
import com.hw.service.SysConfigurationService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;


@Component
public class AutoCreateFileWorker {

    private static Log log = LogFactory.getLog(AutoCreateFileWorker.class);

    @Resource
    private SysConfigurationService configurationService;

    @Resource
    private ResHeadendService headendService;
    /**
     * 每1分钟执行一次数据库检查
     */
    //@Scheduled(initialDelay = 2000,  fixedDelay = 60*1000)
    public void execute() {
        try{
            Calendar calendar = Calendar.getInstance();
            this.createFolder(calendar);
        }catch (Exception e)
        {
            log.info("自动创建文件夹异常！",e);
        }
   }
    /**
     *
     * @param
     * @return String
     */
    public void createFolder(Calendar cal) {
        String path= "/Users/liubin11/video_location";

        if(path!=null&&path!=""&&path.length()!=0)
        {
            ArrayList list=(ArrayList) headendService.selectHeadendList(null);
            ArrayList codelist=new  ArrayList();
            for(int i=0;i<list.size();i++)
            {
                ResHeadendTab bean =(ResHeadendTab) list.get(i);
                String code=bean.getCode();
                codelist.add(code);
            }

            for(int days=0;days<30;days++)
            {
                int year=cal.get(Calendar.YEAR);//得到年
                int month=cal.get(Calendar.MONTH)+1;//得到月，因为从0开始的，所以要加1
                int day=cal.get(Calendar.DAY_OF_MONTH);//得到天
                File file=new File(path);
                if(!file.exists())
                    file.mkdir();
                path=path+"/"+year;
                file=new File(path);
                if(!file.exists())
                    file.mkdir();
                path=path+"/"+month;
                file=new File(path);
                if(!file.exists())
                    file.mkdir();
                path=path+"/"+day;
                file=new File(path);
                if(!file.exists())
                    file.mkdir();
                for(int j=0;j<codelist.size();j++)
                {
                    file=new File(path+"/"+codelist.get(j));
                    if(!file.exists())
                        file.mkdir();
                }
                cal.add(Calendar.DAY_OF_MONTH, -1);
            }
        }


    }


}
