
def call(body) {
def config = [:]
body.resolveStrategy = Closure.DELEGATE_FIRST
body.delegate = config
body()
pipeline {
   agent any
   stages{
        stage ('clone source code'){		
				steps{
	          echo 'Appsian cloned source code'
				     }
                                   }
    
      stage ('compress to .zip'){
				steps{
					echo 'Appsian .zip'
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
