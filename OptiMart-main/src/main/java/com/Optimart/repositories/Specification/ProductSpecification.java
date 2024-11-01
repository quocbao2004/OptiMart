package com.Optimart.repositories.Specification;

import com.Optimart.models.Product;
import com.Optimart.models.User;
import org.springframework.data.jpa.domain.Specification;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class ProductSpecification {
    public static Specification<Product> byStatus(String status){
        return (root, query, criteriaBuilder) -> {
            if (status == null || status.isEmpty()) {
                return criteriaBuilder.conjunction();
            }
            List<String> statusList = Arrays.asList(status.split("-"));
            return root.get("status").in(statusList);
        };
    }

    public static Specification<Product> byProductType(String ProductType){
        return (root, query, criteriaBuilder) -> {
            if(ProductType == null || ProductType.isEmpty()){
                return criteriaBuilder.conjunction();
            }
            List<UUID> productTypeList = Arrays.stream(ProductType.split("\\|"))
                    .map(UUID::fromString)
                    .toList();

            return root.get("productType").get("id").in(productTypeList);
        };
    }

    public static Specification<Product> searchByKeyword(String search) {
        return (root, query, criteriaBuilder) -> {
            if (search == null || search.isEmpty()) {
                return criteriaBuilder.conjunction();
            }
            return criteriaBuilder.or(
                    criteriaBuilder.like(criteriaBuilder.lower(root.get("name")), "%" + search.toLowerCase() + "%"),
                    criteriaBuilder.like(criteriaBuilder.lower(root.get("slug")), "%" + search.toLowerCase() + "%")
            );
        };
    }

    public static Specification<Product> filterProducts(String ProductType, String statuses, String keyword) {
        return Specification.where(byProductType(ProductType))
                .and(byStatus(statuses))
                .and(searchByKeyword(keyword));
    }
}
