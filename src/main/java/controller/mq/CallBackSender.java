package controller.mq;

import org.springframework.stereotype.Component;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class CallBackSender implements RabbitTemplate.ConfirmCallback{

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void send(){
		rabbitTemplate.setConfirmCallback(this);
		String msg = "callbackSender: i am callback sender ";
		System.out.println(msg);
		CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
		System.out.println("callbackSender UUID:" + correlationData.getId());
		rabbitTemplate.convertAndSend("exchange","topic.messages",msg,correlationData);
	}

	@Override
	public void confirm(CorrelationData CorrelationData, boolean ack, String cause) {
		System.out.println("callback confirm:" + CorrelationData.getId());
	}
	
	
}
