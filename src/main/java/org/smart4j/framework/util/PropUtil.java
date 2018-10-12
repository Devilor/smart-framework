package org.smart4j.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 属性配置文件工具类
 *
 * @ProjectName: chapter2
 * @Package: org.smart4j.chapter2.util
 * @ClassName: ${TYPE_NAME}
 * @Description: java类作用描述
 * @Author: Ren, Jianyong.
 * @CreateDate: 2018/10/6 23:29
 * @UpdateUser: Ren, Jianyong.
 * @UpdateDate: 2018/10/6 23:29
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2018</p>
 */
public final class PropUtil {

    private final static Logger LOGGER = LoggerFactory.getLogger(PropUtil.class);

    /**
     * 加载属性文件
     *
     * @param fileName
     * @return
     */
    public static Properties loadProps(String fileName) {
        Properties properties = null;
        try (InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName)) {
            if (inputStream == null) {
                throw new FileNotFoundException(fileName + " file is not found!");
            }
            properties = new Properties();
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.error("load properties file faiture!", e);
        }
        return properties;
    }

    /**
     * 获取配置文件中指定key的value（默认值为空字符串）
     *
     * @param properties
     * @param key
     * @return
     */
    public static String getStringProp(Properties properties, String key) {
        return getStringProp(properties, key, "");
    }

    /**
     * 获取配置文件中指定key的value（默认值可以指定）
     *
     * @param properties
     * @param key
     * @param defaultKey
     * @return
     */
    public static String getStringProp(Properties properties, String key, String defaultKey) {
        String value = defaultKey;
        if (properties.containsKey(key)) {
            value = properties.getProperty(key);
        }
        return value;
    }

    /**
     * 获取配置文件中指定key的value（默认值可以指定）
     *
     * @param properties
     * @param key
     * @param defaultValue
     * @return
     */
    public static int getIntProp(Properties properties, String key, int defaultValue) {
        int value = defaultValue;
        if (properties.containsKey(key)) {
            value = CaseUtil.caseInt(properties.getProperty(key));
        }
        return value;
    }

    /**
     * 获取配置文件中指定key的value（默认值0）
     *
     * @param properties
     * @param key
     * @return
     */
    public static int getIntProp(Properties properties, String key) {
        return getIntProp(properties, key, 0);
    }

}
