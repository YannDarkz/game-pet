CREATE SCHEMA `petlove` ;

CREATE TABLE `petlove`.`usuarios` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `First_name` VARCHAR(20) NOT NULL,
  `Last_name` VARCHAR(20) NOT NULL,
  `Age` INT NOT NULL,
  `Email` VARCHAR(60) NOT NULL,
  `Whatsapp` VARCHAR(14) NULL,
  `Addres` VARCHAR(60) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `Email_UNIQUE` (`Email`)
);