def call(body) {

  def config = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = config
  body()
  
  
  pipeline {
   agent any
   stages{
        stage ('clone source code'){
            git clone 'https://github.com/shryta234/CloudBees.git'
            bat'del random.txt' 
            bat 'y'
            bat 'dir >> random.txt'
            def name = type random.txt
            if (name == 'CloudBees') { echo 'successfully cloned'}

                                  }
    
      stage ('compress to .zip'){echo '.zip'}
    
      stage ('deploy'){echo 'deploy'}
   
   
   }
  
  }
  
  
  
  
  
  
  
  
  
  
  }
