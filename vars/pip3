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
