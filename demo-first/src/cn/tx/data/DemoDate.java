package cn.tx.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat rq = new SimpleDateFormat("yyyyMMdd");
        String format = rq.format(date);
        System.out.println(format);

        String s = "2018-12-12";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            //把字符串解析成日期对象
            Date parse = sdf.parse(s);
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
