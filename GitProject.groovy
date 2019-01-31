
node ('master') {
  stage('check enviornment') { // Get code
       sh 'echo %PATH%'
  }
  stage('check out code') { // Compile and do unit testing
    sh 'mvn --version'
  }
}
