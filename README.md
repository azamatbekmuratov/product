# Product Service

Product service. Fetches data from public API of Adidas and from Review service the product review.


## Requirements

1. Docker and docker compose installed
2. Maven is installed
3. Make is installed (Can do without Makefile)
4. Java 11 is installed


## How to run using Makefile

### Build and Run in docker
1. Set in application.yml parameter api.review IP address of Review service host instead of localhost
2. Type in terminal make build-run


## How to use it
### Products with review
ID of products which have review M20324, AC7836, BB5476

<p align="center">
  <img src="https://snipboard.io/jAEDZ5.jpg" alt="Size Limit CLI" width="738">
</p>