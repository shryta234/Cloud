def call(body) {

  def config = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = config
  body()

pipeline {
agent any
  parameters {
                    string(name:'user', defaultValue: 'John', description: 'Username of the user pressing Ok')
                    }
stages {
  stage ('build') {
                    steps { 
                    echo "User: ${user} said Ok."
                    }
    
    stage ('completed'){
      
      steps{
        echo "BYE!"
      }
    }
}
}
}

}
