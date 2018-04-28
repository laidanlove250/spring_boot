/**
 * 
 */
package controller.mq;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Admin
 *
 */
@Component
public class HelloSender2 {

	@Autowired
	private AmqpTemplate amqpTemplate;
	
	public void send(String msg){
		String sendMsg = msg + 	new Date();
		System.out.println("Sender2 : " + sendMsg);
		amqpTemplate.convertAndSend("helloQueue",sendMsg);
	}
}
