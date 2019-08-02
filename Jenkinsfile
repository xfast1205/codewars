pipeline {
  agent any
  stages {
    stage('Install') {
      parallel {
        stage('Install') {
          steps {
            sh '''ls -la
'''
          }
        }
        stage('Reinstall') {
          steps {
            sh 'echo "hello"'
          }
        }
      }
    }
    stage('third stage') {
      steps {
        sh 'echo "test"'
      }
    }
  }
}