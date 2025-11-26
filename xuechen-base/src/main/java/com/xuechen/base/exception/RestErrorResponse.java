package com.xuechen.base.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RestErrorResponse {
    private String errMessage;
}
