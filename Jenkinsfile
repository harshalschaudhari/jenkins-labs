@Library('my-shared-lib') _

pipeline {
    agent any

    stages {

        stage('Load Config') {
            steps {
                script {
                    configMap = config()
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    buildApp(configMap)
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    deployApp(configMap)
                }
            }
        }
    }
}