#!/usr/bin/env bash

echo
echo "Create topic mysql.psychologydb.predictions"
echo "-------------------------------------"
docker exec -t zookeeper kafka-topics --create --bootstrap-server kafka:9092 --replication-factor 1 --partitions 5 --topic mysql.psychologydb.predictions

echo
echo "Create topic mysql.psychologydb.ratings"
echo "-------------------------------------"
docker exec -t zookeeper kafka-topics --create --bootstrap-server kafka:9092 --replication-factor 1 --partitions 5 --topic mysql.psychologydb.ratings

echo
echo "List topics"
echo "-----------"
docker exec -t zookeeper kafka-topics --list --bootstrap-server kafka:9092