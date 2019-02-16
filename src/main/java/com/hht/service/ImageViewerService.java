package com.hht.service;

import com.hht.domain.ImageViewerResDomain;
import com.hht.domain.ParamDomain;

import java.util.List;

public interface ImageViewerService {
    List<ImageViewerResDomain> selectIVList(ParamDomain param);
}
