package com.example.model;

import com.example.entity.AttendanceSlot;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SlotModel extends PagingAndSortingRepository<AttendanceSlot, Integer> {
}
