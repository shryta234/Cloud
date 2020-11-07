
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
   stages{
        stage ('clone source code'){		
				steps{
	          echo 'Appsian cloned source code'
		 echo "${DB_ENGINE}"
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
				echo 'Appsian deployed'
			      }
		       }
   
          
          }
  
           }

}
