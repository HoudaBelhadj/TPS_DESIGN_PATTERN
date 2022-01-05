-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : lun. 03 jan. 2022 à 00:05
-- Version du serveur :  5.7.31
-- Version de PHP : 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `banque`
--

-- --------------------------------------------------------

--
-- Structure de la table `batch_job_execution`
--

DROP TABLE IF EXISTS `batch_job_execution`;
CREATE TABLE IF NOT EXISTS `batch_job_execution` (
  `JOB_EXECUTION_ID` bigint(20) NOT NULL,
  `VERSION` bigint(20) DEFAULT NULL,
  `JOB_INSTANCE_ID` bigint(20) NOT NULL,
  `CREATE_TIME` datetime(6) NOT NULL,
  `START_TIME` datetime(6) DEFAULT NULL,
  `END_TIME` datetime(6) DEFAULT NULL,
  `STATUS` varchar(10) DEFAULT NULL,
  `EXIT_CODE` varchar(2500) DEFAULT NULL,
  `EXIT_MESSAGE` varchar(2500) DEFAULT NULL,
  `LAST_UPDATED` datetime(6) DEFAULT NULL,
  `JOB_CONFIGURATION_LOCATION` varchar(2500) DEFAULT NULL,
  PRIMARY KEY (`JOB_EXECUTION_ID`),
  KEY `JOB_INST_EXEC_FK` (`JOB_INSTANCE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `batch_job_execution`
--

INSERT INTO `batch_job_execution` (`JOB_EXECUTION_ID`, `VERSION`, `JOB_INSTANCE_ID`, `CREATE_TIME`, `START_TIME`, `END_TIME`, `STATUS`, `EXIT_CODE`, `EXIT_MESSAGE`, `LAST_UPDATED`, `JOB_CONFIGURATION_LOCATION`) VALUES
(1, 2, 1, '2021-12-08 12:29:41.135000', '2021-12-08 12:29:41.199000', '2021-12-08 12:29:41.383000', 'FAILED', 'FAILED', 'org.springframework.orm.jpa.JpaObjectRetrievalFailureException: Unable to find com.spring.batch.bank.entity.Compte with id 1; nested exception is javax.persistence.EntityNotFoundException: Unable to find com.spring.batch.bank.entity.Compte with id 1\r\n	at org.springframework.orm.jpa.EntityManagerFactoryUtils.convertJpaAccessExceptionIfPossible(EntityManagerFactoryUtils.java:379)\r\n	at org.springframework.orm.jpa.vendor.HibernateJpaDialect.translateExceptionIfPossible(HibernateJpaDialect.java:235)\r\n	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.translateExceptionIfPossible(AbstractEntityManagerFactoryBean.java:551)\r\n	at org.springframework.dao.support.ChainedPersistenceExceptionTranslator.translateExceptionIfPossible(ChainedPersistenceExceptionTranslator.java:61)\r\n	at org.springframework.dao.support.DataAccessUtils.translateIfNecessary(DataAccessUtils.java:242)\r\n	at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:152)\r\n	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)\r\n	at org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:174)\r\n	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)\r\n	at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:97)\r\n	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)\r\n	at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:215)\r\n	at com.sun.proxy.$Proxy98.save(Unknown Source)\r\n	at com.spring.batch.bank.batchProcessing.BankTransctionItemWriter.write(BankTransctionItemWriter.java:21)\r\n	at org.springframework.batch.core.step.item.SimpleChunkProcessor.writeItems(SimpleChunkProcessor.java:193)\r\n	at org.springframework.batch.core.step.item.SimpleChunkProcessor.doWrite(SimpleChunkProcessor.java:159)\r\n	at org.springframework.batch.core.step.item.SimpleChunkProcessor.write(SimpleChunkProcessor.java:294)\r\n	at org.springframework.batch.core.step.item.SimpleChunkProcessor.process(SimpleChunkProcessor.java:217)\r\n	at org.springframework.batch.core.step.item.ChunkOrientedTasklet.execute(ChunkOrientedTasklet.java:77)\r\n	at org.springframework.batch.core.step.tasklet.TaskletStep$Chu', '2021-12-08 12:29:41.383000', NULL),
(2, 2, 2, '2021-12-08 15:58:31.829000', '2021-12-08 15:58:31.898000', '2021-12-08 15:58:32.098000', 'COMPLETED', 'COMPLETED', '', '2021-12-08 15:58:32.098000', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `batch_job_execution_context`
--

DROP TABLE IF EXISTS `batch_job_execution_context`;
CREATE TABLE IF NOT EXISTS `batch_job_execution_context` (
  `JOB_EXECUTION_ID` bigint(20) NOT NULL,
  `SHORT_CONTEXT` varchar(2500) NOT NULL,
  `SERIALIZED_CONTEXT` text,
  PRIMARY KEY (`JOB_EXECUTION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `batch_job_execution_context`
--

INSERT INTO `batch_job_execution_context` (`JOB_EXECUTION_ID`, `SHORT_CONTEXT`, `SERIALIZED_CONTEXT`) VALUES
(1, '{\"@class\":\"java.util.HashMap\"}', NULL),
(2, '{\"@class\":\"java.util.HashMap\"}', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `batch_job_execution_params`
--

DROP TABLE IF EXISTS `batch_job_execution_params`;
CREATE TABLE IF NOT EXISTS `batch_job_execution_params` (
  `JOB_EXECUTION_ID` bigint(20) NOT NULL,
  `TYPE_CD` varchar(6) NOT NULL,
  `KEY_NAME` varchar(100) NOT NULL,
  `STRING_VAL` varchar(250) DEFAULT NULL,
  `DATE_VAL` datetime(6) DEFAULT NULL,
  `LONG_VAL` bigint(20) DEFAULT NULL,
  `DOUBLE_VAL` double DEFAULT NULL,
  `IDENTIFYING` char(1) NOT NULL,
  KEY `JOB_EXEC_PARAMS_FK` (`JOB_EXECUTION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `batch_job_execution_params`
--

INSERT INTO `batch_job_execution_params` (`JOB_EXECUTION_ID`, `TYPE_CD`, `KEY_NAME`, `STRING_VAL`, `DATE_VAL`, `LONG_VAL`, `DOUBLE_VAL`, `IDENTIFYING`) VALUES
(1, 'LONG', 'time', '', '1970-01-01 01:00:00.000000', 1638962981098, 0, 'Y'),
(2, 'LONG', 'time', '', '1970-01-01 01:00:00.000000', 1638975511798, 0, 'Y');

-- --------------------------------------------------------

--
-- Structure de la table `batch_job_execution_seq`
--

DROP TABLE IF EXISTS `batch_job_execution_seq`;
CREATE TABLE IF NOT EXISTS `batch_job_execution_seq` (
  `ID` bigint(20) NOT NULL,
  `UNIQUE_KEY` char(1) NOT NULL,
  UNIQUE KEY `UNIQUE_KEY_UN` (`UNIQUE_KEY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `batch_job_execution_seq`
--

INSERT INTO `batch_job_execution_seq` (`ID`, `UNIQUE_KEY`) VALUES
(2, '0');

-- --------------------------------------------------------

--
-- Structure de la table `batch_job_instance`
--

DROP TABLE IF EXISTS `batch_job_instance`;
CREATE TABLE IF NOT EXISTS `batch_job_instance` (
  `JOB_INSTANCE_ID` bigint(20) NOT NULL,
  `VERSION` bigint(20) DEFAULT NULL,
  `JOB_NAME` varchar(100) NOT NULL,
  `JOB_KEY` varchar(32) NOT NULL,
  PRIMARY KEY (`JOB_INSTANCE_ID`),
  UNIQUE KEY `JOB_INST_UN` (`JOB_NAME`,`JOB_KEY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `batch_job_instance`
--

INSERT INTO `batch_job_instance` (`JOB_INSTANCE_ID`, `VERSION`, `JOB_NAME`, `JOB_KEY`) VALUES
(1, 0, 'bank-data-loader-job', '36a57a1669b485b1292341faf72b3711'),
(2, 0, 'bank-data-loader-job', '5895ca1a21580dec276ce860c0ba2140');

-- --------------------------------------------------------

--
-- Structure de la table `batch_job_seq`
--

DROP TABLE IF EXISTS `batch_job_seq`;
CREATE TABLE IF NOT EXISTS `batch_job_seq` (
  `ID` bigint(20) NOT NULL,
  `UNIQUE_KEY` char(1) NOT NULL,
  UNIQUE KEY `UNIQUE_KEY_UN` (`UNIQUE_KEY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `batch_job_seq`
--

INSERT INTO `batch_job_seq` (`ID`, `UNIQUE_KEY`) VALUES
(2, '0');

-- --------------------------------------------------------

--
-- Structure de la table `batch_step_execution`
--

DROP TABLE IF EXISTS `batch_step_execution`;
CREATE TABLE IF NOT EXISTS `batch_step_execution` (
  `STEP_EXECUTION_ID` bigint(20) NOT NULL,
  `VERSION` bigint(20) NOT NULL,
  `STEP_NAME` varchar(100) NOT NULL,
  `JOB_EXECUTION_ID` bigint(20) NOT NULL,
  `START_TIME` datetime(6) NOT NULL,
  `END_TIME` datetime(6) DEFAULT NULL,
  `STATUS` varchar(10) DEFAULT NULL,
  `COMMIT_COUNT` bigint(20) DEFAULT NULL,
  `READ_COUNT` bigint(20) DEFAULT NULL,
  `FILTER_COUNT` bigint(20) DEFAULT NULL,
  `WRITE_COUNT` bigint(20) DEFAULT NULL,
  `READ_SKIP_COUNT` bigint(20) DEFAULT NULL,
  `WRITE_SKIP_COUNT` bigint(20) DEFAULT NULL,
  `PROCESS_SKIP_COUNT` bigint(20) DEFAULT NULL,
  `ROLLBACK_COUNT` bigint(20) DEFAULT NULL,
  `EXIT_CODE` varchar(2500) DEFAULT NULL,
  `EXIT_MESSAGE` varchar(2500) DEFAULT NULL,
  `LAST_UPDATED` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`STEP_EXECUTION_ID`),
  KEY `JOB_EXEC_STEP_FK` (`JOB_EXECUTION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `batch_step_execution`
--

INSERT INTO `batch_step_execution` (`STEP_EXECUTION_ID`, `VERSION`, `STEP_NAME`, `JOB_EXECUTION_ID`, `START_TIME`, `END_TIME`, `STATUS`, `COMMIT_COUNT`, `READ_COUNT`, `FILTER_COUNT`, `WRITE_COUNT`, `READ_SKIP_COUNT`, `WRITE_SKIP_COUNT`, `PROCESS_SKIP_COUNT`, `ROLLBACK_COUNT`, `EXIT_CODE`, `EXIT_MESSAGE`, `LAST_UPDATED`) VALUES
(1, 2, 'step-load-data', 1, '2021-12-08 12:29:41.233000', '2021-12-08 12:29:41.368000', 'FAILED', 0, 4, 0, 0, 0, 0, 0, 1, 'FAILED', 'org.springframework.orm.jpa.JpaObjectRetrievalFailureException: Unable to find com.spring.batch.bank.entity.Compte with id 1; nested exception is javax.persistence.EntityNotFoundException: Unable to find com.spring.batch.bank.entity.Compte with id 1\r\n	at org.springframework.orm.jpa.EntityManagerFactoryUtils.convertJpaAccessExceptionIfPossible(EntityManagerFactoryUtils.java:379)\r\n	at org.springframework.orm.jpa.vendor.HibernateJpaDialect.translateExceptionIfPossible(HibernateJpaDialect.java:235)\r\n	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.translateExceptionIfPossible(AbstractEntityManagerFactoryBean.java:551)\r\n	at org.springframework.dao.support.ChainedPersistenceExceptionTranslator.translateExceptionIfPossible(ChainedPersistenceExceptionTranslator.java:61)\r\n	at org.springframework.dao.support.DataAccessUtils.translateIfNecessary(DataAccessUtils.java:242)\r\n	at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:152)\r\n	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)\r\n	at org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:174)\r\n	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)\r\n	at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:97)\r\n	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)\r\n	at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:215)\r\n	at com.sun.proxy.$Proxy98.save(Unknown Source)\r\n	at com.spring.batch.bank.batchProcessing.BankTransctionItemWriter.write(BankTransctionItemWriter.java:21)\r\n	at org.springframework.batch.core.step.item.SimpleChunkProcessor.writeItems(SimpleChunkProcessor.java:193)\r\n	at org.springframework.batch.core.step.item.SimpleChunkProcessor.doWrite(SimpleChunkProcessor.java:159)\r\n	at org.springframework.batch.core.step.item.SimpleChunkProcessor.write(SimpleChunkProcessor.java:294)\r\n	at org.springframework.batch.core.step.item.SimpleChunkProcessor.process(SimpleChunkProcessor.java:217)\r\n	at org.springframework.batch.core.step.item.ChunkOrientedTasklet.execute(ChunkOrientedTasklet.java:77)\r\n	at org.springframework.batch.core.step.tasklet.TaskletStep$Chu', '2021-12-08 12:29:41.368000'),
(2, 3, 'step-load-data', 2, '2021-12-08 15:58:31.930000', '2021-12-08 15:58:32.098000', 'COMPLETED', 1, 4, 0, 4, 0, 0, 0, 0, 'COMPLETED', '', '2021-12-08 15:58:32.098000');

-- --------------------------------------------------------

--
-- Structure de la table `batch_step_execution_context`
--

DROP TABLE IF EXISTS `batch_step_execution_context`;
CREATE TABLE IF NOT EXISTS `batch_step_execution_context` (
  `STEP_EXECUTION_ID` bigint(20) NOT NULL,
  `SHORT_CONTEXT` varchar(2500) NOT NULL,
  `SERIALIZED_CONTEXT` text,
  PRIMARY KEY (`STEP_EXECUTION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `batch_step_execution_context`
--

INSERT INTO `batch_step_execution_context` (`STEP_EXECUTION_ID`, `SHORT_CONTEXT`, `SERIALIZED_CONTEXT`) VALUES
(1, '{\"@class\":\"java.util.HashMap\",\"FFIR1.read.count\":0,\"batch.taskletType\":\"org.springframework.batch.core.step.item.ChunkOrientedTasklet\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', NULL),
(2, '{\"@class\":\"java.util.HashMap\",\"FFIR1.read.count\":5,\"batch.taskletType\":\"org.springframework.batch.core.step.item.ChunkOrientedTasklet\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `batch_step_execution_seq`
--

DROP TABLE IF EXISTS `batch_step_execution_seq`;
CREATE TABLE IF NOT EXISTS `batch_step_execution_seq` (
  `ID` bigint(20) NOT NULL,
  `UNIQUE_KEY` char(1) NOT NULL,
  UNIQUE KEY `UNIQUE_KEY_UN` (`UNIQUE_KEY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `batch_step_execution_seq`
--

INSERT INTO `batch_step_execution_seq` (`ID`, `UNIQUE_KEY`) VALUES
(2, '0');

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

DROP TABLE IF EXISTS `compte`;
CREATE TABLE IF NOT EXISTS `compte` (
  `id_compte` bigint(20) NOT NULL,
  `solde` double NOT NULL,
  PRIMARY KEY (`id_compte`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `compte`
--

INSERT INTO `compte` (`id_compte`, `solde`) VALUES
(1, 26547.87),
(2, 309876.54),
(3, 236547.87),
(4, 319876.54);

-- --------------------------------------------------------

--
-- Structure de la table `compte_transaction_list`
--

DROP TABLE IF EXISTS `compte_transaction_list`;
CREATE TABLE IF NOT EXISTS `compte_transaction_list` (
  `compte_id_compte` bigint(20) NOT NULL,
  `transaction_list_id_transaction` bigint(20) NOT NULL,
  UNIQUE KEY `UK_eeatubf3k5bc4nloox2jn4o30` (`transaction_list_id_transaction`),
  KEY `FKh56qvcwx011y64oelcps0bmlx` (`compte_id_compte`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
CREATE TABLE IF NOT EXISTS `transaction` (
  `id_transaction` bigint(20) NOT NULL,
  `date_debit` datetime(6) DEFAULT NULL,
  `date_transaction` datetime(6) DEFAULT NULL,
  `montant` double NOT NULL,
  `compte_id_compte` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id_transaction`),
  KEY `FK328sgvhot4y9w3ytm3atcxm3b` (`compte_id_compte`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `transaction`
--

INSERT INTO `transaction` (`id_transaction`, `date_debit`, `date_transaction`, `montant`, `compte_id_compte`) VALUES
(1, '2021-12-08 15:58:31.976000', '2021-10-17 09:44:00.000000', 2000, 1),
(2, '2021-12-08 15:58:31.999000', '2021-10-18 10:54:00.000000', 1800, 2),
(3, '2021-12-08 15:58:31.999000', '2021-10-19 08:39:00.000000', 3000, 3),
(4, '2021-12-08 15:58:31.999000', '2021-10-19 08:39:00.000000', 4500, 4);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `batch_job_execution`
--
ALTER TABLE `batch_job_execution`
  ADD CONSTRAINT `JOB_INST_EXEC_FK` FOREIGN KEY (`JOB_INSTANCE_ID`) REFERENCES `batch_job_instance` (`JOB_INSTANCE_ID`);

--
-- Contraintes pour la table `batch_job_execution_context`
--
ALTER TABLE `batch_job_execution_context`
  ADD CONSTRAINT `JOB_EXEC_CTX_FK` FOREIGN KEY (`JOB_EXECUTION_ID`) REFERENCES `batch_job_execution` (`JOB_EXECUTION_ID`);

--
-- Contraintes pour la table `batch_job_execution_params`
--
ALTER TABLE `batch_job_execution_params`
  ADD CONSTRAINT `JOB_EXEC_PARAMS_FK` FOREIGN KEY (`JOB_EXECUTION_ID`) REFERENCES `batch_job_execution` (`JOB_EXECUTION_ID`);

--
-- Contraintes pour la table `batch_step_execution`
--
ALTER TABLE `batch_step_execution`
  ADD CONSTRAINT `JOB_EXEC_STEP_FK` FOREIGN KEY (`JOB_EXECUTION_ID`) REFERENCES `batch_job_execution` (`JOB_EXECUTION_ID`);

--
-- Contraintes pour la table `batch_step_execution_context`
--
ALTER TABLE `batch_step_execution_context`
  ADD CONSTRAINT `STEP_EXEC_CTX_FK` FOREIGN KEY (`STEP_EXECUTION_ID`) REFERENCES `batch_step_execution` (`STEP_EXECUTION_ID`);

--
-- Contraintes pour la table `compte_transaction_list`
--
ALTER TABLE `compte_transaction_list`
  ADD CONSTRAINT `FKh56qvcwx011y64oelcps0bmlx` FOREIGN KEY (`compte_id_compte`) REFERENCES `compte` (`id_compte`),
  ADD CONSTRAINT `FKma3w0snib7clcyjjca3tynpgc` FOREIGN KEY (`transaction_list_id_transaction`) REFERENCES `transaction` (`id_transaction`);

--
-- Contraintes pour la table `transaction`
--
ALTER TABLE `transaction`
  ADD CONSTRAINT `FK328sgvhot4y9w3ytm3atcxm3b` FOREIGN KEY (`compte_id_compte`) REFERENCES `compte` (`id_compte`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
