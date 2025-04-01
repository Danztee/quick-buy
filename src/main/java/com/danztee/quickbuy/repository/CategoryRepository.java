package com.danztee.quickbuy.repository;

import com.danztee.quickbuy.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category, Long> {
    Category findByName(String name);

    boolean existByName(String name);
}
