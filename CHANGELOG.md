# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/) 

## Todo
- Document Process (blog entry)


## [Unreleased]
- None
## [0.1.4.6] - 2019-05-26
### Updated
- Incremental changes to version of dependencis in POM


## [0.1.4.5] - 2019-12-11
### Added
- Added Spring Actuator
- Enabled all endpoints at /actuator-endpoint
- Pushed new docker container 
- Updating to Camunda 7.10.0 and SpringBoot Starter 3.2.0
- Update of BPMN processes to use the new [Tasklist-startable Process Definitions](https://docs.camunda.org/manual/7.10/user-guide/process-engine/process-engine-concepts/#start-process-instances-via-tasklist) to prevent processes that should not be the start to be exposed to the WebApp UI


### Changed
- Nothing

## [0.1.4] - 2018-09-04
### Added
- Directory to store Cost Center Approval process (CCA)
- CCA-x HTML forms for all user tasks
- Standardizing all naming of HTML files
- HTML forms for all steps and use cam-script to fetch variables
- Using basic bootstrap UI controls
- Added Account Receivable process for approval with BPMN and DMN files.
- Will route based off of cost center
- Adding application-dev (not committing to learning sample) and application-sample.properties files. 

### Changed
- application.properties to use only "general" configuration
### Removed

## [0.1.3] - 2018-06-24
### Added
- Dockerfile to build image and pushed to docker hub (https://hub.docker.com/r/mikeryan56/learning-camunda/)
- Commented out setting in application.yml and application.properties

### Changed
- added static/forms directory under resources to serve embedded forms (seems to only work this way)

### Removed
- webapp and webapp/forms directory as SpringBoot doesn't add this to deployment
- a major headache figuring out how to server the embedded forms!

## [0.1.2] - 2018-06-23
### Added
- Added multi instance (parallel) Call Activity
- Call Activity will create 3 sub processes (call_activity_sub.bpmn)
- Added simple Groovy Script Task to set cars array for use as collection in Call Activity
- Added Element Documention to each step in sampleProcess_1.bpmn
- Added Element Documention to each step in call_activity_sub.bpmn

### Changed
- increment of version
- Removed white space in textarea tags in HTML forms
- minor changes to flow for better visual appeal

### Removed
- removed condition type for expression language ${FormField_Color=="Blue"} so it acts as default path
- loop cardinality in Call Activity not needed in this scenerio

## [0.1.1] - 2018-06-17
### Added
- Adding simple enum example (learning)

### Changed
- increment of version

## [0.1.0] - 2018-06-17
### Added
- Nothing

### Changed
- Increment of pom to 0.1.0
- Fix of defect in call_activity_sub.bpm myResponse property that prevent flow from moving foward

### Removed
- Nothing, since it is an initial commit

## [0.0.1] - 2018-06-16
### Added
- initial commit
- Color picking process that uses Call Activity to use Sub Process
- Start and Review embedded HTML forms
- Application.yml adds basic configuration settings to add Admin and setup basic settings
- Adding this changelog

### Changed
- Nothing, since it is an initial commit

### Removed
- Nothing, since it is an initial commit
