def call(body) {

  def config = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = config
  body()

pipeline {
agent any

stages {
  stage ('build') {
    
    input{
          message "Press Ok to continue"
          submitter "user1,user2"
          parameters {
          string(name:'username', defaultValue: 'user', description: 'Username of the user pressing Ok')
          }
          }
                    steps { 
                    echo "User: ${user} said Ok."
                    }
  }
    
    stage ('completed'){
      
      steps{
        echo "BYE!"
      }
    }
}
}

}
