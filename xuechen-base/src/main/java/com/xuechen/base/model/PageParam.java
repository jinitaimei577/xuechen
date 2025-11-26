package com.xuechen.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageParam {
    private Long pageNo = 1L;
    private Long pageSize = 10L;
}
