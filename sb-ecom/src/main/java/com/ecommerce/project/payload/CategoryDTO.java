package com.ecommerce.project.payload;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CategoryDTO {
    private Long categoryId;
    private String categoryName;
}
