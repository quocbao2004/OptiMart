package com.Optimart.services.Product;

import com.Optimart.dto.Product.CreateProductDTO;
import com.Optimart.dto.Product.ProductDTO;
import com.Optimart.dto.Product.ProductMultiDeleteDTO;
import com.Optimart.dto.Product.ReactionProductDTO;
import com.Optimart.models.Product;
import com.Optimart.responses.APIResponse;
import com.Optimart.responses.PagingResponse;

import java.util.List;
import java.util.Map;

public interface IProductService {
    APIResponse<Product> createProduct(CreateProductDTO createProductDTO);
    APIResponse<Boolean> likeProduct(ReactionProductDTO reactionProductDTO, String token);
    PagingResponse<List<Product>> findAllProduct(Map<Object, String> filters);
    PagingResponse<List<Product>> findAllProductPublic(Map<Object, String> filters);
    PagingResponse<List<Product>> getListProductRelatedTo(Map<Object, String> filters);
    Product getOneProduct(String productId);
    Product getOneProductBySlug(String slug);
    Product getOneProductPublic(String productId, Boolean isViewed);
    APIResponse<Product> updateProduct(ProductDTO product, String productId);
    APIResponse<Boolean> deleteProduct(String productId);
    APIResponse<Boolean> deleteMultiProduct(ProductMultiDeleteDTO productMultiDeleteDTO);
}
