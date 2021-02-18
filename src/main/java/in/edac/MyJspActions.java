package in.edac;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/my-jsp")
public class MyJspActions {

	@Autowired
	UserRepository userRepository;
	
	/**
	 * http://localhost:8080/my-jsp/
	 * @return
	 */
	@GetMapping("/")
	public String firstJsp() {
		// first.jsp
		// /views/first.jsp
		return "first";
	}
	
	
	/**
	 * http://localhost:8080/my-jsp/second
	 * @return
	 */
	@GetMapping("/second")
	public ModelAndView secondJsp() {
		ModelAndView mv = new ModelAndView("second");
		
		List<User> list =  userRepository.findAll();
		mv.addObject("userList", list);
		
		return mv;
	}
	
	
	@GetMapping("/register")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView("register");
		return mv;
	}
	
	
	
	@PostMapping("/upload-demo-v2")
	public String fileUploadRestDemoV2(MultipartFile myfile, User user) throws IllegalStateException, IOException {
		
		long randomNumber = System.currentTimeMillis();
		String storagePath = "/Users/research/Desktop/storage/";
		String desinationPath = storagePath + randomNumber + ".jpg";
		myfile.transferTo(new File(desinationPath));
		
		user.setProfileImage(randomNumber + ".jpg");

		// db call
		userRepository.save(user);
		
		// IMSRORRY!!!
		// return "forward:/my-jsp/second" ;
		return "redirect:/my-jsp/second" ;
		// return "second"
	}
	
}
