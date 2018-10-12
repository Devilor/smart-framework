package org.smart4j.framework.util;

/**
 * 格式转型工具类
 *
 * @ProjectName: chapter2
 * @Package: org.smart4j.chapter2.util
 * @ClassName: ${TYPE_NAME}
 * @Description: java类作用描述
 * @Author: Ren, Jianyong.
 * @CreateDate: 2018/10/6 23:50
 * @UpdateUser: Ren, Jianyong.
 * @UpdateDate: 2018/10/6 23:50
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2018</p>
 */
public final class CaseUtil {

    /**
     * Object => String
     *
     * @param object
     * @return
     */
    public static String caseString(Object object) {
        return CaseUtil.caseString(object, "");
    }

    /**
     * Object => String
     *
     * @param obj
     * @param defaultValue 默认值
     * @return
     */
    public static String caseString(Object obj, String defaultValue) {
        return null == obj ? defaultValue : String.valueOf(obj);
    }

    public static double caseDouble(Object obj, double defaultValue) {
        double value = defaultValue;
        if (obj != null) {
            String strValue = caseString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    value = Double.parseDouble(strValue);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    value = defaultValue;
                }
            }
        }
        return value;
    }

    public static double caseDouble(Object obj) {
        return caseDouble(obj, 0);
    }

    public static int caseInt(Object obj, int defaultValue) {
        int value = defaultValue;
        if (null != obj) {
            String strValue = caseString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    value = Integer.parseInt(strValue);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    value = defaultValue;
                }
            }
        }
        return value;
    }

    public static int caseInt(Object obj) {
        return caseInt(obj, 0);
    }

    public static long caseLong(Object obj, long defaultValue) {
        long result = defaultValue;
        if (null != obj) {
            String strValue = caseString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    result = Long.parseLong(strValue);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    result = defaultValue;
                }
            }
        }
        return result;
    }

    public static long caseLong(Object object) {
        return caseLong(object, 0);
    }

    public static boolean caseBoolean(Object obj, boolean defaultValue) {
        boolean value = defaultValue;
        if (null != obj) {
            String strValue = caseString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                value = Boolean.parseBoolean(strValue);
            }
        }
        return value;
    }

    public static boolean caseBoolean(Object object) {
        return caseBoolean(object, true);
    }
}
