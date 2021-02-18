package in.edac;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/my")
public class MyRestActions {
	
	@Autowired
	UserRepository userRepository;

	
	/**
	 * http://localhost:8080/my/
	 * @return
	 */
	@GetMapping("/")
	public String sayHi() {
		return "Hiiiiii";
	}
	
	
	/**
	 * http://localhost:8080/my/list
	 * @return
	 */
	@GetMapping("/list")
	public List<String> myList() {
		return Arrays.asList("DELHI", "KOLKATA", "CHENNAI", "MUMBAI");
	}
	
	
	/**
	 * http://localhost:8080/my/upload-demo
	 * @return
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@PostMapping("/upload-demo")
	public String fileUploadRestDemo(MultipartFile myfile, String username) throws IllegalStateException, IOException {
		
		System.out.println(myfile);
		// /Users/research/Desktop/storage
		
		myfile.transferTo(new File("/Users/research/Desktop/storage/3.jpg"));
		
		return "File Upload Demo " + username;
	}
	
	
	
	@PostMapping("/upload-demo-v1")
	public String fileUploadRestDemoV1(MultipartFile myfile, String username) throws IllegalStateException, IOException {
		
		long randomNumber = System.currentTimeMillis();
		String storagePath = "/Users/research/Desktop/storage/";
		String desinationPath = storagePath + randomNumber + ".jpg";
		
		myfile.transferTo(new File(desinationPath));
		
		return "File Upload Demo " + username;
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
		
		return "File Upload Demo " ;
	}
	
}
