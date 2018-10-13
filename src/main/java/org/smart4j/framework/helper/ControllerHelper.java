package org.smart4j.framework.helper;

import org.smart4j.framework.bean.Handler;
import org.smart4j.framework.bean.Request;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ProjectName: smart-framework
 * @Package: org.smart4j.framework.helper
 * @ClassName: ${TYPE_NAME}
 * @Description: java类作用描述
 * @Author: Ren, Jianyong.
 * @CreateDate: 2018/10/13 14:43
 * @UpdateUser: Ren, Jianyong.
 * @UpdateDate: 2018/10/13 14:43
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2018</p>
 */
public final class ControllerHelper {
    //存放请求和处理器的映射关系
    private static final Map<Request, Handler> ACTION_MAP = new HashMap<Request, Handler>();

    static {
        Set<Class<?>> classSet = ClassHelper.getControllerClassSet();
    }
}
