package com.hht.web;

import com.hht.domain.ImageViewerResDomain;
import com.hht.domain.ParamDomain;
import com.hht.service.ImageViewerService;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/")
public class ImageViewerController {

    @Resource
    private ImageViewerService imageViewerService;

    @RequestMapping(value = "/selectIVList", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<ImageViewerResDomain> selectIVList(@RequestBody ParamDomain param, HttpServletRequest req, HttpServletResponse res, Model model){
        return imageViewerService.selectIVList(param);
    }
}
