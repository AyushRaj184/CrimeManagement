const express = require("express");
const dotenv = require("dotenv");
const connectDB = require("./config/db");
const colors=require("colors");

dotenv.config();
connectDB();

const app = express();
app.use(express.json());

app.get("/", (req, res) => {
  res.send("API is running successfully");
});

const PORT = process.env.PORT || 5000;
app.listen(parseInt(PORT, 10), () => console.log(`Server started on ${PORT}`.yellow.bold));



