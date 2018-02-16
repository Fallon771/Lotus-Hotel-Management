-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 16, 2018 at 07:02 PM
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
(11, 'Mr	', 'James', 'Fallon', 'No 2 Birchill Avenue\nCreeslough\nCo.Donegal	', '085-1269777', 'jamesafallon@yahoo.ie', '2018-02-02', '2018-02-17'),
(12, 'Mr	', 'Jane', 'O Reily', 'No 12 Blackthorn Grove,\nTrim,\nCo.Meath', '085-2343457', 'jane@yahoo.com', '2018-02-10', '2018-02-16'),
(13, 'Mr	', 'John', 'Johnston', '56 Elem Woods,\nPinewood,\nCo.Kerry\n', '043-5783928', 'john@gmail.com', '2018-02-03', '2018-02-16'),
(14, 'Dr', 'Maqwe', 'qwe', 'qweq', 'qweqw', 'qweqw', '2018-02-01', '2018-02-24'),
(15, 'Mr	', 'ollie', 'Murphy', 'No 78 Beeachwood\nMeath	', '082344233', 'murpght@asdasd@gmail.com', '2018-02-06', '2018-02-21');

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
(11, 0, 203, 1, 0),
(12, 0, 202, 2, 0),
(13, 1, 200, 2, 0),
(14, 0, 205, 3, 0),
(15, 0, 204, 2, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `guest`
--
ALTER TABLE `guest`
  ADD PRIMARY KEY (`id`);

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
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `rooms`
--
ALTER TABLE `rooms`
  ADD CONSTRAINT `rooms_ibfk_1` FOREIGN KEY (`id`) REFERENCES `guest` (`id`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
