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
@RabbitListener(queues = "topic.messages")
public class TopicMessagesReceiver {

	@RabbitHandler
	public void process(String msg){
		System.out.println("topicMessagesReceiver" + msg);
	}
}