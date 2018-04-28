/**
 * 
 */
package controller.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 *
 */
@RestController
@RequestMapping("/rabbit")
public class RabbitTest {

	@Autowired
	private HelloSender1 helloSender1;
	
	@Autowired
	private HelloSender2 helloSender2;
	
	@Autowired
	private UserSender userSender;
	
	@Autowired
	private TopicSender topicSender;
	
	@Autowired
	private FanoutSender fanoutSender;
	
	@Autowired
	private CallBackSender backSender;
	
	/**
	 * 单生产者-多消费者
	 */
	@GetMapping("/hello")
	public void hello(){
		helloSender1.send();
	}
	
	/**
	 * 单生产者-多消费者
	 */
	@GetMapping("/oneToMany")
	public void oneToMany(){
		for(int i = 0; i < 10; i++){ 
			helloSender1.send("hellosmg: " + i );
		}
	}
	
	/**
	 * 多生产者-多消费者
	 */
	@GetMapping("/manyToMany")
	public void manyToMany(){
		for(int i = 0; i < 10; i++){
			helloSender1.send("hellosmg: " + i);
			helloSender2.send("hellosmg: " + i);
		}
	}
	
	/**
	 * 实体类传输测试
	 */
	@GetMapping("/userTest")
	public void userTest(){
		userSender.send();
	}
	
	/**
	 * topic exchange类型rabbitmq测试
	 */
	@GetMapping("/topicTest")
	public void topicTest(){
		topicSender.send();
	}
	
	/**
	 * fanout exchange类型rabbitmq测试
	 */
	@GetMapping("/fanoutTest")
	public void fanoutTest(){
		fanoutSender.send();
	}
	
	/**
	 * 带callback的消息发送
	 */
	@GetMapping("/callback")
	public void callback(){
		backSender.send();
	}
	
}
