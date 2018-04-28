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
@RabbitListener(queues = "fanout.A")
public class FanoutReceiverA {

	@RabbitHandler
	public void process(String msg){
		System.out.println("FanoutReceiverA : " + msg);
	}
}
