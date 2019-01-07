

pipeline {
agent any
environment {
OUTPUT_PATH = './outputs/'
}
stages {
stage ('build') {
  steps{
sh 'echo "hi"'
  }
                }

      }
}

