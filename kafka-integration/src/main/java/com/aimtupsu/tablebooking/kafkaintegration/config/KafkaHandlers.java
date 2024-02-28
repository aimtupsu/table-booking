package com.aimtupsu.tablebooking.kafkaintegration.config;

import com.aimtupsu.tablebooking.kafkaintegration.model.OuterKafkaMessageModel;
import com.aimtupsu.tablebooking.kafkaintegration.model.TableBookOrderModel;
import com.aimtupsu.tablebooking.kafkaintegration.service.TableBookOrderTransformService;
import java.util.function.Consumer;
import java.util.function.Function;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaHandlers {

  @Bean
  public Function<OuterKafkaMessageModel, TableBookOrderModel> tableBookOrderIntegrationHandler(
      final TableBookOrderTransformService service
  ) {
    return service::transform;
  }

  @Bean
  public Consumer<String> newMessageStoreHandler() {
    return System.out::println;
  }
}
