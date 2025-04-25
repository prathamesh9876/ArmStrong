pipeline {
    agent any

    tools {
        jdk 'jdk21'
    }

    stages {
        stage('Compile') {
            steps {
                bat 'javac src\\ArmstrongNumbers.java'
            }
        }
        stage('Run') {
            steps {
                bat 'java -cp src ArmstrongNumbers'
            }
        }
    }
}
