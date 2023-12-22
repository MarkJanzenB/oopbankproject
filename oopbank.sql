-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 15, 2023 at 02:38 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `oopbank`
--

-- --------------------------------------------------------

--
-- Table structure for table `transactions`
--

CREATE TABLE `transactions` (
  `transID` int(11) NOT NULL,
  `transDate` date NOT NULL,
  `transAmt` double NOT NULL,
  `transType` varchar(200) NOT NULL,
  `transDesc` varchar(200) NOT NULL,
  `UID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transactions`
--

INSERT INTO `transactions` (`transID`, `transDate`, `transAmt`, `transType`, `transDesc`, `UID`) VALUES
(1, '2023-12-15', 50, 'SEND', 'Money sent to UID: 1004', 1003),
(2, '2023-12-15', 50, 'SEND', 'Money sent to UID: 1003', 1004),
(3, '2023-12-15', 100, 'SEND', 'Money sent to UID: 1003', 1004),
(4, '2023-12-15', 100, 'SEND', 'Money sent to UID: 1004', 1004),
(5, '2023-12-15', 50, 'SEND', 'Money sent to UID: 1003', 1004),
(6, '2023-12-15', 50, 'SEND', 'Money sent to UID: 1004', 1003),
(7, '2023-12-15', 50, 'SEND', 'Money sent to UID: 1003', 1004),
(8, '2023-12-15', 100, 'SEND', 'Money sent to UID: 1004', 1003),
(9, '2023-12-15', 50, 'SEND', 'Money sent to UID: 1004', 1003),
(10, '2023-12-15', 50, 'SEND', 'Money sent to UID: 1003', 1004),
(11, '2023-12-15', 50, 'SEND', 'Money sent to UID: 1004', 1003),
(12, '2023-12-15', 50, 'SEND', 'Money sent to UID: 1004', 1003),
(13, '2023-12-15', 50, 'SEND', 'Money sent to UID: 1003', 1004),
(14, '2023-12-15', 50, 'SEND', 'Money sent to UID: 1003', 1004),
(15, '2023-12-15', 50, 'SEND', 'Money sent to UID: 1004', 1003),
(16, '2023-12-15', 100, 'SEND', 'Money sent to UID: 1003', 1004),
(17, '2023-12-15', 50, 'SEND', 'Money sent to UID: 1004', 1003),
(18, '2023-12-15', 50, 'SEND', 'Money sent to UID: 1004', 1003),
(19, '2023-12-15', 100, 'SEND', 'Money sent to UID: 1004', 1003),
(20, '2023-12-15', 150, 'SEND', 'Money sent to UID: 1003', 1004),
(21, '2023-12-15', 50, 'SEND', 'Money sent to UID: 1004', 1003),
(22, '2023-12-15', 5000, 'SEND', 'Money sent to UID: 1004', 1003);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `UID` int(11) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `address` varchar(200) NOT NULL,
  `phone_num` varchar(15) NOT NULL,
  `pin_num` int(4) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `balance` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`UID`, `firstname`, `lastname`, `address`, `phone_num`, `pin_num`, `email`, `password`, `balance`) VALUES
(1003, 'mark janzen', 'bandola', 'bahay', '09828288', 1234, 'e', '1', 5000),
(1004, 'Aeron', 'Clyde', 'home', '091203912', 1234, 'a', '2', 15100);

-- --------------------------------------------------------

--
-- Table structure for table `usr_transaction`
--

CREATE TABLE `usr_transaction` (
  `UID` int(11) NOT NULL,
  `transID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `transactions`
--
ALTER TABLE `transactions`
  ADD PRIMARY KEY (`transID`),
  ADD KEY `UID` (`UID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`UID`);

--
-- Indexes for table `usr_transaction`
--
ALTER TABLE `usr_transaction`
  ADD KEY `UID` (`UID`),
  ADD KEY `transID` (`transID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `transactions`
--
ALTER TABLE `transactions`
  MODIFY `transID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `UID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1005;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `transactions`
--
ALTER TABLE `transactions`
  ADD CONSTRAINT `transactions_ibfk_1` FOREIGN KEY (`UID`) REFERENCES `users` (`UID`);

--
-- Constraints for table `usr_transaction`
--
ALTER TABLE `usr_transaction`
  ADD CONSTRAINT `usr_transaction_ibfk_1` FOREIGN KEY (`UID`) REFERENCES `users` (`UID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `usr_transaction_ibfk_2` FOREIGN KEY (`transID`) REFERENCES `transactions` (`UID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
