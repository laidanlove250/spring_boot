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
public class HelloReceiver2 {

	@RabbitHandler
	public void process(String hello){
		System.out.println("Receiver2 : " + hello);
	}
}
