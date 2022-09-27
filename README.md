# Product Service

Product service. Fetches data from public API of Adidas and from Review service the product review.


## Requirements

1. Docker and docker compose installed
2. Maven is installed
3. Make is installed (Can do without Makefile)
4. Java 11 is installed


## How to run using Makefile

### Build and Run in docker
1. Set in application.yml parameter api.review your IP address instead of localhost
2. Type in terminal make build-run