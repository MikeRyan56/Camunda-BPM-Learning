package org.devsetgo.bpm.camunda.learning;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("sendEmail")
public class sendEmail implements JavaDelegate
{
    public void execute(DelegateExecution execution) throws Exception {

        String color = (String) execution.getVariable("FormField_Color");
        String comments = (String) execution.getVariable("comment");
        System.out.println("Hi!\n\n"

                + "Did you know an email could be sent to you?.\n\n"
                + "Your favorite color is: " + color + "\n\n"
                + "Here is what I think: " + comments + "\n\n"
                + "I need to add calling an Ipsum generator here just to be annoying! :-)");
        }
}

