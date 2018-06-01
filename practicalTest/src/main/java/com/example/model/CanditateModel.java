package com.example.model;

import com.example.entity.Candidate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CanditateModel extends PagingAndSortingRepository<Candidate, Integer> {
}
