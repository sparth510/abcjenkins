pipeline{
    agent any

    environment{
        REPO_PATH = '~/test'
        APP_NAME = 'test1'
    }
    stages{
        stage('build-deploy'){
            steps{
                function(${REPO_PATH},${APP_NAME})  
            }
        }
    }
}