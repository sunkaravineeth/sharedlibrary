public Map conf
def call(Map conf) {
  if (currentBuild.getBuildCauses().toString().contains('BranchIndexingCause')) {
  print "INFO: Build skipped due to trigger being Branch Indexing"
  currentBuild.result = 'ABORTED' // optves a better hint to the user that it's been skipped, rather than the default which shows it's successful
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
  
