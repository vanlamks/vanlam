package ProductController;

import model.Product;
import repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/Product")
public class controller {
    @Autowired
    private ProductRepository productRepository;

    // Trả về trang index.html và truyền danh sách sản phẩm vào view
    @RequestMapping("/index")
    public String showIndexPage(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("products", products);  // Truyền danh sách sản phẩm vào model để sử dụng trong view
        return "index";  // Trả về tên view là index.html
    }

    }