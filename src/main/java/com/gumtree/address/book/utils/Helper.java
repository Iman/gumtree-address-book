package com.gumtree.address.book.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Helper {

    public final static String DATE_FORMAT = "dd/MM/yy";
    private static final Logger LOG = LoggerFactory.getLogger(Helper.class);

    public static Date convertStringToDate(String date) throws ParseException {
        DateFormat format = new SimpleDateFormat(DATE_FORMAT, Locale.ENGLISH);
        return format.parse(date);
    }

    public static long getTimeDiffFromTwoDate(Date date1, Date date2) {
        try {
            long timeDifferenceMilliseconds = date2.getTime() - date1.getTime();
            long diffDays = timeDifferenceMilliseconds / (60 * 60 * 1000 * 24);
            return diffDays;
        } catch (NullPointerException ex) {
            LOG.debug("an exception was thrown", ex);
            throw ex;
        }

    }

}
