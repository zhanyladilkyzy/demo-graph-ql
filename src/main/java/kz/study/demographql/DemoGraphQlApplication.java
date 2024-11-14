package kz.study.demographql;

import kz.study.demographql.model.Event;
import org.reactivestreams.Publisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.graphql.data.method.annotation.SubscriptionMapping;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.ConnectableFlux;
import reactor.core.publisher.Flux;

@SpringBootApplication
@Controller
public class DemoGraphQlApplication {

    private final ConnectableFlux<Event> publisher;
    public static void main(String[] args) {
        SpringApplication.run(DemoGraphQlApplication.class, args);
    }

    public DemoGraphQlApplication(Publisher<Message<Event>> source) {
        this.publisher = Flux.from(source)
                .map(Message::getPayload)
                .publish();
        this.publisher.connect();
    }


    @SubscriptionMapping
    public Flux<Event> onNewEvent() {
        return this.publisher;
    }
}
