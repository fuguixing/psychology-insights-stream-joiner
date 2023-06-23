<p align="center">
  <a href="https://spring.io/projects/spring-boot"><img src="https://img.shields.io/badge/Java%20Spring%20Boot-3.0.7-brightgreen.svg" alt="Java Spring Boot"></a>
  <a href="https://ksqldb.io/"><img src="https://img.shields.io/badge/KSQLDB-7.3.1-red.svg" alt="KSQLDB"></a>
</p>

# Psychology Insights Stream Joiner

## Prerequisites

Before running the StreamJoiner service, please ensure that you have set up the following:

- The [Psychology Insights KSQL Infrastructure](https://github.com/fuguixing/psychology-insights-ksql-infra) repository.
- Execute the necessary steps in the [Psychology Insights KSQL Infrastructure README](https://github.com/fuguixing/psychology-insights-ksql-infra/blob/main/README.md) to set up the infrastructure.
- Set up database and tables
    ```bash
    docker exec -i mysql mysql -u root -psecret < mysql/psychologydb.sql
    ```
- Create Kafka Topics, Run the script `create-kafka-topics.sh`
- Create the necessary connectors by using the JSON files provided in the `connectors` folder.
    ```bash
    curl -i -X POST localhost:8083/connectors -H 'Content-Type: application/json' -d @connectors/debezium-mysql-source-psychologydb.json
    curl -i -X POST localhost:8083/connectors -H 'Content-Type: application/json' -d @connectors/elasticsearch-sink-predictions.json
    curl -i -X POST localhost:8083/connectors -H 'Content-Type: application/json' -d @connectors/elasticsearch-sink-ratings.json
    ```
- Produce some data
    ```bash
    docker exec -i mysql mysql -u root -psecret < mysql/data.sql
    ```  
- Create the stream using the `ratings-predictions.ksql` file in the `ksql` folder to process the ratings and predictions data.

    ```bash
    docker run -it --rm --name ksqldb-cli \
    --network psychology-insights-ksql-infra_default \
    -v $PWD/ksql/ratings-predictions.ksql:/tmp/ratings-predictions.ksql \
    confluentinc/cp-ksqldb-cli:7.3.1 http://ksqldb-server:8088
    ```
    ```bash
    RUN SCRIPT '/tmp/ratings-predictions.ksql';
    ```    
    ```bash
    DESCRIBE "ratings_predictions";
    SELECT * FROM "ratings_predictions" EMIT CHANGES LIMIT 5;
    ```     
  
- Once the above steps are completed, you can run the StreamJoiner service.

## Usage

To run the StreamJoiner service and perform the JOIN operation between the `predictions` and `ratings` stream in kafka, follow these steps:

1. Clone this repository: `git clone https://github.com/fuguixing/psychology-insights-stream-joiner.git`
2. Navigate to the project directory: `cd psychology-insights-stream-joiner`
3. Configure the necessary properties in the `application.yml` file.
4. Build and run the application: `mvn spring-boot:run`

The StreamJoiner service will consume the `ratings_predictions` streams, generating the final ratings `joined_ratings `, and write them to Elasticsearch.

### Get all indices

```bash
curl "localhost:9200/_cat/indices?v"
```   
## Contributing

We welcome contributions to enhance the functionality and user experience of the Psychology Insights frontend. If you'd like to contribute, please follow these guidelines:

- Fork the repository and create a new branch for your feature or bug fix.
- Commit your changes and push your branch to your forked repository.
- Submit a pull request, describing your changes in detail.

## License

This project is licensed under the [MIT License](LICENSE).