
pipeline {
    options {
        timeout(time: 5, unit: 'MINUTES')
    }

    parameters {
        string(name: 'USERNAME', defaultValue: 'Amir', description:'Name of the user who is starting the build')
        choice(name: 'CHOICES', choices: ['one', 'two', 'three'], description: 'Choose an option from the selection')
        password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'A secret password')
    }

    environment {
        String OS_NAME = "MACOS"
    }

    agent any

    stages {
        stage('Build Stage') {
            steps {
                echo "COMPILING THE CODE"
                sh 'javac src/main/java/Calculator.java'
                echo "Multiline shell steps works too"
                sh 'ls -lah'
            }
        }

        stage('Test Stage') {
            steps {
                echo "UNIT AND INTEGRATION TESTS"
                sh 'java src/main/java/Calculator'
            }
        }

        stage('Choice Result') {
            steps {
                echo "You chosed ${params.CHOICES}"
                echo "Your password is ${params.PASSWORD}"
                echo "Operating system is ${env.OS_NAME}"
            }
        }

        stage('Create Artifact Stage') {
            steps {
                echo "CREATING ARTIFACTS"
            }
        }

        stage('Counter Stage') {
            steps {
                sh "chmod +x counter.sh"
                echo "RUNNING COUNTER"
                sh './counter.sh'
            }
        }

        stage('Publish Stage') {
            steps {
                echo "PUBLISH TO ARTIFACTORY"
            }
        }
    }
}
