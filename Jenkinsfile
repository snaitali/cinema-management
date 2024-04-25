pipeline {
  agent any

  tools {
    maven 'Maven-3.6.3'
  }
  
  stages {
    stage('build') {
      steps {
        echo 'building application ...'
        sh 'mvn -v'
        echo 'building end'
      }
    }
  }
}  
