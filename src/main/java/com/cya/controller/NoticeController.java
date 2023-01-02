package com.cya.controller;

import cn.hutool.core.date.DateUtil;

import com.cya.entity.Notice;
import com.cya.service.NoticeService;
import com.cya.util.R;
import com.cya.util.consts.Constants;
import com.cya.util.http.CodeEnum;
import com.cya.util.ro.vo.NoticeOut;
import com.cya.util.ro.vo.PageOut;
import com.cya.util.ro.PageIn;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 公告管理
 */
@Api(tags = "公告管理")
@RestController
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @ApiOperation("公告列表")
    @PostMapping("/list")
    public R getNotices(@RequestBody PageIn pageIn) {
        if (pageIn == null) {
            return R.fail(CodeEnum.PARAM_ERROR);
        }
        // 封装分页出参对象
        PageInfo<Notice> noticeList = noticeService.getNoticeList(pageIn);
        PageOut pageOut = new PageOut();
        pageOut.setCurrPage(noticeList.getPageNum());
        pageOut.setPageSize(noticeList.getPageSize());
        pageOut.setTotal((int) noticeList.getTotal());
        List<Notice> outs = new ArrayList<>();
        for (Notice notice : noticeList.getList()) {
            NoticeOut out = new NoticeOut();
            BeanUtils.copyProperties(notice,out);
            out.setDate1(DateUtil.format(notice.getDate(),Constants.DATE_FORMAT));
            outs.add(out);
        }
        pageOut.setList(outs);

        return R.success(CodeEnum.SUCCESS,pageOut);
    }

    @ApiOperation("添加公告")
    @PostMapping("/addNoticer")
    public R addNoticer(@RequestBody Notice notice) {
        if (notice == null) {
            return R.fail(CodeEnum.PARAM_ERROR);
        }
        return R.success(CodeEnum.SUCCESS,noticeService.addNotice(notice));
    }


    @ApiOperation("编辑公告")
    @PostMapping("/update")
    public R modifyNotice(@RequestBody Notice notice) {
        return R.success(CodeEnum.SUCCESS,noticeService.updateNotice(notice));
    }


    @ApiOperation("公告详情")
    @GetMapping("/detail")
    public R noticeDetail(Integer id) {
        Notice notice = noticeService.findNoticeById(id);
        if (notice!=null) {
        	NoticeOut out = new NoticeOut();
            BeanUtils.copyProperties(notice,out);
            out.setDate1(DateUtil.format(notice.getDate(),Constants.DATE_FORMAT));
            return R.success(CodeEnum.SUCCESS,out);
        }

        return R.fail(CodeEnum.NOT_FOUND);
    }

    @ApiOperation("删除公告")
    @GetMapping("/delete")
    public R delNotice(Integer id) {
    	noticeService.deleteNotice(id);
        return R.success(CodeEnum.SUCCESS);
    }

}
