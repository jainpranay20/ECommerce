package com.ecommerce.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;


@Entity(name = "categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;


    @Size(min = 5, message = "Category must contain atleast 5 categories")
    @NotBlank
    private String categoryName;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public @Size(min = 5, message = "Category must contain atleast 5 categories") @NotBlank String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(@Size(min = 5, message = "Category must contain atleast 5 categories") @NotBlank String categoryName) {
        this.categoryName = categoryName;
    }
}

