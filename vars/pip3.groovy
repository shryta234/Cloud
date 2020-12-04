def call(body) {
def config = [:]
body.resolveStrategy = Closure.DELEGATE_FIRST
body.delegate = config
body()

pipeline {
    agent any
    stages {
        stage('Non-Parallel Stage') {
            steps {
                echo env.JOB_NAME
               
                build(job: 'pip6')
                           
               }
                
            }
   
       
          
    } //stages
} //pipeline
}
