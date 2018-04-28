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
public class FanoutSender {

	@Autowired
	private AmqpTemplate amqpTemplate;
	
	public void send(){
		String msgString = "fanoutSender : hello i am hzb";
		System.out.println(msgString);
		amqpTemplate.convertAndSend("fanoutExchange","abcd.ee",msgString);
	}
}
