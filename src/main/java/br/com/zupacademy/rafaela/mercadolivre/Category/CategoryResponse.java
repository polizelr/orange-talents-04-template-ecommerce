package br.com.zupacademy.rafaela.mercadolivre.Category;

public class CategoryResponse {
    private Long id;
    private String name;
    private Category parentCategory;

    public CategoryResponse(Category category) {
        id = category.getId();
        name = category.getName();
        parentCategory = category.getCategory();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getParentCategory() {
        return parentCategory;
    }
}
