package br.com.zupacademy.rafaela.mercadolivre.Category;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/categoria")
public class CategoryController {
    CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @PostMapping
    public ResponseEntity<CategoryResponse> addCategory(@Valid @RequestBody CategoryRequest categoryRequest){
        Category category = categoryRequest.convert(categoryRepository);
        categoryRepository.save(category);
        return ResponseEntity.ok().body(new CategoryResponse(category));
    }
}
