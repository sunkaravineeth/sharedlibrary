
def call(Map config) {
  if (currentBuild.getBuildCauses().toString().contains('BranchIndexingCause')) {
  print "INFO: Build skipped due to trigger being Branch Indexing"
  currentBuild.result = 'ABORTED' // optves a better hint to the user tha's been skipped, rather than the default which shows it's successful
  return
  }
  pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                echo 'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'
            }
        }
    }
}
}
  
