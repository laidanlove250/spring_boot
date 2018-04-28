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
@RabbitListener(queues = "fanout.B")
public class FanoutReceiverB {

	@RabbitHandler
	public void process(String msg){
		System.out.println("FanoutReceiverB : " + msg);
	}
}
