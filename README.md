# Camunda-BPM-Learning
Project to store what I learn about Camunda and use for future base projects.
Camunda BPM Documents (https://docs.camunda.org) - currently built on v7.9

## Todo List
* Document "how to" for examples
* Increase description for more clarity
* Video tutorials (maybe)
* Links to base information needed to start

## Next BPM Items to Work On (contributors welcomed!)
* Call REST Service to fetch data
* Send Email
* Start process example via API
* Explore APIs
* Performance Test
* Signal example
* Extend form validation via JavaScript

## Things in the example

### As of 0.1.4
* Accounts Receivable process with BPMN and DMN file for cost center routing
* Get current user when submitting form or approving
* Use of singleResult for getting 3 outputs from DMN (primary approver, limit, & secondary approver)
* Each step of the process has an embedded HTML form following basic bootstrap design
* Cam-Script to fetch varialbles and display on screen (embedded HTML forms)

### As of 0.1.3
1. simple color picking process
2. color picking uses Call Activity to use a Sub Process (parallel multi instance)
3. Start and Review of Color Picking has an embedded HTML form
4. Sends Email - current: println of email future: will send email (sampleProcess_1.bpmn) and would be like an approval process (after all three approve send to...)
5. A groovy script task (simple array)
6. A DMN that is used in a flow to take a property and use it to set another property
7. Dockerfile to build an image


## How to use
* Clone and build via Maven
* Run via .jar or pull via Docker Hub (mikeryan56/learning-camunda)
* Log in is UserName: admin and Password: rules





