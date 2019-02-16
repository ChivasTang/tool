package com.hht.service;

import com.hht.dao.ImageViewerDao;
import com.hht.domain.ImageViewerResDomain;
import com.hht.domain.ParamDomain;


import javax.annotation.Resource;
import java.util.List;

public class ImageViewerServiceImpl implements ImageViewerService {

    @Resource
    private ImageViewerDao imageViewerDao;

    @Override
    public List<ImageViewerResDomain> selectIVList(ParamDomain param) {
        return imageViewerDao.selectIVList(param);
    }
}
