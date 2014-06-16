-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2014 at 03:09 PM
-- Server version: 5.6.11
-- PHP Version: 5.5.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `labpro_bioskop`
--
CREATE DATABASE IF NOT EXISTS `labpro_bioskop` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `labpro_bioskop`;

-- --------------------------------------------------------

--
-- Table structure for table `movie`
--

CREATE TABLE IF NOT EXISTS `movie` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `length` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `movie`
--

INSERT INTO `movie` (`id`, `title`, `length`) VALUES
(1, 'Edge of Tomorrow', 100),
(2, 'The Oculus', 120),
(3, '300 : Rise of An Empire', 90),
(4, 'The Maleficent', 120),
(5, 'Debat Capres', 100),
(6, 'hello', 120),
(7, 'asdf', 123),
(8, 'movie', 123),
(9, 'a', 123);

-- --------------------------------------------------------

--
-- Table structure for table `show`
--

CREATE TABLE IF NOT EXISTS `show` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `movie_id` int(11) NOT NULL,
  `room_id` int(11) NOT NULL,
  `time` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `show`
--

INSERT INTO `show` (`id`, `movie_id`, `room_id`, `time`) VALUES
(1, 1, 1, 5),
(2, 2, 1, 1500),
(3, 5, 1, 10000);

-- --------------------------------------------------------

--
-- Table structure for table `ticket`
--

CREATE TABLE IF NOT EXISTS `ticket` (
  `id` int(11) NOT NULL,
  `show_id` int(11) NOT NULL,
  `ticket_no` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ticket`
--

INSERT INTO `ticket` (`id`, `show_id`, `ticket_no`) VALUES
(0, 1, 0),
(0, 1, 1),
(0, 1, 2),
(0, 1, 3),
(0, 1, 4),
(0, 1, 5),
(0, 1, 6),
(0, 1, 7),
(0, 1, 8),
(0, 1, 9),
(0, 1, 10),
(0, 1, 11),
(0, 1, 12),
(0, 1, 13),
(0, 1, 14),
(0, 1, 15),
(0, 1, 16),
(0, 1, 17),
(0, 1, 18),
(0, 1, 19),
(0, 1, 20),
(0, 1, 21),
(0, 1, 22),
(0, 1, 23),
(0, 1, 24),
(0, 1, 25),
(0, 1, 26),
(0, 1, 27),
(0, 1, 28),
(0, 1, 29),
(0, 1, 30),
(0, 1, 31),
(0, 1, 32),
(0, 1, 33),
(0, 1, 34),
(0, 1, 35),
(0, 1, 40),
(0, 1, 36),
(0, 1, 37),
(0, 1, 38),
(0, 1, 39),
(0, 1, 41),
(0, 1, 45),
(0, 1, 42),
(0, 1, 46),
(0, 1, 43),
(0, 1, 43),
(0, 1, 43),
(0, 1, 44),
(0, 1, 54),
(0, 2, 4),
(0, 1, 47),
(0, 1, 48),
(0, 1, 49),
(0, 1, 47),
(0, 1, 48),
(0, 1, 49),
(0, 1, 47),
(0, 1, 48),
(0, 1, 49),
(0, 1, 47),
(0, 1, 48),
(0, 1, 49),
(0, 1, 47),
(0, 1, 48),
(0, 1, 49),
(0, 1, 64),
(0, 1, 74),
(0, 1, 64),
(0, 1, 74),
(0, 1, 53),
(0, 1, 63),
(0, 1, 52),
(0, 1, 95);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
