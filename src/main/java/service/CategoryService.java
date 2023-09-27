package service;

import entity.Category;
import repository.CategoryRepository;

import java.sql.SQLException;
import java.util.Locale;

public class CategoryService {

    private CategoryRepository categoryRepository=new CategoryRepository();

    public CategoryService() throws SQLException {
    }

    public  int save(Category category) throws SQLException {

        Category Category = new Category();
        return CategoryRepository.save(Category);
    }



}
