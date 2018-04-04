package com.lara;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

public class FilterProducer
{
	public static void main(String[] args) 
	{
		DefaultMQProducer producer = new DefaultMQProducer("please_rename_unique_group_name");
		//producer.start();
		//Message msg = new Message("TopicTest",tag,("Hello RocketMQ " + i).getBytes(RemotingHelper.DEFAULT_CHARSET));
		//msg.putUserProperty("a", String.valueOf(i));
		//SendResult sendResult = producer.send(msg);
		producer.shutdown();
	}
	
}
