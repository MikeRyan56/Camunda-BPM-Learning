# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/) 

## [Unreleased]

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
