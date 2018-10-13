package org.smart4j.framework.helper;

import org.apache.commons.lang3.ArrayUtils;
import org.smart4j.framework.annotation.Inject;
import org.smart4j.framework.util.ArrayUtil;
import org.smart4j.framework.util.CollectionUtll;
import org.smart4j.framework.util.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * @ProjectName: smart-framework
 * @Package: org.smart4j.framework.helper
 * @ClassName: ${TYPE_NAME}
 * @Description: java类作用描述
 * @Author: Ren, Jianyong.
 * @CreateDate: 2018/10/13 11:40
 * @UpdateUser: Ren, Jianyong.
 * @UpdateDate: 2018/10/13 11:40
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class IocHelper {
    static {
        //获取所有Bean实例和Bean类之间的关系
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        if (CollectionUtll.isNotEmpty(beanMap)) {
            for (Map.Entry<Class<?>, Object> map : beanMap.entrySet()) {
                //获取所有BeanMap中的Java类
                Class<?> clazz = map.getKey();
                //获取所有BeanMap中的Bean实例
                Object bean = map.getValue();
                //获取Bean类下声明的所有成员变量
                Field[] fields = clazz.getDeclaredFields();
                if (ArrayUtil.isNotEmpty(fields)) {
                    for (Field field : fields) {
                        //判断当前成员变量是否存在Inject注解
                        if (field.isAnnotationPresent(Inject.class)) {
                            Class<?> beanFieldClass = field.getType();
                            Object beanFieldClassInstance = beanMap.get(beanFieldClass);
                            if (beanFieldClassInstance != null) {
                                //通过反射初始化BeanField实例对象
                                ReflectionUtil.setField(bean, field, beanFieldClassInstance);
                            }
                        }
                    }
                }
            }
        }
    }
}
