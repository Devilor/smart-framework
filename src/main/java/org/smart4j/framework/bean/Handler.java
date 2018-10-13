package org.smart4j.framework.bean;

import org.smart4j.framework.helper.ClassHelper;

import java.lang.reflect.Method;

/**
 * @ProjectName: smart-framework
 * @Package: org.smart4j.framework.bean
 * @ClassName: ${TYPE_NAME}
 * @Description: java类作用描述
 * @Author: Ren, Jianyong.
 * @CreateDate: 2018/10/13 14:42
 * @UpdateUser: Ren, Jianyong.
 * @UpdateDate: 2018/10/13 14:42
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class Handler {
    private Class<?> controllerClass;
    private Method actionMethod;

    public Handler(Class<?> controllerClass, Method actionMethod) {
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }

    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public void setControllerClass(Class<?> controllerClass) {
        this.controllerClass = controllerClass;
    }

    public Method getActionMethod() {
        return actionMethod;
    }

    public void setActionMethod(Method actionMethod) {
        this.actionMethod = actionMethod;
    }
}
