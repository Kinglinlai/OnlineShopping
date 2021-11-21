CREATE TABLE `users` (
  `accountname` varchar(45) NOT NULL,
  `firstname` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  `phonenumber` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `confirmpassword` varchar(45) NOT NULL,
  PRIMARY KEY (`accountname`)
) ENGINE=InnoDB;

