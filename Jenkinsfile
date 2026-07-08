@Library('my-shared-lib') _

pipeline {
    agent any

    tools {
        maven 'maven3.9.12'    // Use the Maven tool installed earlier
        jdk 'java21'           // Use JDK 21
    }

    stages {

        stage('Checkout') {
            steps {
                // Checkout the project from the 'mahesh' branch in your GitHub repository
                git branch: 'main', url: 'https://github.com/madanchandra/chatgpt-demo.git'
            }
        }

        stage('Build') {
            steps {
                mavenBuild()    // Calling shared library function
            }
        }

        stage('Post-Build') {
            steps {
                echo "Build completed successfully."
            }
        }
    }
}
