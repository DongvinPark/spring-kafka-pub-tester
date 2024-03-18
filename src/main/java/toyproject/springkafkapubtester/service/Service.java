package toyproject.springkafkapubtester.service;

import java.util.concurrent.ThreadLocalRandom;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {

  private final KafkaTemplate<String, Object> kafkaTemplate;

  public void sendMessage(String studentId){
    String topic = "subject0";
    
    // 0 ~ 9 중에서 1개 랜덤 선택
    int subjectNo = ThreadLocalRandom.current().nextInt(0, 10);

    topic += subjectNo;

    kafkaTemplate.send(topic, studentId);
  }

}
