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
-- Table structure for table `faculty`
--

CREATE TABLE `faculty` (
  `fid` int(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `FAC_short_name` varchar(50) NOT NULL,
  `phone_no.` varchar(50) NOT NULL,
  `Email_Id` varchar(50) NOT NULL,
  `Subject` varchar(50) NOT NULL,
  `User_Id` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `faculty`
--

INSERT INTO `faculty` (`fid`, `Name`, `FAC_short_name`, `phone_no.`, `Email_Id`, `Subject`, `User_Id`, `Password`) VALUES
(1, 'Ms. Zalak Bhavsar', 'ZAB', '7227979979', 'zalak.bhavsar@ljinstitutes.edu.in', 'DBMS', 'ZAB1', 'ZalakBhavsar123'),
(2, 'Mr. Anuj Bhatt', 'ADB', '9712769945', 'anujbhatt_ljiet@ljinstitutes.edu.in', 'DBMS', 'ADB2', 'AnujBhatt123'),
(3, 'Mr. Milan D. Trivedi', 'MDT', '8511112792', 'milan.trivedi_ljiet@ljinstitutes.edu.in', 'DBMS', 'MDT3', 'MilanTrivedi123'),
(4, 'Mr. Divyang Patel', 'PDB', '7567779133', 'divyang.patel@ljku.edu.in', 'DBMS', 'PDB4', 'DivyangPatel123'),
(5, 'Mr.Dhruv Parmar', 'PDH', '9714411195', 'dhruv.parmar_ljiet@ljinstitutes.edu.in', 'DBMS', 'PDH5', 'DhruvParmar123'),
(6, 'Dr Diptesh Patel', 'PDR', '9408741450', 'dr.dipteshpatel_ljiet@ljinstitutes.edu.in', 'DBMS', 'PDR6', 'DipteshPatel123'),
(7, 'Ms. Jinal A Zala', 'JAZ', '9429658362', 'jinalba.parmar@ljinstitutes.edu.in', 'DS', 'JAZ7', 'JinalZala123'),
(8, 'Dr.Jaysan H. Shukla', 'JHS', '9099701954', 'jaysan.shukla@ljinstitutes.edu.in', 'DS', 'JHS8', 'JaysanShukla123'),
(9, 'Ms. Komal D Langalia', 'KDL', '7284824121', 'komal.langalia_ljiet@ljinstitutes.edu.in', 'DS', 'KDL9', 'KomalLangalia123'),
(10, 'Ms. Vandan Vyas', 'VVV', '7779006603', 'vandanbhai.vyas@ljku.edu.in', 'DS', 'VVV10', 'VandanVyas123'),
(11, 'Ms. Khushbu K Bhalodiya', 'KKB', '7405113538', 'khushbu.bhalodiya@ljinstitutes.edu.in', 'DS', 'KKB11', 'KhushbuBhadoliya123'),
(12, 'Dr. Kamaldeep G Bhatia', 'KGB', '9904828681', 'kamaldeep.bhatia@ljinstitutes.edu.in', 'FEE', 'KGB12', 'KamaldeepBhatia123'),
(13, 'Mr. Nikunj R Shingala', 'NRS', '9510157259', 'nikunj.shingala_ljiet@ljinstitutes.edu.in', 'FEE', 'NRS13', 'NikunjShingala123'),
(14, 'Mr. Nimish S Das', 'NSD', '8866736326', 'nimish.das@ljinstitutes.edu.in', 'FEE', 'NSD14', 'NimishDas123'),
(15, 'Mr. Parimal Akhenia', 'PNA', '9033477187', 'parimal.akhenia@ljku.edu.in', 'FEE', 'PNA15', 'ParimalAkhenia123'),
(16, 'Mr. Chintan Morsiya', 'CVM', '7405202455', 'chintan.morsiya_ljiet@ljinstitutes.edu.in', 'Java-II', 'CVM16', 'ChintanMorsiya123'),
(17, 'Mr. Vinod Panara', 'VVP', '8980933829', 'vinod.panara@ljinstitutes.edu.in', 'Java-II', 'VVP17', 'VinodPanara123'),
(18, 'Mr. Ankur Patel', 'ARP', '9904761188', 'ankur.patel@ljinstitutes.edu.in', 'JAVA-II', 'ARP18', 'AnkurPatel123'),
(19, 'Mr. Milan D Patel', 'MDP', '9408913131', 'milan.patel_ljiet@ljinstitutes.edu.in', 'JAVA-II', 'MDP19', 'MilanPatel123'),
(20, 'Meghna Parikh', 'MMP', '9979900128', 'meghna.parikh@ljinstitutes.edu.in', 'Maths-II', 'MMP20', 'MeghnaParekh123'),
(21, 'Dr. ANKIT S. ACHARYA', 'ASA', '9428101166', 'ankit.acharya@ljinstitutes.edu.in', 'Maths-II', 'ASA21', 'AnkitAcharya123'),
(22, 'Mr. Krunal S Patel', 'PKS', '9714033116', 'krunal.patel_ljiet@ljinstitutes.edu.in', 'Maths-II', 'PKS22', 'KrunalPatel123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `faculty`
--
ALTER TABLE `faculty`
  ADD PRIMARY KEY (`fid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `faculty`
--
ALTER TABLE `faculty`
  MODIFY `fid` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
