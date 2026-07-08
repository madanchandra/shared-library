def call() {
    stage('Build using Shared library') {
      echo "running maven build from shared Library..."
        sh 'mvn clean package'
    }
}
