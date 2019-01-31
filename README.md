# JenkinsJobsBuilder
Contains  JJB scripts that can be used to configure jenkins pipeline

Instruction - 

1) pip install jenkins-job-builder   --THis is the location where it gets installed C:\Python27\Lib\site-packages\jenkins_jobs 
2) create jenkins_jobs.ini -- check /Anup Mehta/Technical/Jenkins 
3) create jobs folder and  add test.yaml
4) run command in JenkinsJobsBuilder folder -- > jenkins-jobs --conf ..\jenkins_jobs.ini update Job
5) I have manually copied the GitProject.groovy to location C:\Users\xxxx\.jenkins\workspace\JJB_dsl_conf_job to ensure the script gets the groovy file 
6) Install delivery plugin

