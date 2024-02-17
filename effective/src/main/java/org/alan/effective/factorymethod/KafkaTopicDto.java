package org.alan.effective.factorymethod;

public record KafkaTopicDto(String topicName) {

    public static final KafkaTopicDto COMMITTED_OFFSET = new KafkaTopicDto("__committed_offset__");
}
