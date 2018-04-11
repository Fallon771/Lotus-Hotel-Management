-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 11, 2018 at 10:06 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `discount`
--

CREATE TABLE `discount` (
  `discountid` int(11) NOT NULL,
  `totalbill` int(11) NOT NULL,
  `extras` double NOT NULL,
  `increase` double NOT NULL,
  `decrease` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `guest`
--

CREATE TABLE `guest` (
  `id` int(20) NOT NULL,
  `title` varchar(20) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `surname` varchar(50) NOT NULL,
  `address` varchar(200) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `checkin` date DEFAULT NULL,
  `checkout` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `guest`
--

INSERT INTO `guest` (`id`, `title`, `fname`, `surname`, `address`, `phone`, `email`, `checkin`, `checkout`) VALUES
(57, 'Mr	', 'wwwww', 'wwwwww', 'wwwwww', 'wwwwwww', 'wwww', '2018-04-05', '2018-04-07'),
(63, 'Mr	', 'bb', 'bb', 'bb', 'bb', 'bb', '2018-04-06', '2018-04-15');

-- --------------------------------------------------------

--
-- Table structure for table `gueststore`
--

CREATE TABLE `gueststore` (
  `cusid` int(50) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `surname` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `address` varchar(100) NOT NULL,
  `title` varchar(20) NOT NULL,
  `phone` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gueststore`
--

INSERT INTO `gueststore` (`cusid`, `fname`, `surname`, `email`, `address`, `title`, `phone`) VALUES
(1, 'uuuuuu', 'uuuuuuu', 'uuuuuuuuuuu', 'uuuuuuuu', 'Mr	', 'uuuuuuu'),
(2, 'wwwwwwwwww', 'wwwwwwww', 'wwwwwwwwwww', 'wwwwwwww', 'Mr	', 'wwwwww'),
(3, 'wwww', 'wwwww', 'wwwwww', 'wwwwwwww', 'Mr	', 'wwwwww'),
(4, 'qq', 'qq', 'qq', 'qq', 'Mr	', 'qq'),
(5, 'vv', 'vv', 'vv', 'vv', 'Mr	', 'vv'),
(6, 'bb', 'bb', 'bb', 'bb', 'Mr	', 'bb'),
(7, 'Tina', 'Reilly', 'Tina@gmail.com', 'No 78 Biechill close', 'Mrs', '32423433'),
(8, 'qqq', 'qq', 'qqqqq', 'qqq', 'Mr	', 'qqqq'),
(9, 'wee', 'wew', 'wewqe', 'wewe', 'Mr	', 'wee');

-- --------------------------------------------------------

--
-- Table structure for table `packages`
--

CREATE TABLE `packages` (
  `packid` int(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  `totalbill` int(11) NOT NULL,
  `extras` double NOT NULL,
  `increase` double NOT NULL,
  `decrease` double NOT NULL,
  `comments` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `receptionist`
--

CREATE TABLE `receptionist` (
  `id` int(20) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `surname` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `receptionist`
--

INSERT INTO `receptionist` (`id`, `fname`, `surname`, `password`) VALUES
(10001, 'James', 'Fallon', 'linux'),
(10002, 'Mary', 'Smith', 'pass'),
(10001, 'James', 'Fallon', 'linux'),
(10002, 'Mary', 'Smith', 'pass');

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE `rooms` (
  `id` int(20) NOT NULL,
  `booked` tinyint(1) NOT NULL,
  `roomno` int(50) NOT NULL,
  `adults` int(11) NOT NULL,
  `children` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`id`, `booked`, `roomno`, `adults`, `children`) VALUES
(63, 1, 201, 1, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `discount`
--
ALTER TABLE `discount`
  ADD KEY `discountid` (`discountid`);

--
-- Indexes for table `guest`
--
ALTER TABLE `guest`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `gueststore`
--
ALTER TABLE `gueststore`
  ADD PRIMARY KEY (`cusid`);

--
-- Indexes for table `packages`
--
ALTER TABLE `packages`
  ADD KEY `gg` (`packid`),
  ADD KEY `packid` (`packid`);

--
-- Indexes for table `rooms`
--
ALTER TABLE `rooms`
  ADD KEY `id` (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `guest`
--
ALTER TABLE `guest`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=65;
--
-- AUTO_INCREMENT for table `gueststore`
--
ALTER TABLE `gueststore`
  MODIFY `cusid` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `discount`
--
ALTER TABLE `discount`
  ADD CONSTRAINT `discount` FOREIGN KEY (`discountid`) REFERENCES `packages` (`packid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `packages`
--
ALTER TABLE `packages`
  ADD CONSTRAINT `packCon` FOREIGN KEY (`packid`) REFERENCES `guest` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `rooms`
--
ALTER TABLE `rooms`
  ADD CONSTRAINT `rooms_ibfk_1` FOREIGN KEY (`id`) REFERENCES `guest` (`id`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
