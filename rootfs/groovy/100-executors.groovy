#!groovy

import jenkins.model.*
import hudson.model.*

// Environnement variables
def env = System.getenv()
// Jenkins instance
def jenkins = Jenkins.getInstance()

// Define the number of executors
if(env.JENKINS_NB_EXECUTORS != null) {
    Jenkins.instance.setNumExecutors(env.JENKINS_NB_EXECUTORS.toInteger())
    jenkins.save()
}

