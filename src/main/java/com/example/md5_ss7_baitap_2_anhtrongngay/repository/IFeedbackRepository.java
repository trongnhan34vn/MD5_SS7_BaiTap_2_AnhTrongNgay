package com.example.md5_ss7_baitap_2_anhtrongngay.repository;

import com.example.md5_ss7_baitap_2_anhtrongngay.model.Feedback;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFeedbackRepository extends PagingAndSortingRepository<Feedback, Long> {
//    Iterable<Feedback> findFeedbackByDate(String date);
    Page<Feedback> findFeedbackByDate(String date, Pageable pageable);
}
