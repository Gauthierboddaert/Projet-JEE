-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : dim. 28 nov. 2021 à 13:13
-- Version du serveur : 5.7.31
-- Version de PHP : 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `ulcotheque`
--

-- --------------------------------------------------------

--
-- Structure de la table `auteurs`
--

DROP TABLE IF EXISTS `auteurs`;
CREATE TABLE IF NOT EXISTS `auteurs` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `datenaissance` date DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `auteurs`
--

INSERT INTO `auteurs` (`id`, `datenaissance`, `nom`, `prenom`) VALUES
(2, '2021-11-12', 'ARTHUR', 'PIERRE'),
(1, '2021-11-02', 'MOLIERE', 'Jean ');

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(18);

-- --------------------------------------------------------

--
-- Structure de la table `livres`
--

DROP TABLE IF EXISTS `livres`;
CREATE TABLE IF NOT EXISTS `livres` (
  `id` bigint(20) NOT NULL,
  `nbpages` int(11) DEFAULT NULL,
  `dateparution` datetime DEFAULT NULL,
  `editeur` varchar(255) DEFAULT NULL,
  `genre` varchar(255) DEFAULT NULL,
  `lieuxparution` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `id_auteur` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKexy73wafb6el7i7auytw4q84j` (`id_auteur`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `livres`
--

INSERT INTO `livres` (`id`, `nbpages`, `dateparution`, `editeur`, `genre`, `lieuxparution`, `nom`, `id_auteur`) VALUES
(16, NULL, '1222-12-12 00:00:00', 'FNKEZBJ', 'ROMAN', 'EZ?K', 'EAZD', 1),
(17, 21, '1332-02-21 00:00:00', 'NMKDAZ', 'POESIE', 'DAZ', 'DBJJAZLJD', 2);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
