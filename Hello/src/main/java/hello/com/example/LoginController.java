package hello.com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	//展示login页面
	@GetMapping("/login")
	public String getloginPage() {
		return "login.html";
	}
	//展示register页面
	@GetMapping("/register")
	public String getRegisterPage() {
		return "register.html";
	}
	
	//展示result页面
	@GetMapping("/result")
	public String getSuccessPage() {
		return "success.html";
	}
	
	//login
	@PostMapping("/login/process")
	public String login(@RequestParam String email,@RequestParam String password) {
		System.out.println(email);
		System.out.println(password);
		//もし、emailの内容がadmin@test.com と比較して
		if(email.equals("admin@test.com")&&password.equals("admin")) {
			return "redirect:/result";
		}else {
			return "redirect:/login";
		}
		
	}
	
	//URL /register/process
	/*
	 * URL /register/process
	 * register メソッド名
	 * もし、ユーザー名がuserと等しいこと
	 * かつemailの内容がadmin@test.comと等しいこと
	 * かつpasswordの内容がadmin
	 *　/resultに転送してください
	 * そうでない場合 /registerに転送
	 * */
	@PostMapping("/register/process")
	public String register(@RequestParam String username,@RequestParam String email,@RequestParam String password) {
		if(username.equals("user")&&email.equals("admin@test.com")&&password.equals("admin")) {
			return "redirect:/result";
		}else {
			return "redirect:/register";
		}
	}
	

}
