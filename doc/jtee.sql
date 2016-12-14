/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.12 : Database - jtee
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`jtee` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `jtee`;

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `uid` varchar(20) NOT NULL,
  `uname` varchar(100) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `job` varchar(50) DEFAULT NULL,
  `hobit` varchar(200) DEFAULT NULL,
  `reg_date` datetime DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `users` */

insert  into `users`(`uid`,`uname`,`age`,`address`,`job`,`hobit`,`reg_date`) values ('U1000000000000000','万里独行',28,'深圳市宝安区新安街道','Java攻城狮','跑步','2016-12-12 17:37:10'),('U1000000000000001','天涯孤客',25,'梅州市梅江区三角镇','顺丰快递员','打麻将','2016-12-13 19:39:19'),('U1000000000000002','风情万种',36,'韶关市205区','以纯销售代表','唱K','2016-12-05 20:41:25'),('U1000000000000003','醉生梦死',28,'广州市海珠区89号','房产销售经理','阅读','2016-12-07 18:33:39');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
