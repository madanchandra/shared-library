@Library('my-shared-lib') _

pipeline {
    agent any
    tools {
        maven 'Maven-3.9.12'
        jdk 'java21'
    }
    stages {
        stage ('Checkout') {
            steps {
                git branch : 'main', url : 'https://github.com/madanchandra/shared-library.git'
            }
        }
        stage ('Build') {
            steps {
                mavenBuild()
            }
        }
        stage ('post_build') {
            steps {
                echo "build completed successfully"
            }
        }
    }
}
