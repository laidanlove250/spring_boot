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
@RabbitListener(queues = "topic.message")
public class TopicMessageReceiver {

	@RabbitHandler
	public void process(String msg){
		System.out.println("topicMessageReceiver" + msg);
	}
}
