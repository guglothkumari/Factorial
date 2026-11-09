
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                bat "javac Factorial.java TestFactorial.java"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                bat "java TestFactorial"
            }
        }
        stage('Running') {
            steps {
                echo 'Running...'
                bat "java Factorial"
            }
        }
        stage('Archive') {
            steps {
                echo 'Archiving...'
                bat '"C:/Program Files/Java/jdk-24/bin/jar.exe" cfm factorial.jar Manifest.txt Factorial.class'
            }
        }
        stage('Artifact Upload') {
            steps {
                echo 'Uploading artifact...'
                archiveArtifacts artifacts: 'factorial.jar'
            }
        }
    }
    post {
        success {
            echo 'Pipeline completed successfully.'
        }
        failure {
            echo 'Pipeline failed. Check the logs for details.'
        }
    }
}
