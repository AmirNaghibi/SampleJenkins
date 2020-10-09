pipeline {
    agent any
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

        stage('Counter Stage') {
            steps {
                sh "chmod +x counter.sh"
                sh 'echo "RUNNING COUNTER"'
                sh './counter.sh'
            }
        }

        stage('Publish Stage') {
            steps {
                sh 'echo "PUBLISH TO ARTIFACTORY"'
            }
        }
    }
}