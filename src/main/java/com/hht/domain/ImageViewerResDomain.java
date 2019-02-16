package com.hht.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class ImageViewerResDomain {
    private Long disp_num;
    private Long inst_id;
    private Long file_id;
    private String inst_name;
    private String file_name;
    private String file_type;
    private Long file_size;
}
