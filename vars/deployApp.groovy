def call(config) {
    echo "Deploying ${config.appName} to ${config.deployEnv}"
    
    sh "echo Deploying version ${config.version}"
}