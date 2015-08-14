CREATE TABLE `batchCsvToDB`.`RAW_REPORT` (
  `DATE` VARCHAR(45) NOT NULL,
  `IMPRESSIONS` VARCHAR(45) NOT NULL,
  `CLICKS` VARCHAR(45) NOT NULL,
  `EARNING` VARCHAR(45) NOT NULL);

insert into `batchCsvToDB`.RAW_REPORT(`DATE`, `IMPRESSIONS`, `CLICKS`, `EARNING`) values ("today", "very good", "500", "70.0");

CREATE TABLE `batchCsvToDB`.`CITY` (
  `NAME` VARCHAR(45) NOT NULL,
  `CODE` VARCHAR(45) NOT NULL,
  `ID` VARCHAR(45) NOT NULL);

insert into `batchCsvToDB`.CITY(`NAME`, `CODE`, `ID`) values ("ala", "ma", "kota");