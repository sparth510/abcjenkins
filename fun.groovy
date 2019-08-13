def call(REPO_PATH,APP_NAME){
    stages{
        stage('deploy'){
            step{
                sh '''
             sh REPO_PATH/APP_NAME/test.sh
            '''
            }
        }
    
    }
}