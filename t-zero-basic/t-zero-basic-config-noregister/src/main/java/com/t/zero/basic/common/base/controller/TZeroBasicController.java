package com.t.zero.basic.common.base.controller;

import com.t.zero.basic.component.response.ResponseExceptionHandler;

public class TZeroBasicController {

    public final ResponseExceptionHandler responseExceptionHandler;

    public TZeroBasicController(ResponseExceptionHandler responseExceptionHandler) {
        this.responseExceptionHandler = responseExceptionHandler;
    }

}
