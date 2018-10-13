package org.smart4j.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @ProjectName: smart-framework
 * @Package: org.smart4j.framework.util
 * @ClassName: ${TYPE_NAME}
 * @Description: java类作用描述
 * @Author: Ren, Jianyong.
 * @CreateDate: 2018/10/13 14:23
 * @UpdateUser: Ren, Jianyong.
 * @UpdateDate: 2018/10/13 14:23
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2018</p>
 */
public final class ArrayUtil {
    public static boolean isNotEmpty(Object[] array) {
        return !ArrayUtils.isEmpty(array);
    }

    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }
}
