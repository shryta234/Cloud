
def call(body) {
def config = [:]
body.resolveStrategy = Closure.DELEGATE_FIRST
body.delegate = config
body()
pipeline {
   agent any
	environment {
        DISABLE_AUTH = 'qwerty'
        DB_ENGINE    = 'sqlite'
                    }
	parameters {
     	choice choices: config.bType, description: '', name: 'buildType'
      	choice choices: config.buildServer, description: '', name: 'server'
      
    		    }
   stages{
        stage ('clone source code'){		
				steps{
	          			echo 'Appsian cloned source code'
					echo "${DB_ENGINE}"
					echo params.buildType
					
				     }
                                   }
    
      stage ('compress to .zip'){
				steps{
					echo 'Appsian .zip'
					echo "${DISABLE_AUTH}"
				     }
				}    
      stage ('deploy') {
			steps {
				script{
					echo 'Appsian deployed'
					echo 'Downstream job triggering'
					build(job: 'pip3')
				}
			      }
		       }
   
          
          }
  
           }

}
