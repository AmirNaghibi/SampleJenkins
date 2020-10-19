
final String DEFAULT_AGENT_LABEL = "any"

pipeline {
    options {
        timeout(time: 20, unit: 'SECONDS')
    }

    parameters {
        string(name: 'AGENT_LABEL', defaultValue: DEFAULT_AGENT_LABEL, description:'Agent where the build will be tested')
        string(name: 'USERNAME', defaultValue: 'Amir', description:'Name of the user who is starting the build')
        choice(name: 'CHOICES', choices: ['one', 'two', 'three'], description: 'Choose an option from the selection')
        password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'A secret password')
    }

    environment {
        String OS_NAME = "MACOS"
    }

    agent {
        label(params.AGENT_LABEL ? "${params.AGENT_LABEL}" : DEFAULT_AGENT_LABEL)
    }

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