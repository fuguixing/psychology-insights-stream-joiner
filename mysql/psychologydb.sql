CREATE DATABASE IF NOT EXISTS psychologydb;

USE psychologydb;

CREATE TABLE IF NOT EXISTS `predictions` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `created_at` datetime NOT NULL,
    `pred_sopen` varchar(255) NOT NULL,
    `updated_at` datetime NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `ratings` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `rating` varchar(255) NOT NULL,
    `created_at` datetime NOT NULL,
    `updated_at` datetime NOT NULL,
    `prediction_id` bigint(20) NOT NULL,
    PRIMARY KEY (`id`),
    KEY `FK_PREDICTION` (`prediction_id`),
    CONSTRAINT `FK_PREDICTION` FOREIGN KEY (`prediction_id`) REFERENCES `predictions` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;