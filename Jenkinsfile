pipeline {
  agent any
   parameters {
        choice(
            choices: ['greeting' , 'silence'],
            description: '',
            name: 'REQUESTED_ACTION')
    }

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
          when {
                // Only say hello if a "greeting" is requested
                expression { params.REQUESTED_ACTION == 'greeting' }
            }
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