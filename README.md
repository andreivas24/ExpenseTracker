# Expense Tracker App

## Overview

The **Expense Tracker App** is a web-based application designed to help users monitor their incomes and expenses. It provides detailed insights into financial activities using **Chart.js** to display data in an easy-to-understand graphical format.

### Key Features:
- Track both incomes and expenses
- Categorize transactions (e.g., Groceries, Health, Education, etc.)
- Visualize spending patterns with interactive graphs and charts
- User-friendly interface built with **Zorro UI** components
- Secure and scalable backend with **MySQL** database

## Technologies Used

- **Frontend:** Angular with [Ng Zorro UI Library](https://ng.ant.design/)
- **Backend:** Spring Boot
- **Database:** MySQL
- **Graphs:** Chart.js

## Project Structure

- **Frontend:** Developed using Angular with modular architecture.
- **Backend:** A RESTful API built with Spring Boot for handling server-side logic.
- **Database:** MySQL for storing user information, transactions, and category data.

## Getting Started

### Prerequisites
Before you begin, ensure you have met the following requirements:
- You have installed [Node.js](https://nodejs.org/) and [Angular CLI](https://angular.io/cli).
- You have installed MySQL for database management.

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/expense-tracker.git
   cd expense-tracker

2. Install dependencies for both frontend and backend:
   ```bash
   npm install
3. Set up the MySQL database:
   ```bash
   DB_HOST=localhost
   DB_USER=root
   DB_PASS=yourpassword
   DB_NAME=expense_tracker_db

4. Configure environment variables for the backend in backend/.env:
   - Create a new database expense_tracker_db.
   - Run the SQL scripts provided in /database/setup.sql to create the necessary tables.
   
5. Start the development server:
   ```bash
   ng serve
   
6. Navigate to http://localhost:4200 to see the application in action.
