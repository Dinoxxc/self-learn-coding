SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

CREATE DATABASE IF NOT EXISTS hotel_db;
USE hotel_db;

CREATE TABLE `booking_` (
  `hotelNo` bigint(3) NOT NULL,
  `guestNo` bigint(3) NOT NULL,
  `dateFrom` datetime(6) NOT NULL,
  `dateTo` datetime(6) NOT NULL,
  `roomNo` bigint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `guest_` (
  `guestNo` bigint(3) NOT NULL,
  `guestName` varchar(15) NOT NULL,
  `guestAddress` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `hotel_` (
  `hotelNo` bigint(3) NOT NULL,
  `hotelName` varchar(50) NOT NULL,
  `city` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `room_` (
  `roomNo` bigint(1) NOT NULL,
  `hotelNo` bigint(3) NOT NULL,
  `type` varchar(20) NOT NULL,
  `price` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

ALTER TABLE `booking_`
  ADD PRIMARY KEY (`hotelNo`, `guestNo`, `dateFrom`),
  ADD KEY `roomNo` (`roomNo`),
  ADD CONSTRAINT `booking__ibfk_1` FOREIGN KEY (`hotelNo`, `roomNo`) REFERENCES `room_` (`hotelNo`, `roomNo`),
  ADD CONSTRAINT `booking__ibfk_2` FOREIGN KEY (`guestNo`) REFERENCES `guest_` (`guestNo`);

ALTER TABLE `guest_`
  ADD PRIMARY KEY (`guestNo`);

ALTER TABLE `hotel_`
  ADD PRIMARY KEY (`hotelNo`);

ALTER TABLE `room_`
  ADD PRIMARY KEY (`roomNo`, `hotelNo`),
  ADD CONSTRAINT `room__ibfk_1` FOREIGN KEY (`hotelNo`) REFERENCES `hotel_` (`hotelNo`);

CREATE VIEW View_Hotel_Room AS
SELECT h.hotelNo, h.hotelName, h.city, r.roomNo, r.type, r.price
FROM hotel_ h
INNER JOIN room_ r ON h.hotelNo = r.hotelNo;

CREATE VIEW View_Booking AS
SELECT h.hotelNo, h.hotelName, h.city, g.guestNo, g.guestName, g.guestAddress, b.dateFrom, b.dateTo, r.roomNo, r.type, r.price
FROM hotel_ h
INNER JOIN room_ r ON h.hotelNo = r.hotelNo
INNER JOIN booking_ b ON r.hotelNo = b.hotelNo AND r.roomNo = b.roomNo
INNER JOIN guest_ g ON b.guestNo = g.guestNo;

CREATE VIEW View_Booking_Hotel AS
SELECT h.hotelNo, h.hotelName, h.city, COUNT(b.guestNo) AS total_guests
FROM hotel_ h
LEFT JOIN booking_ b ON h.hotelNo = b.hotelNo
GROUP BY h.hotelNo;

COMMIT;
