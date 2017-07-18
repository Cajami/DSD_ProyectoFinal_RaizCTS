-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.2.6-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para bdraiz
DROP DATABASE IF EXISTS `bdraiz`;
CREATE DATABASE IF NOT EXISTS `bdraiz` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci */;
USE `bdraiz`;

-- Volcando estructura para tabla bdraiz.aprobacion
DROP TABLE IF EXISTS `aprobacion`;
CREATE TABLE IF NOT EXISTS `aprobacion` (
  `CODIGO_APROBACION` int(11) NOT NULL AUTO_INCREMENT,
  `CODIGO_AUTORIZACION` int(11) NOT NULL,
  `CODIGO_USUARIO` int(11) DEFAULT NULL,
  `COMENTARIO` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `FECHA_APROBACION` datetime DEFAULT NULL,
  PRIMARY KEY (`CODIGO_APROBACION`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla bdraiz.aprobacion: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `aprobacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `aprobacion` ENABLE KEYS */;

-- Volcando estructura para tabla bdraiz.cts
DROP TABLE IF EXISTS `cts`;
CREATE TABLE IF NOT EXISTS `cts` (
  `CODIGO_CTS` int(11) NOT NULL AUTO_INCREMENT,
  `CODIGO_USUARIO` int(11) NOT NULL,
  `FECHA_INGRESO` datetime NOT NULL,
  `FECHA_MODIFICA` datetime DEFAULT NULL,
  `FECHA_APERTURA` datetime DEFAULT NULL,
  `TASA` double NOT NULL,
  `ESTADO` char(1) COLLATE utf8_spanish_ci NOT NULL,
  `TRASLADO` char(1) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`CODIGO_CTS`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla bdraiz.cts: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `cts` DISABLE KEYS */;
/*!40000 ALTER TABLE `cts` ENABLE KEYS */;

-- Volcando estructura para tabla bdraiz.empleado
DROP TABLE IF EXISTS `empleado`;
CREATE TABLE IF NOT EXISTS `empleado` (
  `CODIGO_EMPLEADO` int(11) NOT NULL AUTO_INCREMENT,
  `CODIGO_PAIS` int(11) NOT NULL,
  `CODIGO_TIPDOC` int(11) NOT NULL,
  `NRO_DOC` varchar(11) COLLATE utf8_spanish_ci NOT NULL,
  `APELLIDO_PATERNO` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `APELLIDO_MATERNO` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `NOMBRES` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `FECHA_NACIMIENTO` datetime NOT NULL,
  `DOMICILIO` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `EMAIL` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `CODIGO_EMPRESA` int(11) NOT NULL,
  PRIMARY KEY (`CODIGO_EMPLEADO`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla bdraiz.empleado: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` (`CODIGO_EMPLEADO`, `CODIGO_PAIS`, `CODIGO_TIPDOC`, `NRO_DOC`, `APELLIDO_PATERNO`, `APELLIDO_MATERNO`, `NOMBRES`, `FECHA_NACIMIENTO`, `DOMICILIO`, `EMAIL`, `CODIGO_EMPRESA`) VALUES
	(1, 1, 1, '4423154', 'PEREZ', 'PADILLA', 'PEPITO', '1980-04-20 00:00:00', 'CALLE SIN NUMERO MZ O LT 15', 'PEPITO@GMAIL.COM', 1);
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;

-- Volcando estructura para tabla bdraiz.empresa
DROP TABLE IF EXISTS `empresa`;
CREATE TABLE IF NOT EXISTS `empresa` (
  `CODIGO_EMPRESA` int(11) NOT NULL AUTO_INCREMENT,
  `DESCRIPCION` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`CODIGO_EMPRESA`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla bdraiz.empresa: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `empresa` DISABLE KEYS */;
INSERT INTO `empresa` (`CODIGO_EMPRESA`, `DESCRIPCION`) VALUES
	(1, 'TELEFONICA'),
	(2, 'CIBERTEC'),
	(3, 'GLORIA'),
	(4, 'METRO'),
	(5, 'SAGA FALABELLA'),
	(6, 'COBRA PERU');
/*!40000 ALTER TABLE `empresa` ENABLE KEYS */;

-- Volcando estructura para tabla bdraiz.empresa_empleado
DROP TABLE IF EXISTS `empresa_empleado`;
CREATE TABLE IF NOT EXISTS `empresa_empleado` (
  `CODIGO_EMPRESA` int(11) NOT NULL,
  `CODIGO_EMPLEADO` int(11) NOT NULL,
  `CODIGO_CTS` int(11) NOT NULL,
  `REMUNERACION` double NOT NULL,
  PRIMARY KEY (`CODIGO_EMPRESA`),
  KEY `CODIGO_EMPLEADO` (`CODIGO_EMPLEADO`),
  KEY `CODIGO_CTS` (`CODIGO_CTS`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla bdraiz.empresa_empleado: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `empresa_empleado` DISABLE KEYS */;
/*!40000 ALTER TABLE `empresa_empleado` ENABLE KEYS */;

-- Volcando estructura para tabla bdraiz.excepcion_tasa
DROP TABLE IF EXISTS `excepcion_tasa`;
CREATE TABLE IF NOT EXISTS `excepcion_tasa` (
  `CODIGO_EXCEPCION` int(11) NOT NULL AUTO_INCREMENT,
  `CODIGO_PERFIL` int(11) DEFAULT NULL,
  `TASA_MINIMA` double DEFAULT NULL,
  PRIMARY KEY (`CODIGO_EXCEPCION`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla bdraiz.excepcion_tasa: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `excepcion_tasa` DISABLE KEYS */;
/*!40000 ALTER TABLE `excepcion_tasa` ENABLE KEYS */;

-- Volcando estructura para tabla bdraiz.pais
DROP TABLE IF EXISTS `pais`;
CREATE TABLE IF NOT EXISTS `pais` (
  `CODIGO_PAIS` int(11) NOT NULL AUTO_INCREMENT,
  `DESCRIPCION` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`CODIGO_PAIS`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla bdraiz.pais: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `pais` DISABLE KEYS */;
INSERT INTO `pais` (`CODIGO_PAIS`, `DESCRIPCION`) VALUES
	(1, 'PERU'),
	(2, 'ECUADOR'),
	(3, 'BRASIL'),
	(4, 'ARGENTINA');
/*!40000 ALTER TABLE `pais` ENABLE KEYS */;

-- Volcando estructura para tabla bdraiz.perfil
DROP TABLE IF EXISTS `perfil`;
CREATE TABLE IF NOT EXISTS `perfil` (
  `CODIGO_PERFIL` int(11) NOT NULL AUTO_INCREMENT,
  `DESCRIPCION` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`CODIGO_PERFIL`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla bdraiz.perfil: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `perfil` DISABLE KEYS */;
INSERT INTO `perfil` (`CODIGO_PERFIL`, `DESCRIPCION`) VALUES
	(1, 'FSO GERENTE DE FINANZAS'),
	(2, 'EJECUTIVO DE PLATAFORMA');
/*!40000 ALTER TABLE `perfil` ENABLE KEYS */;

-- Volcando estructura para tabla bdraiz.tipo_autorizacion
DROP TABLE IF EXISTS `tipo_autorizacion`;
CREATE TABLE IF NOT EXISTS `tipo_autorizacion` (
  `CODIGO_AUTORIZACION` int(11) NOT NULL AUTO_INCREMENT,
  `DESCRIPCION` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`CODIGO_AUTORIZACION`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla bdraiz.tipo_autorizacion: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `tipo_autorizacion` DISABLE KEYS */;
INSERT INTO `tipo_autorizacion` (`CODIGO_AUTORIZACION`, `DESCRIPCION`) VALUES
	(1, 'APROBACION'),
	(2, 'EXCEPCION');
/*!40000 ALTER TABLE `tipo_autorizacion` ENABLE KEYS */;

-- Volcando estructura para tabla bdraiz.tipo_documento
DROP TABLE IF EXISTS `tipo_documento`;
CREATE TABLE IF NOT EXISTS `tipo_documento` (
  `CODIGO_TIPODOCUMENTO` int(11) NOT NULL AUTO_INCREMENT,
  `DESCRIPCION` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`CODIGO_TIPODOCUMENTO`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla bdraiz.tipo_documento: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `tipo_documento` DISABLE KEYS */;
INSERT INTO `tipo_documento` (`CODIGO_TIPODOCUMENTO`, `DESCRIPCION`) VALUES
	(1, 'DNI'),
	(2, 'RUC'),
	(3, 'CARNET EXTRANJERIA');
/*!40000 ALTER TABLE `tipo_documento` ENABLE KEYS */;

-- Volcando estructura para tabla bdraiz.usuario
DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `CODIGO_USUARIO` int(11) NOT NULL AUTO_INCREMENT,
  `DESCRIPCION` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `FECHA_INGRESO` datetime NOT NULL,
  PRIMARY KEY (`CODIGO_USUARIO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla bdraiz.usuario: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;

-- Volcando estructura para tabla bdraiz.usuario_perfil
DROP TABLE IF EXISTS `usuario_perfil`;
CREATE TABLE IF NOT EXISTS `usuario_perfil` (
  `CODIGO_USUARIO` int(11) NOT NULL,
  `CODIGO_PERFIL` int(11) NOT NULL,
  `FECHA_VTO` int(11) NOT NULL,
  PRIMARY KEY (`CODIGO_USUARIO`),
  KEY `CODIGO_PERFIL` (`CODIGO_PERFIL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla bdraiz.usuario_perfil: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `usuario_perfil` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario_perfil` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
