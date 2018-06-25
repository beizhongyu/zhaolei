package com.zl.first.test.service;


import java.util.UUID;

/**
 * 生成id
 */
public interface IdService {

    String REPLACEMENT = "";
    String REGEX = "-";

    /**
     * 生成id
     *
     * @return uuid
     */
    default String id() {
        return UUID.randomUUID().toString().replaceAll(REGEX, REPLACEMENT);
    }
}
