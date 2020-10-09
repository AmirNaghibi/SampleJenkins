pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('Build Stage') {
            steps {
                sh 'echo "COMPILING THE CODE"'
                sh 'javac src/main/java/Calculator.java'
                sh '''
                    echo "Multiline shell steps works too"
                    ls -lah
                '''
            }
        }

        stage('Test Stage') {
            steps {
                sh 'echo "UNIT AND INTEGRATION TESTS"'
                sh 'java src/main/java/Calculator'
            }
        }

        stage('Create Artifact Stage') {
            steps {
                sh 'echo "CREATING ARTIFACTS"'
            }
        }

        stage('Publish Stage') {
            steps {
                sh 'echo "PUBLISH TO ARTIFACTORY"'
            }
        }
    }
}