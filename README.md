# Camunda-BPM-Learning
Project to store what I learn about Camunda and use for future base projects.
Camunda BPM Documents (https://docs.camunda.org)

Things in the example

As of 0.1.3
1. simple color picking process
2. color picking uses Call Activity to use a Sub Process (parallel multi instance)
3. Start and Review of Color Picking has an embedded HTML form
4. Sends Email - current: println of email future: will send email (sampleProcess_1.bpmn) and would be like an approval process (after all three approve send to...)
5. A groovy script task (simple array)
6. A DMN that is used in a flow to take a property and use it to set another property
7. Dockerfile to build an image



##How to use
* Clone and build via Maven
* Run via .jar or pull via Docker Hub (mikeryan56/learning-camunda)
* Log in is UserName: Admin and Password: Rules





