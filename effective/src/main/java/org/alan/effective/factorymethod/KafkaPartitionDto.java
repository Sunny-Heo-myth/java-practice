package org.alan.effective.factorymethod;

public record KafkaPartitionDto(int partitionNumber,
                                int firstOffset,
                                int nextOffset) {

    public static KafkaPartitionDto of(int partitionNumber,
                                       int firstOffset,
                                       int nextOffset) {
        return new KafkaPartitionDto(partitionNumber, firstOffset, nextOffset);
    }
}
