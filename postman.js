const express = require('express');
const app = express();
const PORT = 3007;

app.use(express.json());

// Sample GET endpoint
app.get('/api/hello', (req, res) => {
  res.json({ message: 'Hello, world!' });
});

// Sample POST endpoint
app.post('/api/post', (req, res) => {
  const data = req.body;  // Make sure body-parser is enabled
  res.json({ message: 'post', data });
});


app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});