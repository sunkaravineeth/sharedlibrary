def call(int buildNumber) {
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
  
