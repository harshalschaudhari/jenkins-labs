def call(config) {
    echo "Building ${config.appName} using ${config.buildTool}"
    
    if (config.buildTool == "maven") {
         echo  "mvn clean package"
    } else if (config.buildTool == "npm") {
         echo  "npm install && npm run build"
    }
}
