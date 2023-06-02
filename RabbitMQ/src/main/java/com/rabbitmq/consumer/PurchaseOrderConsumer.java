package com.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.rabbitmq.config.MessagingConfig;
import com.rabbitmq.model.OrderStatus;

@Component
public class PurchaseOrderConsumer {
	
	
	@RabbitListener(queues = "ust_queue")
	public void ConsumeMessageFromQueue(OrderStatus orderStatus)
	{
		System.out.println("Message received from queue : " + orderStatus);
	}

}
