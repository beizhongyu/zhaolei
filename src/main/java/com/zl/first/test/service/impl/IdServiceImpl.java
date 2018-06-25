package com.zl.first.test.service.impl;

import com.zl.first.test.service.IdService;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class IdServiceImpl implements IdService {

    @Override
    public String id() {
        return UUID.randomUUID().toString().replaceAll(REGEX, REPLACEMENT);
    }
}
