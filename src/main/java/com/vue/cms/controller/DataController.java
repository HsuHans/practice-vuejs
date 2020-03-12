package com.vue.cms.controller;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vue.cms.entity.Article;
import com.vue.cms.entity.PageRequest;
import com.vue.cms.entity.PageResult;

@RestController
@RequestMapping("/data")
public class DataController {

	@RequestMapping("/get-paged-article")
	public PageResult<Article> getPagedArticle(@RequestBody PageRequest pageRequest) {
		int currentPage = pageRequest.getCurrentPage();
		int size = pageRequest.getSize();

		List<Article> mockData = new LinkedList<Article>();

		Calendar cal = Calendar.getInstance();

		int start = (currentPage - 1) * size + 1;
		int end = currentPage * size;
		for (int i = start; i <= end; i++) {
			cal.add(Calendar.DATE, -1);
			mockData.add(new Article(new BigDecimal(i), "title" + i, "department" + i, cal.getTime()));
		}
		
		PageResult<Article> pageResult = new PageResult<>(mockData, currentPage, size, 200);
		return pageResult;
	}
}
