package com.example.md5_ss7_baitap_2_anhtrongngay.service;

import com.example.md5_ss7_baitap_2_anhtrongngay.model.Feedback;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IFeedbackService {
    Iterable<Feedback> findFeedbackByDate(int pageNum);
    void save(Feedback feedback);
    void remove(Long id);
    Optional<Feedback> findById(Long id);
}
