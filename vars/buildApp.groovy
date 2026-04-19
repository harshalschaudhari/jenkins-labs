def call(config) {
    echo "Building ${config.appName} using ${config.buildTool}"
    
    if (config.buildTool == "maven") {
        sh "mvn clean package"
    } else if (config.buildTool == "npm") {
        sh "npm install && npm run build"
    }
}