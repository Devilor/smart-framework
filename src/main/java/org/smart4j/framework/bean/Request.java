package org.smart4j.framework.bean;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.HashMap;

/**
 * @ProjectName: smart-framework
 * @Package: org.smart4j.framework.bean
 * @ClassName: ${TYPE_NAME}
 * @Description: java类作用描述
 * @Author: Ren, Jianyong.
 * @CreateDate: 2018/10/13 14:37
 * @UpdateUser: Ren, Jianyong.
 * @UpdateDate: 2018/10/13 14:37
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class Request {

    private String requestMethod;
    private String requestPath;

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestPath() {
        return requestPath;
    }

    public void setRequestPath(String requestPath) {
        this.requestPath = requestPath;
    }

    public Request(String requestMethod, String requestPath) {
        this.requestMethod = requestMethod;
        this.requestPath = requestPath;
    }

    @Override public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }
}
