package service;

import model.Product;
import repository.ProductRepository;
import java.util.List;
import java.util.ArrayList;

public class userservice {  // Sửa tên class thành UserService với chữ hoa đầu

    private final ProductRepository productRepository;  // Đổi tên biến thành chữ thường

    // Sử dụng constructor để inject ProductRepository
    public userservice(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProductList() {
        // Lấy danh sách sản phẩm từ productRepository
        List<Product> products = productRepository.findAll();

        // Tạo một danh sách Product để trả về
        List<Product> productModels = new ArrayList<>();

        // Thêm các Product vào danh sách
        for (Product product : products) {
            productModels.add(product);
        }

        return productModels;
    }
}
