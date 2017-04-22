package cn.itweet.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 说明：以当前时间为时间戳
 * 包名：cn.itweet.common.utils
 * 项目名：itweet-boot
 * 创建人：孙大飞
 * 创建时间：2017/4/22.
 */
public class TimeMillisUtils {

    private static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
    public static String getTimeMillis(){
        return df.format(new Date());
    }
}
