def calla(int buildNumber) {
  if (buildNumber % 2 == 0) {
    pipeline {
      agent any
      stages {
        stage('Even Stage') {
          steps {
            echo "The build number is even main branch"
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
            echo "The build number is odd main branch"
          }
        }
      }
    }
  }
}


def getNumber(int buildNumber) {
  echo "The build number is ${buildNumber}"
}
  
