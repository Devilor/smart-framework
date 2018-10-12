package org.smart4j.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @ProjectName: chapter2
 * @Package: org.smart4j.chapter2.util
 * @ClassName: ${TYPE_NAME}
 * @Description: java类作用描述
 * @Author: Ren, Jianyong.
 * @CreateDate: 2018/10/7 15:43
 * @UpdateUser: Ren, Jianyong.
 * @UpdateDate: 2018/10/7 15:43
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2018</p>
 */
public final class StringUtil {

    /**
     * 判断字符串是否为空
     *
     * @param value
     * @return
     */
    public static boolean isEmpty(String value) {
        if (null != value) {
            value = value.trim();
        }

        return StringUtils.isEmpty(value);
    }

    /**
     * 判断字符串不是空
     *
     * @param value
     * @return
     */
    public static boolean isNotEmpty(String value) {
        return !isEmpty(value);
    }
}
