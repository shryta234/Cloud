pipeline { 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
               echo 'This is a minimal pipeline.' 
               bat 'type notepad.txt'
            }
        }
    }
}
