pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                bat 'mvn compile'
            }
        }

        stage('Unit Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}
