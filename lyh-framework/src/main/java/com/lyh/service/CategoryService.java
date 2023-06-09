package com.lyh.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyh.domain.ResponseResult;
import com.lyh.domain.dto.AdminCategoryDTO;
import com.lyh.domain.entity.Category;

import java.util.List;


/**
 * 分类表(Category)表服务接口
 *
 * @author makejava
 * @since 2023-02-20 17:52:19
 */
public interface CategoryService extends IService<Category> {

    ResponseResult getCategoryList();

    ResponseResult listAllCategory();

    ResponseResult selectAllCategory(Integer pageNum, Integer pageSize, Category category);

    ResponseResult addCategory(Category category);

    ResponseResult selectCategoryById(Long id);

    ResponseResult updateCategory(Category category);

    ResponseResult deleteCategory(List<Long> ids);
}

