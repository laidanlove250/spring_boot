/**
 * 
 */
package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 *
 */
@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/hi")
	public String hi(){
		return "hi";
	}
	
	public String helloWord(){
		return "helloWord";
	}
	
}
