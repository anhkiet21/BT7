package com.example.demo.service;

import com.example.demo.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategoryService {

    // Lấy tất cả category
    List<Category> getAllCategories();

    // Lấy category theo id
    Category getCategoryById(Integer id);

    // Thêm mới hoặc cập nhật category
    Category saveCategory(Category category);

    // Xóa category theo id
    void deleteCategory(Integer id);

    // Tìm category theo tên
    List<Category> searchCategories(String name);

    // Tìm category theo tên có phân trang
    Page<Category> searchCategories(String name, Pageable pageable);
    
    List<Category> searchByName(String name);
}
