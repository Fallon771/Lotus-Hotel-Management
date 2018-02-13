-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 13, 2018 at 12:38 PM
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
  `fname` varchar(50) NOT NULL,
  `surname` varchar(50) NOT NULL,
  `address` varchar(200) NOT NULL,
  `title` varchar(20) NOT NULL,
  `checkin` date DEFAULT NULL,
  `checkout` date DEFAULT NULL,
  `phone` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `guest`
--

INSERT INTO `guest` (`id`, `fname`, `surname`, `address`, `title`, `checkin`, `checkout`, `phone`, `email`) VALUES
(7, 'Mary', 'Smith', 'No 49 Hermitage Glen\r\nKells\r\nCo.Meath', 'Mrs', '2018-02-01', '2018-02-23', '085-345678', 'marysmith@gmail.com'),
(11, 'James', 'Fallon', 'No 2 Birchill Avenue\nCreeslough\nCo.Donegal	', 'Mr	', '2018-02-02', '2018-02-17', '085-1269777', 'jamesafallon@yahoo.ie'),
(12, 'Jane', 'O Reily', 'No 12 Blackthorn Grove,\nTrim,\nCo.Meath', 'Mr	', '2018-02-10', '2018-02-16', '085-2343457', 'jane@yahoo.com'),
(13, 'John', 'Johnston', '56 Elem Woods,\nPinewood,\nCo.Kerry\n', 'Mr	', '2018-02-03', '2018-02-16', '043-5783928', 'john@gmail.com');

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
  `booked` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `guest`
--
ALTER TABLE `guest`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `guest`
--
ALTER TABLE `guest`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
