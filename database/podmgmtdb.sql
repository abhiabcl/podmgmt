-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.34-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema podmgmtdb;
--



CREATE DATABASE IF NOT EXISTS podmgmtdb;

GRANT ALL ON `podmgmtdb`.* TO 'podmgmt'@'localhost' IDENTIFIED BY 'podmgmt';

USE podmgmtdb;

--
-- Definition of table `catalog`
--

DROP TABLE IF EXISTS `catalog`;
CREATE TABLE `catalog` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `catalogID` varchar(255) DEFAULT NULL,
  `catalogName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `catalogID` (`catalogID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Definition of table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `productID` varchar(255) DEFAULT NULL,
  `catalogID` varchar(255) DEFAULT NULL,
  `productName` varchar(255) DEFAULT NULL,
  `productMrfDate` varchar(255) DEFAULT NULL,
  `productExpDate` varchar(255) DEFAULT NULL,
  `productBatchNumber` varchar(255) DEFAULT NULL,
  `productPrice` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `productID` (`productID`,`catalogID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--
-- Definition of table `customerReference`
--

DROP TABLE IF EXISTS `customerReference`;
CREATE TABLE `customerReference` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `customerID` varchar(255) DEFAULT NULL,
  `customerName` varchar(255) DEFAULT NULL,
  `customerAddress` varchar(255) DEFAULT NULL,
  `customerMobile` varchar(255) DEFAULT NULL,
  `customerEmail` varchar(255) DEFAULT NULL,
  `customerCity` varchar(255) DEFAULT NULL,
  `customerState` varchar(255) DEFAULT NULL,
  `customerCountry` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `customerID` (`customerID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--
-- Definition of table `purchaseOrder`
--

DROP TABLE IF EXISTS `purchaseOrder`;
CREATE TABLE `purchaseOrder` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `purchaseID` varchar(255) DEFAULT NULL,
  `productID` varchar(255) DEFAULT NULL,
  `customerID` varchar(255) DEFAULT NULL,
  `productQty` varchar(255) DEFAULT NULL,
  `totalPrice` varchar(255) DEFAULT NULL,
  `paymentMode` varchar(255) DEFAULT NULL,
  `paymentStatus` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `purchaseID` (`customerID`, `purchaseID`, `productID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--
-- Definition of table `inventroy`
--

DROP TABLE IF EXISTS `inventroy`;
CREATE TABLE `inventroy` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `productID` varchar(255) DEFAULT NULL,
  `productQty` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `inventroy` (`productID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Definition of table `inventroy`
--

DROP TABLE IF EXISTS `podmgmtuser`;
CREATE TABLE `podmgmtuser` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `userid` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `lastlogin` varchar(255) DEFAULT NULL,
  `mobileno` varchar(10) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `userid` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



