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
	          echo 'cloned source code'
				     }
                                   }
    
      stage ('compress to .zip'){
				steps{
					echo '.zip'
				     }
				                        }    
      stage ('deploy') {
				steps {
					echo 'deployed'
				      }
			                  }
   
          
          }
  
           }
}
