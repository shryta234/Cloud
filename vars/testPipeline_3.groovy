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
					
			    //git  'https://github.com/shryta234/CloudBees.git'
			   //bat'del random.txt' 
			   // bat 'y'
			    bat 'dir >> random.txt'
			    bat 'type random.txt'
					script {
					  def name = type random.txt
					   if (name == 'Jenkinsfile') { 
						   echo 'successfully cloned'
					   			    }
					       }
				     }
                                   }
    
      stage ('compress to .zip'){
				steps{
					echo '.zip'
				     }
				}
    
      stage ('deploy') {
				steps {
					echo 'deploy'
				      }
			}
   
   }
  
  }
  
  
    
  }
