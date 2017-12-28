package com.hw.service.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class ServiceLocator implements ApplicationContextAware {

	private static ApplicationContext ctx = null;

	public static ApplicationContext getCtx() {
		return ctx;
	}
	/**
	 *
	 * Spring bean的查找
	 * @author: wangjiangbo
	 * @version: 2012-5-23 下午2:50:16
	 */
	public static Object getBean(String name) {
		if (ctx == null) {
			return null;
		}
        if(ctx.containsBean(name)){
            return ctx.getBean(name);
        }
        name = name + "Impl";
        if(ctx.containsBean(name)){
            return ctx.getBean(name);
        }
        return null;
	}
    public static void applyBeanPropertyValues(Object existingBean,
                                               String beanName) throws BeansException {
        if (ctx == null) {
           // log.error("ctx is null!");
            return;
        }
        if (ctx.getAutowireCapableBeanFactory() == null) {
            //log.error("ctx's autowireCapableBeanFactory is null!");
            return;
        }
        ctx.getAutowireCapableBeanFactory().applyBeanPropertyValues(
                existingBean, beanName);
    }

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		ctx = applicationContext;

	}

}