package org.smart4j.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ProjectName: smart-framework
 * @Package: org.smart4j.framework.annotation
 * @ClassName: ${TYPE_NAME}
 * @Description: java类作用描述
 * @Author: Ren, Jianyong.
 * @CreateDate: 2018/10/13 10:44
 * @UpdateUser: Ren, Jianyong.
 * @UpdateDate: 2018/10/13 10:44
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2018</p>
 */

@Target(ElementType.FIELD) @Retention(RetentionPolicy.RUNTIME) public @interface Inject {
}
