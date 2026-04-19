def call() {

    def configMap = config()

    pipeline {
        agent any

        stages {

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
}
