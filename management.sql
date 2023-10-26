-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 26, 2023 at 01:53 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `university managemen t`
--

-- --------------------------------------------------------

--
-- Table structure for table `management`
--

CREATE TABLE `management` (
  `Name` varchar(50) NOT NULL,
  `Mentor` varchar(50) NOT NULL,
  `Roll_no` int(5) NOT NULL,
  `Div` varchar(5) NOT NULL,
  `Branch` varchar(10) NOT NULL,
  `Java-II` float NOT NULL,
  `Maths-II` float NOT NULL,
  `FEE` float NOT NULL,
  `DS` float NOT NULL,
  `DBMS` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `management`
--

INSERT INTO `management` (`Name`, `Mentor`, `Roll_no`, `Div`, `Branch`, `Java-II`, `Maths-II`, `FEE`, `DS`, `DBMS`) VALUES
(' RISHI NILESHKUMAR PATEL', 'Mr. Anuj D Bhatt', 1, 'D1', 'IT', 78, 88, 90, 81, 67),
(' PARTH ALKESH PATEL', 'Mr. Milan D Trivedi', 2, 'D1', 'CE', 81, 86, 86, 84, 76),
(' KANISHA MAHESHBHAI SHAH', 'Mr. Divyang B Patel', 3, 'D1', 'CE', 70, 85, 87, 90, 67),
(' ROMIT BHAVESHBHAI BHUPTANI', 'Mr. Dhruv H Parmar', 4, 'D1', 'CE', 79, 74, 84, 92, 56),
(' KESHAV RAVIKUMAR MITTAL', 'Mr. Diptesh R Patel', 5, 'D1', 'CE', 77, 82, 91, 77, 54),
(' OM SANJAYBHAI VEKARIYA', 'Ms. Jinal A Zala', 6, 'D1', 'CE', 86, 89, 77, 72, 75),
(' KRASHNA MUKESHBHAI MEHTA', 'Mr. Jaysan H. Shukla', 7, 'D1', 'CE', 72, 84, 86, 82, 45),
(' MAHIN SABBIRHUSEN VORA', 'Ms. Komal D Langalia', 8, 'D1', 'CE', 70, 87, 87, 79, 88),
(' ANSH MAHESH AGRAWAL', 'Mr. Vandan V Vyas', 9, 'D1', 'IT', 71, 90, 78, 83, 98),
(' AMENA AMIN SAIYED', 'Ms. Kamaldeep G Bhatia', 10, 'D1', 'IT', 67, 85, 81, 88, 34),
(' MANAV NITESHKUMAR MEHTA', 'Mr. Nikunj R Shingala', 11, 'D1', 'CE', 75, 84, 89, 71, 56),
(' ANSH PRAGNESHKUMAR PATEL', 'Mr. Nimish S Das', 12, 'D1', 'CE', 86, 75, 77, 80, 75),
(' HETAVI DHARMESH SHAH', 'Mr. Parimal N Akhenia', 13, 'D1', 'CE', 89, 80, 82, 66, 72),
(' SHIVANG NAROTTAMBHAI KOSTY', 'Mr. Chintan V Morsiya', 14, 'D1', 'CE', 78, 77, 82, 80, 66),
(' VANSH HARSHADBHAI VAGADIA', 'Mr. Vinod V Panara', 15, 'D1', 'IT', 76, 85, 78, 77, 55),
(' MALVIN KALPESHBHAI PATEL', 'Mr. Ankur R Patel', 16, 'D1', 'CE', 74, 87, 75, 79, 84),
(' KRINA RAMESHKUMAR LIMBACHIYA', 'Mr. Milan D Patel', 17, 'D1', 'CE', 65, 86, 82, 82, 81),
(' VANSH NIKUNJBHAI DESAI', 'Ms. Meghna M Parikh', 18, 'D1', 'CE', 61, 92, 82, 77, 93),
(' DHRUV LALITKUMAR JAIN', 'Mr. Ankit S Acharya', 19, 'D1', 'CE', 72, 86, 83, 71, 67),
(' KARAN SUNILKUMAR TILWANI', 'Mr. Diptesh R Patel', 20, 'D1', 'CE', 61, 79, 87, 85, 45),
(' KETUL KAMLESHKUMAR PATEL', 'Mr. Krunal S Patel', 21, 'D1', 'CE', 72, 81, 83, 74, 65),
(' PRUTHA AMITKUMAR UPADHYAY', 'Mr. Anuj D Bhatt', 22, 'D1', 'CE', 69, 80, 87, 73, 76),
('jay', 'Mr. Milan D Trivedi', 23, 'D1', 'CE', 65, 84, 83, 77, 87),
(' KRISHNA SANJAY BAROT', 'Mr. Divyang B Patel', 24, 'D1', 'IT', 61, 86, 81, 80, 98),
(' DHRUMIL NILESH TRADA', 'Mr. Dhruv H Parmar', 25, 'D1', 'CE', 71, 80, 84, 73, 62),
(' JAY PRAVINCHANDRA PATEL', 'Mr. Diptesh R Patel', 26, 'D1', 'IT', 74, 77, 80, 77, 54),
(' AMAN IQBALBHAI SHAIKH', 'Ms. Jinal A Zala', 27, 'D1', 'IT', 69, 79, 87, 72, 53),
(' GANPAT RAMESHWARLAL KUMAWAT', 'Mr. Jaysan H. Shukla', 28, 'D1', 'CE', 52, 94, 83, 78, 66),
(' ANSHUL MANISH MODI', 'Ms. Komal D Langalia', 29, 'D1', 'CE', 65, 86, 84, 72, 89),
(' MANSI RAJESHBHAI PATEL', 'Mr. Vandan V Vyas', 30, 'D1', 'CE', 59, 80, 89, 77, 87),
(' NIKHIL GUNVANTBHAI PANCHAL', 'Ms. Kamaldeep G Bhatia', 31, 'D2', 'CE', 67, 84, 84, 70, 85),
(' HARSH SANJAYKUMAR VAGHELA', 'Mr. Nikunj R Shingala', 32, 'D2', 'CE', 60, 80, 88, 77, 45),
(' AADIL HUSAIN SHAIKH', 'Mr. Nimish S Das', 33, 'D2', 'IT', 53, 82, 89, 78, 45),
('aaa', 'Mr. Parimal N Akhenia', 34, 'D2', 'CE', 63, 82, 79, 76, 35),
(' VANRAJSINH KALPESHKUMAR DESAI', 'Mr. Chintan V Morsiya', 35, 'D2', 'CE', 54, 80, 79, 86, 36),
(' KRISH RASIKBHAI VAGHASIYA', 'Mr. Vinod V Panara', 36, 'D2', 'CE', 60, 90, 84, 64, 76),
(' PARTH NIRAJ PATEL', 'Mr. Ankur R Patel', 37, 'D2', 'CE', 61, 81, 88, 67, 67),
(' HET SANJAYKUMAR SHAH', 'Mr. Milan D Patel', 38, 'D2', 'CE', 84, 77, 75, 60, 76),
(' SHUBHAM BHADRESHKUMAR PATEL', 'Ms. Meghna M Parikh', 39, 'D2', 'CE', 69, 82, 79, 66, 56),
(' VIDHAN SHAILESH SHAH', 'Mr. Ankit S Acharya', 40, 'D2', 'CE', 62, 78, 79, 76, 76),
(' BHARATBHAI PATEL DEV', 'Mr. Dhruv H Parmar', 41, 'D2', 'CE', 67, 84, 78, 66, 87),
(' DEVANSH KIRANBHAI THACKER', 'Mr. Krunal S Patel', 42, 'D2', 'CE', 58, 79, 83, 74, 44),
(' PARTH GUNVANTBHAI PATEL', 'Mr. Anuj D Bhatt', 43, 'D2', 'CE', 60, 88, 67, 79, 45),
(' AVANI GOVINDBHAI KATHIRIYA', 'Mr. Milan D Trivedi', 44, 'D2', 'CE', 59, 82, 76, 77, 47),
(' ARYA HARESHBHAI CHAUDHARI', 'Mr. Divyang B Patel', 45, 'D2', 'CE', 52, 74, 82, 85, 74),
(' TALHA ZAYNULABEDIN PIRZADA', 'Mr. Dhruv H Parmar', 46, 'D2', 'IT', 61, 80, 74, 77, 56),
(' ZENI ASHOKKUMAR CHAKALASIYA', 'Mr. Diptesh R Patel', 47, 'D2', 'CE', 56, 85, 77, 73, 78),
(' DHARMENDRA RAMCHANDRA LOHAR', 'Ms. Jinal A Zala', 48, 'D2', 'CE', 62, 79, 78, 72, 99),
(' JAINAM HEMAL SHAH', 'Mr. Jaysan H. Shukla', 49, 'D2', 'CE', 61, 77, 75, 77, 100),
(' INZAMAM IRSHAD SHAIKH', 'Ms. Komal D Langalia', 50, 'D2', 'IT', 89, 80, 62, 59, 45),
(' NAMRA VIJAYKUMAR MEVADA', 'Mr. Vandan V Vyas', 51, 'D2', 'IT', 52, 87, 86, 64, 67),
(' KHUSHI AIMESHKUMAR JANI', 'Ms. Kamaldeep G Bhatia', 52, 'D2', 'CE', 49, 77, 82, 80, 76),
(' KHUSH KIRITKUMAR PATEL', 'Mr. Nikunj R Shingala', 53, 'D2', 'CE', 61, 82, 72, 72, 56),
(' RUDRA BHAVESHBHAI PATEL', 'Mr. Nimish S Das', 54, 'D2', 'IT', 70, 74, 66, 77, 66),
(' PANTH KALPESHKUMAR GADANI', 'Mr. Parimal N Akhenia', 55, 'D2', 'CE', 64, 78, 77, 66, 76),
(' GUNJAN PRAVINBHAI GOGARI', 'Mr. Chintan V Morsiya', 56, 'D2', 'CE', 53, 76, 77, 79, 76),
(' SWAPNIL KIRAN BHANDARKAR', 'Mr. Vinod V Panara', 57, 'D2', 'CE', 52, 80, 81, 72, 33),
(' SHALEEN IKBALHUSEN KURESHI', 'Mr. Ankur R Patel', 58, 'D2', 'CE', 66, 56, 85, 77, 91),
(' AYUSH PARAG SHAH', 'Mr. Milan D Patel', 59, 'D2', 'CE', 59, 77, 73, 75, 82),
(' SALMANHAIDER GULAMHAIDER AGHARIYA', 'Ms. Meghna M Parikh', 60, 'D2', 'CE', 62, 81, 76, 65, 55),
('Jay Kapadia', 'ADB', 61, 'D9', 'CE', 67, 67, 76, 76, 67),
('ddf', 'df', 62, 'd9', 'ce', 67, 67, 67, 67, 67),
('Jay Kapadia', 'ADB', 63, 'D9', 'CE', 67, 76, 78, 77, 67);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `management`
--
ALTER TABLE `management`
  ADD PRIMARY KEY (`Roll_no`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
