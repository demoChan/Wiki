package com.demo.wiki.controller;

import com.demo.wiki.req.EbookQueryReq;
import com.demo.wiki.req.EbookSaveReq;
import com.demo.wiki.resp.CommonResp;
import com.demo.wiki.resp.EbookQueryResp;
import com.demo.wiki.resp.PageResp;
import com.demo.wiki.service.EbookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController     //返回字符串
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookQueryReq req)
    {
        CommonResp<PageResp<EbookQueryResp>> resp = new CommonResp<>();
        PageResp<EbookQueryResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }

    @PostMapping("/save")
    public CommonResp save(@RequestBody EbookSaveReq req)
    {
        CommonResp resp = new CommonResp<>();
        ebookService.save(req);
        return resp;
    }
}
