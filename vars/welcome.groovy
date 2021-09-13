public Map conf
def call(Map conf) {
  print currentBuild.rawBuild.getCauses().toString
  print conf.skipFort
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
  
