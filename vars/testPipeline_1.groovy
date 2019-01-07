def call(body) {

  def config = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = config
  body()


pipeline {
agent any
environment {
OUTPUT_PATH = './outputs/'
}
stages {
stage ('build') {
...
}
...
}
}
}
