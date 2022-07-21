-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 21, 2022 at 12:40 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospitalfinder`
--

-- --------------------------------------------------------

--
-- Table structure for table `healreport`
--

CREATE TABLE `healreport` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `coordinate` varchar(255) NOT NULL,
  `location` varchar(255) NOT NULL,
  `ip_address` varchar(64) NOT NULL,
  `date` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `healreport`
--

INSERT INTO `healreport` (`id`, `name`, `coordinate`, `location`, `ip_address`, `date`) VALUES
(10, 'Haziq Anuar', '6.1, 100', 'Alor Setar, Kedah', '192.168.0.103', '2022-07-18 11:00:49'),
(11, 'Izzat Hakim', '6.4, 102', 'Sanglang, Kedah', '192.168.0.103', '2022-07-18 11:07:11'),
(12, 'Ezzatul', '5.4, 100', 'Pulau Pinang', '192.168.0.103', '2022-07-18 11:17:44'),
(13, 'Hakimie Azraei', '6.4, 100', 'Changlun, Kedah', '192.168.0.103', '2022-07-18 11:45:06'),
(14, 'Mas Alya', '6.45, 100', 'Uitm Arau, Perlis', '192.168.0.103', '2022-07-18 11:49:22'),
(15, 'Irfan Hafizi', '5.3,100', 'Pulau Pinang', '192.168.0.103', '2022-07-18 16:00:23'),
(16, 'Nuqman', '5.8, 100', 'Seberang Jaya', '192.168.0.103', '2022-07-18 16:09:20'),
(17, 'Muhd Hakimie', '6.26, 100', 'Jitra', '192.168.0.103', '2022-07-18 18:55:28'),
(19, 'Mas Alya', '6.4, 100', 'Jitra, Kedah', '192.168.0.103', '2022-07-20 15:28:41'),
(20, 'Hakimie', '6.4, 100', 'Uitm Arau', '192.168.0.103', '2022-07-20 16:01:09');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `healreport`
--
ALTER TABLE `healreport`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `healreport`
--
ALTER TABLE `healreport`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
