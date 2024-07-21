# Project Name
Real-Time Vocabulary Quiz
## Description
This project will allow users to answer questions in real-time, compete with others, and see their scores updated live on a leaderboard.

## Table of Contents
- [Document](#Document)
- [Installation](#installation)
- [Usage](#usage)

## Document
Clone the repository to get Design_Document.pdf

## Installation
1. Clone the repository
2. Navigate to the frontend project directory
3. Install dependencies:
    ```bash
    npm install
    ```
4. Start frontend app:
   ```bash
    npm start
    ```
   Open [http://localhost:3000](http://localhost:3000) to view it in your browser.

5. Navigate to backend project directory then run below command to build project image, start up project container along with MongoDB container
    ```bash
    docker compose up
    ```
## Usage
At frontend landing page, to test app
1. Fill in quizid = 111, this was created automatically as dummy data when backend app started up
2. Fill in any userId
3. Open other browsers and repeat above 2 steps for as many users as you want them to join the quiz

