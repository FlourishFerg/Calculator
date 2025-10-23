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

                // Optionally enforce coverage threshold (uncomment if needed)
                // bat 'mvn jacoco:check'

                // Publish HTML report to Jenkins UI
                publishHTML(target: [
                    reportDir: 'target/site/jacoco',
                    reportFiles: 'index.html',
                    reportName: 'JaCoCo Coverage Report'
                ])
            }
        }
    }
}
