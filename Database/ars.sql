/*
SQLyog Community v10.11 
MySQL - 5.1.73-community : Database - ars
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ars` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `ars`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `admin_id` int(10) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(20) NOT NULL,
  `admin_password` varchar(10) NOT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `admin` */

insert  into `admin`(`admin_id`,`admin_name`,`admin_password`) values (1,'tayyab','password');

/*Table structure for table `airbus` */

DROP TABLE IF EXISTS `airbus`;

CREATE TABLE `airbus` (
  `airbus_no` int(11) NOT NULL AUTO_INCREMENT,
  `economy_capacity` int(11) NOT NULL,
  `first_capacity` int(11) NOT NULL,
  PRIMARY KEY (`airbus_no`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `airbus` */

insert  into `airbus`(`airbus_no`,`economy_capacity`,`first_capacity`) values (2,4,5);

/*Table structure for table `booked_seats` */

DROP TABLE IF EXISTS `booked_seats`;

CREATE TABLE `booked_seats` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `flight_no` int(11) DEFAULT NULL,
  `seat` varchar(10) DEFAULT NULL,
  `pas_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `bookedseats_flightid_fk` (`flight_no`),
  CONSTRAINT `booked_flightno_fk` FOREIGN KEY (`flight_no`) REFERENCES `flight_schedule` (`flight_no`) ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `booked_seats` */

/*Table structure for table `cancelation_detail` */

DROP TABLE IF EXISTS `cancelation_detail`;

CREATE TABLE `cancelation_detail` (
  `pas_id` int(10) DEFAULT NULL,
  `pas_tno` varchar(50) NOT NULL,
  `flight_no` int(10) NOT NULL,
  `seat_no` int(10) NOT NULL,
  `cancel_date` date NOT NULL,
  `cancel_charge` decimal(10,0) NOT NULL,
  KEY `cancelation_detail_pas_id_fk` (`pas_id`),
  CONSTRAINT `cancelation_detail_pas_id_fk` FOREIGN KEY (`pas_id`) REFERENCES `traveler_detail` (`pas_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cancelation_detail` */

/*Table structure for table `city` */

DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `city` */

insert  into `city`(`id`,`name`) values (1,'Lahore'),(2,'Karachi'),(3,'Peshawar');

/*Table structure for table `deptured_filghts` */

DROP TABLE IF EXISTS `deptured_filghts`;

CREATE TABLE `deptured_filghts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `airbus_no` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `pas_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `departured_airbusno_fk` (`airbus_no`),
  KEY `departured_pasid_fk` (`pas_id`),
  CONSTRAINT `departured_airbusno_fk` FOREIGN KEY (`airbus_no`) REFERENCES `airbus` (`airbus_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `departured_pasid_fk` FOREIGN KEY (`pas_id`) REFERENCES `traveler_detail` (`pas_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `deptured_filghts` */

/*Table structure for table `flight_schedule` */

DROP TABLE IF EXISTS `flight_schedule`;

CREATE TABLE `flight_schedule` (
  `flight_no` int(11) NOT NULL AUTO_INCREMENT,
  `airbus_no` int(11) NOT NULL,
  `departure_date` date NOT NULL,
  `time` time NOT NULL,
  `from_id` int(11) NOT NULL,
  `to_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`flight_no`),
  KEY `schedule_aibus_fk` (`airbus_no`),
  KEY `schedule_fromid_fk` (`from_id`),
  KEY `schedule_toid_fk` (`to_id`),
  CONSTRAINT `schedule_aibus_fk` FOREIGN KEY (`airbus_no`) REFERENCES `airbus` (`airbus_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `schedule_fromid_fk` FOREIGN KEY (`from_id`) REFERENCES `city` (`id`),
  CONSTRAINT `schedule_toid_fk` FOREIGN KEY (`to_id`) REFERENCES `city` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `flight_schedule` */

/*Table structure for table `price` */

DROP TABLE IF EXISTS `price`;

CREATE TABLE `price` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `from_id` int(11) NOT NULL,
  `to_id` int(11) NOT NULL,
  `fare` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `price_fromid_fk` (`from_id`),
  KEY `price_toid_fk` (`to_id`),
  CONSTRAINT `price_fromid_fk` FOREIGN KEY (`from_id`) REFERENCES `city` (`id`) ON UPDATE NO ACTION,
  CONSTRAINT `price_toid_fk` FOREIGN KEY (`to_id`) REFERENCES `city` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `price` */

/*Table structure for table `traveler_detail` */

DROP TABLE IF EXISTS `traveler_detail`;

CREATE TABLE `traveler_detail` (
  `pas_id` int(10) NOT NULL AUTO_INCREMENT,
  `pas_name` varchar(50) NOT NULL,
  `pas_city` varchar(50) NOT NULL,
  `pas_tno` varchar(50) NOT NULL,
  `pas_email` varchar(50) NOT NULL,
  PRIMARY KEY (`pas_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `traveler_detail` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
