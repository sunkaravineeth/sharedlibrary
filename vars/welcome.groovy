def call(int buildNumber) {
  pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                sh 'node --version'
            }
        }
    }
}
}
  
