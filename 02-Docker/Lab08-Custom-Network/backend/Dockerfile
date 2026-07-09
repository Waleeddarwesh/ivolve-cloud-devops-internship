FROM python:3.12-slim

WORKDIR /app

# Copy application source code
COPY . .

# Install Flask
RUN pip install --no-cache-dir flask

# Default environment variables
ENV APP_MODE=production
ENV APP_REGION=canada-west

# Expose application port
EXPOSE 8080

# Run the Flask application
CMD ["python", "app.py"]