package kz.study.demographql.config;

import kz.study.demographql.model.Event;
import org.reactivestreams.Publisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.MessageChannels;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.util.concurrent.atomic.AtomicLong;

//@Configuration
public class PublisherConfig {
//    private static final AtomicLong generator = new AtomicLong(0);
//
//    @Bean
//    public Publisher<Message<Event>> httpReactiveSource() {
//        return IntegrationFlow.
//                fromSupplier(() -> MessageBuilder.withPayload(
//                                new Event(generator.incrementAndGet(),
//                                        "payload: " + generator.get())
//                        ).build(),
//                        //e -> e.reactive(flux -> flux.(Schedulers.parallel())).id("reactiveTransformer")
//                        s -> s.poller((p -> p.fixedRate(3000L))))
//                .channel(MessageChannels.queue())
//                .toReactivePublisher();
//    }
}
