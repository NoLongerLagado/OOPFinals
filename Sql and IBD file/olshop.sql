-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 21, 2023 at 12:02 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `onlineshopping`
--

-- --------------------------------------------------------

--
-- Table structure for table `olshop`
--

CREATE TABLE `olshop` (
  `customerName` varchar(100) NOT NULL,
  `customerAddress` varchar(1000) NOT NULL,
  `mobileNumber` bigint(11) DEFAULT NULL,
  `clothingName` varchar(100) NOT NULL,
  `clothingPrice` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `olshop`
--

INSERT INTO `olshop` (`customerName`, `customerAddress`, `mobileNumber`, `clothingName`, `clothingPrice`) VALUES
('Laurence', 'timbao', 9384590395, 'Jeans', 420),
('Abuan Nelson', 'Timbao', 9123456789, '(SmartPhone) Huawei P60 Pro', 69999),
('Regina', 'Redwood', 9123456789, 'Dress shirt', 800),
('Nico Ampoloqiuo', 'Timbao', 9123456789, 'T-shirt', 390),
('Joanvic', 'Timbao', 9987654321, 'Bodysuits', 290),
('Laurence', 'Timbao', 9384590395, '(Camera) Canon EOS 4000D', 61808),
('Nico Ampo', 'timba', 9987654321, '(SmartPhone) Samsung Galaxy S23 UltraSamsung Galaxy S23 Ultra', 89990);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
