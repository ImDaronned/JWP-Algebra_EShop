package hr.algebra.admin.eshop.dto;

import hr.algebra.admin.eshop.model.Category;
import lombok.Data;

@Data
public class ProductDTO {

    private Long id;
    private String name;
    private double price;
    private String description;
    private String imageName;
    private int categoryId;

}
