import requests
import time

def make_request(url):
    response = requests.get(url)
    if response.status_code == 200:
        # Process the response data
        print(response.json())
    elif response.status_code == 429:
        # Rate limit exceeded, wait and retry
        retry_after = int(response.headers.get('Retry-After', 1))
        print(f"Rate limit exceeded. Retrying after {retry_after} seconds...")
        time.sleep(retry_after)
        make_request(url)
    else:
        # Handle other response codes
        print(f"Error: {response.status_code}")

# URL to be accessed
url = "http://localhost:8084/users"

# Number of iterations
num_iterations = 40

for i in range(num_iterations):
	print("API Request: %s", i)
    make_request(url)
