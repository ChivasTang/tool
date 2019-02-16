package com.hht.dao;

import com.hht.domain.ImageViewerResDomain;
import com.hht.domain.ParamDomain;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class ImageVIewerDaoImpl extends SqlSessionDaoSupport implements ImageViewerDao {
    @Override
    public List<ImageViewerResDomain> selectIVList(ParamDomain param) {
        String sql="ImageViewer.selectIVList";
        return getSqlSession().selectList(sql,param);
    }
}
