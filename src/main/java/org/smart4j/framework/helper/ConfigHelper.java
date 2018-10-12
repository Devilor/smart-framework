package org.smart4j.framework.helper;

import org.smart4j.framework.ConfigConstant;
import org.smart4j.framework.util.PropUtil;

import java.util.Properties;

/**
 * @ProjectName: smart-framework
 * @Package: org.smart4j.framework.helper
 * @ClassName: ${TYPE_NAME}
 * @Description: java类作用描述
 * @Author: Ren, Jianyong.
 * @CreateDate: 2018/10/12 11:32
 * @UpdateUser: Ren, Jianyong.
 * @UpdateDate: 2018/10/12 11:32
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2018</p>
 */
public final class ConfigHelper {

    private static final Properties CONFIG_PROPS = PropUtil.loadProps(ConfigConstant.CONFIG_FILE);

    public static String getJdbcDriver() {
        return PropUtil.getStringProp(CONFIG_PROPS, ConfigConstant.JDBC_DRIVER);
    }

    public static String getJdbcUrl() {
        return PropUtil.getStringProp(CONFIG_PROPS, ConfigConstant.JDBC_URL);
    }

    public static String getJdbcUserName() {
        return PropUtil.getStringProp(CONFIG_PROPS, ConfigConstant.JDBC_USERNAME);
    }

    public static String getJdbcPassWord() {
        return PropUtil.getStringProp(CONFIG_PROPS, ConfigConstant.JDBC_PASSWORD);
    }

    public static String getAppBasePackage() {
        return PropUtil.getStringProp(CONFIG_PROPS, ConfigConstant.APP_BASE_PACKAGE);
    }

    public static String getAppJspPath() {
        return PropUtil.getStringProp(CONFIG_PROPS, ConfigConstant.APP_JSP_PATH, "/WEB-INF/view/");
    }

    public static String getAppAssetPath() {
        return PropUtil.getStringProp(CONFIG_PROPS, ConfigConstant.APP_ASEET_PATH, "/asset/");
    }
}
