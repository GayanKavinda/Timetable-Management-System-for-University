
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  HASINI
 * Created: May 18, 2021
 */

CREATE TABLE `lecturer` (
  `id` INTEGER PRIMARY KEY AUTOINCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `lect_id` varchar(45) DEFAULT NULL,
  `faculty` varchar(45) DEFAULT NULL,
  `department` varchar(45) DEFAULT NULL,
  `center` varchar(45) DEFAULT NULL,
  `building` varchar(45) DEFAULT NULL,
  `level` varchar(45) DEFAULT NULL,
  `rank` varchar(45) DEFAULT NULL
) ;

CREATE TABLE `subjects` (
  `id` INTEGER PRIMARY KEY AUTOINCREMENT,
  `off_year` varchar(2) DEFAULT NULL,
  `off_sem` varchar(2) DEFAULT NULL,
  `sub_name` varchar(50) DEFAULT NULL,
  `sub_code` varchar(7) DEFAULT NULL,
  `lec_hr` varchar(2) DEFAULT NULL,
  `tute_hr` varchar(2) DEFAULT NULL,
  `lab_hr` varchar(2) DEFAULT NULL,
  `eva_hr` varchar(2) DEFAULT NULL
) ;

CREATE TABLE `session` (
  `id` INTEGER PRIMARY KEY AUTOINCREMENT,
  `lect` varchar(45) DEFAULT NULL,
  `lect2` varchar(45) DEFAULT NULL,
  `code` varchar(15) DEFAULT NULL,
  `subject` varchar(45) DEFAULT NULL,
  `tag` varchar(15) DEFAULT NULL,
  `gID` varchar(45) DEFAULT NULL,
  `nostudent` integer DEFAULT NULL,
  `duration` varchar(45) DEFAULT NULL
) ;

create table `faculty`(
    `id` INTEGER PRIMARY KEY AUTOINCREMENT,
    `faculty` varchar(45) DEFAULT NULL
);

INSERT INTO `faculty` (name) VALUES ('Computing');
INSERT INTO `faculty` (name) VALUES ('Business');
INSERT INTO `faculty` (name) VALUES ('Engineering');
    
CREATE TABLE `building` (
  `id` INTEGER PRIMARY KEY AUTOINCREMENT,
  `name` varchar(20) DEFAULT NULL
) ;


CREATE TABLE 'academic' (
  'id' INTEGER PRIMARY KEY AUTOINCREMENT,
  'ys' varchar(45) DEFAULT NULL
);

CREATE TABLE `degree_program` (
  `id` INTEGER PRIMARY KEY AUTOINCREMENT,
  `dp` varchar(45) DEFAULT NULL
) ;

CREATE TABLE `groupNo` (
  `id` INTEGER PRIMARY KEY AUTOINCREMENT,
  `gNo` varchar(45) DEFAULT NULL
) ;

CREATE TABLE `subGroupNo` (
  `id` INTEGER PRIMARY KEY AUTOINCREMENT,
  `sGno` INTEGER DEFAULT NULL
) ;

CREATE TABLE `group_id` (
  `id` INTEGER PRIMARY KEY AUTOINCREMENT,
  `gId` varchar(45) DEFAULT NULL

CREATE TABLE `sub_group_id` (
  `id` INTEGER PRIMARY KEY AUTOINCREMENT,
  `subgId` varchar(45) DEFAULT NULL
) ;

CREATE TABLE `tag` (
  `id` INTEGER PRIMARY KEY AUTOINCREMENT,
  `tagId` varchar(45) DEFAULT NULL,
   `subject` varchar(45) DEFAULT NULL,
    `code` varchar(45) DEFAULT NULL,
    `rTag` varchar(45) DEFAULT NULL
) ;



