package com.hht.dao;

import com.hht.domain.ImageViewerResDomain;
import com.hht.domain.ParamDomain;

import java.util.List;

public interface ImageViewerDao {
    List<ImageViewerResDomain> selectIVList(ParamDomain param);
}
