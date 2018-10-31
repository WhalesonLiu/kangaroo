package com.dreamtale.kangaroo.service;


import com.dreamtale.kangaroo.dto.ResponseModel;
import com.dreamtale.kangaroo.model.Annotator;
import com.dreamtale.kangaroo.model.AnnotatorRanges;

import java.util.List;

public interface IAnnotatorService {

	ResponseModel save(Annotator annotator);

	Annotator selectAnnotationArticleById(Integer articleId);

	void delete(Integer articleId);

	int insert(Annotator annotator);

	int update(Annotator annotator);

	List<Annotator> selectByUUID(String uuid);

	int insertAnnotatorRanges(List<AnnotatorRanges> annotatorRanges);

}