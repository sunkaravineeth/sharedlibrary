def call(int buildNumber) {
  if (buildNumber % 2 == 0) {
    pipeline {
      agent any
      stages {
        stage('Even Stage') {
          steps {
            echo "The build number is even dev branch"
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
          }
        }
      }
    }
  }
}


def getNumber(int buildNumber) {
  echo "The build number is ${buildNumber}"
}
  
