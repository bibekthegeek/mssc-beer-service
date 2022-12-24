package com.bibek.msscbeerservice.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Bibek on 24-12-2022
 */

public class BeerPagedList extends PageImpl {

    public BeerPagedList(List content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPagedList(List content) {
        super(content);
    }
}
