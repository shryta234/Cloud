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
