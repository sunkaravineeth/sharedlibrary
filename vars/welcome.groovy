def call(int buildNumber) {
  if (currentBuild.getBuildCauses().toString().contains('BranchIndexingCause')) {
  print "INFO: Build skipped due to trigger being Branch Indexing"
  print currentBuild.getBuildCauses().toString().contains('BranchIndexingCause')
  currentBuild.result = 'ABORTED' // optves a better hint to the user tha's been skipped, rather than the default which shows it's successful
  return
  }
  if (buildNumber % 2 == 0) {
    pipeline {
      agent any
      stages {
        stage('Even Stage') {
          steps {
            echo "The build number is even dev branch"
            script{
              print currentBuild.getBuildCauses().toString()
              print skipBranchIndexing
            }
          }
        }
      }
    }
  } else {
    pipeline {
      agent any
      stages {
        stage('Odd Stage') {
          steps {
            echo "The build number is odd dev branch"
            script{
              print currentBuild.getBuildCauses().toString()
              print skipBranchIndexing
            }
          }
        }
      }
    }
  }
}


def getNumber(int buildNumber) {
  echo "The build number is ${buildNumber}"
}
  
