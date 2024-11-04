const express = require('express');
const app = express();

// Middleware
app.use(express.json()); // For parsing JSON request bodies

// Routes
app.get('/', (req, res) => {
  res.send('Welcome to the University Crime Management System backend!');
});

// Example route file (if using a router)
// const userRoutes = require('./routes/userRoutes');
// app.use('/api/users', userRoutes);

// Export the app instance for use in server.js
module.exports = app;