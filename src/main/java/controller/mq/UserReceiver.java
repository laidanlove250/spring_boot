/**
 * 
 */
package controller.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Admin
 *
 */
@Component
@RabbitListener(queues = "userQueue")
public class UserReceiver {

	@RabbitHandler
	public void process(User user){
		System.out.println("user receive : " + user.getName() + "/" + user.getPass());
	}
}
