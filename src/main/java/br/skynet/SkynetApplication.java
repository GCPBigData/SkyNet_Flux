package br.skynet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.blockhound.BlockHound;

@SpringBootApplication
public class SkynetApplication {

    static {
        BlockHound.install(
            builder -> builder.allowBlockingCallsInside("java.util.UUID", "randomUUID")
                .allowBlockingCallsInside("java.io.FilterInputStream", "read")
                .allowBlockingCallsInside("java.io.InputStream", "readNBytes")
        );
    }

    public static void main(String[] args) {
        SpringApplication.run(SkynetApplication.class, args);
    }

}
