/**
 * 
 */
package controller.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Admin
 *
 */
@Component
public class UserSender {

	@Autowired
	private AmqpTemplate amqpTemplate;
	
	public void send(){
		User user = new User();
		user.setName("hzb");
		user.setPass("123456789");
		System.out.println("user send : " + user.getName() + "/" + user.getPass());
		this.amqpTemplate.convertAndSend("userQueue",user);
	}
}
