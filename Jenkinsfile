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

        stage('Code Coverage') {
            steps {
                // Generate JaCoCo coverage report
                bat 'mvn jacoco:report'

                // Optionally enforce coverage threshold
                // bat 'mvn jacoco:check'

                // Publish HTML report to Jenkins UI
                publishHTML(target: [
                    reportDir: 'target/site/jacoco',
                    reportFiles: 'index.html',
                    reportName: 'JaCoCo Coverage Report'
                ])
            }
        }

        stage('Static Code Analysis') {
            steps {
                // Run Checkstyle analysis
                bat 'mvn checkstyle:check'

                // Publish Checkstyle HTML report
                publishHTML(target: [
                    reportDir: 'target/site',
                    reportFiles: 'checkstyle.html',
                    reportName: 'Checkstyle Report'
                ])
            }
        }
    }
}
