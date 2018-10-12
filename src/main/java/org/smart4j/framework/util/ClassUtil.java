package org.smart4j.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

/**
 * @ProjectName: smart-framework
 * @Package: org.smart4j.framework.util
 * @ClassName: ${TYPE_NAME}
 * @Description: java类作用描述
 * @Author: Ren, Jianyong.
 * @CreateDate: 2018/10/12 14:07
 * @UpdateUser: Ren, Jianyong.
 * @UpdateDate: 2018/10/12 14:07
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2018</p>
 */
public final class ClassUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClassUtil.class);

    public static ClassLoader getClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }

    public static Class<?> loadClass(String className, boolean isInitialized) {
        Class<?> aClass = null;
        try {
            aClass = Class.forName(className, isInitialized, getClassLoader());
        } catch (ClassNotFoundException e) {
            LOGGER.error("Class Not Found !load class failure!", e);
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return aClass;
    }

    public static Set<Class<?>> getClassSet(String packageName) {
        return null;
    }
}
