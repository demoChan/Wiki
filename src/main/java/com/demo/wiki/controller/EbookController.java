package com.demo.wiki.controller;

import com.demo.wiki.req.EbookReq;
import com.demo.wiki.resp.CommonResp;
import com.demo.wiki.resp.EbookResp;
import com.demo.wiki.resp.PageResp;
import com.demo.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController     //返回字符串
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookReq req)
    {
        CommonResp<PageResp<EbookResp>> resp = new CommonResp<>();
        PageResp<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}
