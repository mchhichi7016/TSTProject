package practice.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
	//展示页面
	@GetMapping("/product")
	public String getProductNewPage() {
		return "product_new.html";
	}
	
	@PostMapping("/product/result")
	public String result(@RequestParam String product_name, 
			@RequestParam String product_category, 
			@RequestParam String product_detail,
			Model model) {
		
		//数据传递
		model.addAttribute("name", product_name);
		model.addAttribute("category", product_category);
		model.addAttribute("detail", product_detail);
		return "product_result.html";
	}
	

}
