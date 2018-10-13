package org.smart4j.framework.helper;

import org.smart4j.framework.util.ReflectionUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ProjectName: smart-framework
 * @Package: org.smart4j.framework.helper
 * @ClassName: ${TYPE_NAME}
 * @Description: java类作用描述
 * @Author: Ren, Jianyong.
 * @CreateDate: 2018/10/13 11:29
 * @UpdateUser: Ren, Jianyong.
 * @UpdateDate: 2018/10/13 11:29
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2018</p>
 */
public final class BeanHelper {

    private static final Map<Class<?>, Object> BEAN_MAP = new HashMap<Class<?>, Object>();

    static {
        Set<Class<?>> classSet = ClassHelper.getAllBeanClassSet();
        for (Class<?> cls : classSet) {
            Object obj = ReflectionUtil.newInstance(cls);
            BEAN_MAP.put(cls, obj);
        }
    }

    public static Map<Class<?>, Object> getBeanMap() {
        return BEAN_MAP;
    }

    public static <T> T getBean(Class<T> clazz) {
        if (!BEAN_MAP.containsKey(clazz)) {
            throw new RuntimeException("Can not get bean by class:" + clazz);
        }
        return (T)BEAN_MAP.get(clazz);
    }
}
