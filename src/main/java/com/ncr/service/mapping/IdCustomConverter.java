package com.ncr.service.mapping;

import org.apache.commons.lang3.StringUtils;
import org.dozer.CustomConverter;

/**
 * @author kartik
 */
public class IdCustomConverter implements CustomConverter {
    final static String DELIMITER="!";

    @Override public Object convert(Object dest, Object source, Class<?> aClass, Class<?> aClass1) {
        if (source == null) {
            return null;
        }

        String convertedValue = null;
        final String inputValue = (String) source;

        if (StringUtils.contains(inputValue, DELIMITER))
            convertedValue = getIdValue(inputValue);
        else
            convertedValue=inputValue;

        return convertedValue;
    }

    private String getIdValue(String inputValue) {
        return StringUtils.substringBefore(inputValue,DELIMITER);
    }
}
