-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-06-2017 a las 20:11:36
-- Versión del servidor: 10.1.10-MariaDB
-- Versión de PHP: 7.0.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de datos: `db_mytask`
--
CREATE DATABASE IF NOT EXISTS `db_mytask` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `db_mytask`;

DELIMITER $$
--
-- Procedimientos
--
DROP PROCEDURE IF EXISTS `SP_LoginUser`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `SP_LoginUser` (IN `_UserName` VARCHAR(50), IN `_UserPassword` VARCHAR(50))  BEGIN
  SELECT * FROM user
    WHERE
    UserName = _UserName AND
        UserPassword = _UserPassword;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `task`
--

DROP TABLE IF EXISTS `task`;
CREATE TABLE IF NOT EXISTS `task` (
  `TaskId` int(11) NOT NULL AUTO_INCREMENT,
  `TaskIdFather` int(11) DEFAULT NULL,
  `RegisterUserId` int(11) NOT NULL,
  `ResponsibleUserId` int(11) NOT NULL,
  `TaskTitle` varchar(50) NOT NULL,
  `TaskDescription` text NOT NULL,
  `TaskType` varchar(10) NOT NULL,
  `TaskStartDate` datetime NOT NULL,
  `TaskEndDate` datetime DEFAULT NULL,
  `TaskPriorityLevel` int(11) NOT NULL,
  `TaskStatus` int(11) NOT NULL,
  PRIMARY KEY (`TaskId`),
  KEY `fk_task_user_idx` (`RegisterUserId`),
  KEY `fk_task_user1_idx` (`ResponsibleUserId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `UserId` int(11) NOT NULL AUTO_INCREMENT,
  `UserName` varchar(50) NOT NULL,
  `UserPassword` varchar(50) NOT NULL,
  `UserStatus` bit(1) NOT NULL,
  PRIMARY KEY (`UserId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`UserId`, `UserName`, `UserPassword`, `UserStatus`) VALUES
(1, 'xjeanxx', '1234', b'1');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `task`
--
ALTER TABLE `task`
  ADD CONSTRAINT `fk_task_user` FOREIGN KEY (`RegisterUserId`) REFERENCES `user` (`UserId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_task_user1` FOREIGN KEY (`ResponsibleUserId`) REFERENCES `user` (`UserId`) ON DELETE NO ACTION ON UPDATE NO ACTION;
