package org.smart4j.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ProjectName: smart-framework
 * @Package: org.smart4j.framework.util
 * @ClassName: ${TYPE_NAME}
 * @Description: java类作用描述
 * @Author: Ren, Jianyong.
 * @CreateDate: 2018/10/13 11:18
 * @UpdateUser: Ren, Jianyong.
 * @UpdateDate: 2018/10/13 11:18
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2018</p>
 */
public final class ReflectionUtil {

    //日志管理
    private final static Logger LOGGER = LoggerFactory.getLogger(ReflectionUtil.class);

    /**
     * 创建对象
     *
     * @param cls
     * @return
     */
    public static Object newInstance(Class<?> cls) {
        Object instance = null;
        try {
            instance = cls.newInstance();
        } catch (Exception e) {
            LOGGER.error("New Instance failure!", e);
            throw new RuntimeException(e);
        }
        return instance;
    }

    /**
     * 方法调用
     *
     * @param targetObj
     * @param method
     * @param params
     * @return
     */
    public static Object invokeMethod(Object targetObj, Method method, Object... params) {
        Object result;
        try {
            method.setAccessible(true);
            result = method.invoke(targetObj, params);
        } catch (Exception e) {
            LOGGER.error("Invoke Method Failture!", e);
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void setField(Object targetObj, Field field, Object value) {
        try {
            field.setAccessible(true);
            field.set(targetObj, value);
        } catch (Exception e) {
            LOGGER.error("Field Set Failure!", e);
            throw new RuntimeException(e);
        }
    }
}
