package com.lyh.controller;

import com.lyh.domain.ResponseResult;
import com.lyh.domain.vo.ArticleVO;
import com.lyh.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Author:crushlyh
 * Date:2023/2/18 21:02
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;
    /*@GetMapping("/list")
    public List<Article> test(){
        return articleService.list();
    }*/
    @GetMapping("/hotArticleList")
    public ResponseResult hotArticleList(){

        ResponseResult result = articleService.hotArticleList();
        return result;
    }
    @GetMapping("/articleList")
    public ResponseResult articleList(Integer pageNum,Integer pageSize,Long categoryId){
        ResponseResult articleVO = articleService.articleList(pageNum, pageSize, categoryId);
        return  ResponseResult.okResult(articleVO);
    }

    @PutMapping("/updateViewCount/{id}")
    public ResponseResult updateViewCount(@PathVariable("id") Long id){
        return articleService.updateViewCount(id);
    }
    @GetMapping("/{id}")
    public ResponseResult getArticleDetail(@PathVariable("id") Long id){
        return articleService.getArticleDetail(id);

    }
}
