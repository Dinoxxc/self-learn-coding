CREATE TABLE Hotel (
    hotelNo INT PRIMARY KEY,
    hotelName VARCHAR(50),
    city VARCHAR(50)
);

CREATE TABLE Room (
    roomNo INT,
    hotelNo INT,
    type VARCHAR(20),
    price DECIMAL(10,2),
    PRIMARY KEY (roomNo, hotelNo),
    FOREIGN KEY (hotelNo) REFERENCES Hotel(hotelNo)
);

CREATE TABLE Booking (
    hotelNo INT,
    guestNo INT,
    dateFrom DATE,
    dateTo DATE,
    roomNo INT,
    PRIMARY KEY (hotelNo, guestNo, dateFrom),
    FOREIGN KEY (hotelNo, roomNo) REFERENCES Room(hotelNo, roomNo),
    FOREIGN KEY (guestNo) REFERENCES Guest(guestNo)
);

CREATE TABLE Guest (
    guestNo INT PRIMARY KEY,
    guestName VARCHAR(50),
    guestAddress VARCHAR(100)
);
