package com.hht.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class ParamDomain {
    private Long customer_id;
    private String user_id;
}
