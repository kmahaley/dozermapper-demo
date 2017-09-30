package com.ncr.service.mapping;

import org.dozer.CustomConverter;

/**
 * @author km185223
 */
public class TestCustomConverter implements CustomConverter {
    @Override
    public Object convert(Object dest, Object source, Class<?> aClass, Class<?> aClass1) {
//        if (source == null)
            return null;

    }
}
