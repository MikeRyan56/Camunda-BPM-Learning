package org.devsetgo.bpm.camunda.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;


//@Service("bkCreate")
@Configuration
public class makekey {

    static int instanceCounter = 0;
    int counter = 0;

    @Bean
    public String getBK()
    {
        instanceCounter++;
        counter = instanceCounter;
        instanceCounter = counter;
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHH");
        String bk = new String("c-" + sdf.format(new Date()) + "-" + counter);

        return bk;
    }

}
