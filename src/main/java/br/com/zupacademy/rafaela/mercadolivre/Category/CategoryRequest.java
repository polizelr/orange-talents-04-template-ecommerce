package br.com.zupacademy.rafaela.mercadolivre.Category;

import br.com.zupacademy.rafaela.mercadolivre.config.validation.ExistsId;
import br.com.zupacademy.rafaela.mercadolivre.config.validation.UniqueValue;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotBlank;

public class CategoryRequest {
    @NotBlank
    @UniqueValue(domainClass = Category.class, fieldName = "name")
    private String name;

    @ExistsId(domainClass = Category.class, fieldName = "id")
    private Long parentId;

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentCategoryId(Long parentId) {
        this.parentId = parentId;
    }

    public Category convert(CategoryRepository categoryRepository) {
        Category category = new Category(name);

        if(parentId != null){
            Category parentCategory = categoryRepository.findById(parentId).get();
            category.setCategory(parentCategory);
        }
        return category;
    }


}
