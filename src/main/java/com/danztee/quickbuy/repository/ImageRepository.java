package com.danztee.quickbuy.repository;

import com.danztee.quickbuy.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
