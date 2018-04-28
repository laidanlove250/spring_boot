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
@RabbitListener(queues = "helloQueue")
public class HelloReceiver1 {

	@RabbitHandler
	public void process(String hello){
		System.out.println("Receive1 : " + hello);
	}
}
