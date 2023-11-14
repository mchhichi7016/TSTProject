package hello.com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//web表示
	//URL
	@GetMapping("/hello")
	public String getHello() {
		return "<h1>Hello World</h1>";
	}

}
